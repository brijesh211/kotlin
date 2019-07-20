/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.expressions.impl

import com.intellij.psi.PsiElement
import org.jetbrains.kotlin.fir.expressions.FirExpression
import org.jetbrains.kotlin.fir.expressions.FirUncheckedNotNullCast

class FirUncheckedNotNullCastImpl(psi: PsiElement?, expression: FirExpression) : FirUncheckedNotNullCast(psi) {
    init {
        arguments += expression
    }
}

