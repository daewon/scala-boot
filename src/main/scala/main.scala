package com.daewon.scala

object main extends App {
  def perm[T](ls: List[T]): List[List[Any]] = ls match {
    case List(n) => List(List(n))
    case _ => {
      ls.flatMap { n =>
        perm(ls.filter(_ != n)).map { subs =>
          n :: subs
        }
      }
    }
      //for (n <- ls; sub <- perm(ls.filter(_ != n))) yield n :: sub
  }

  println(perm(List(1, 2, 3)))
}
