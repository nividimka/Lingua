package kz.dkgroup.lingua.di.scope

import java.lang.annotation.RetentionPolicy
import javax.inject.Scope
import kotlin.annotation.Retention
import kotlin.annotation.MustBeDocumented


@MustBeDocumented
@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ActivityScope
