package org.apache.mahout.math.drm.logical

import org.apache.mahout.math.drm.DrmLike
import scala.reflect.ClassTag

/** Parallelism operator */
case class OpPar[K: ClassTag](
    override var A: DrmLike[K],
    val minSplits: Int = -1,
    val exactSplits: Int = -1)
    extends AbstractUnaryOp[K, K] {

  /** R-like syntax for number of rows. */
  def nrow: Long = A.nrow

  /** R-like syntax for number of columns */
  def ncol: Int = A.ncol
}
