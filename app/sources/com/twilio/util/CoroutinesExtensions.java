package com.twilio.util;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineContext3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.Supervisor3;

/* compiled from: CoroutinesExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032#\b\u0002\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, m3636d2 = {"newChildCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "jobFactory", "Lkotlin/Function1;", "Lkotlinx/coroutines/Job;", "Lkotlin/ParameterName;", "name", "parent", "shared-internal_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.twilio.util.CoroutinesExtensionsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class CoroutinesExtensions {

    /* compiled from: CoroutinesExtensions.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    @SourceDebugExtension
    /* renamed from: com.twilio.util.CoroutinesExtensionsKt$newChildCoroutineScope$1 */
    public /* synthetic */ class C435201 extends FunctionReferenceImpl implements Function1<Job, CompletableJob> {
        public static final C435201 INSTANCE = new C435201();

        public C435201() {
            super(1, Supervisor3.class, "SupervisorJob", "SupervisorJob(Lkotlinx/coroutines/Job;)Lkotlinx/coroutines/CompletableJob;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CompletableJob invoke(Job job) {
            return Supervisor3.SupervisorJob(job);
        }
    }

    public static /* synthetic */ CoroutineScope newChildCoroutineScope$default(CoroutineScope coroutineScope, CoroutineContext context, Function1 jobFactory, int i, Object obj) {
        if ((i & 1) != 0) {
            context = CoroutineContextImpl6.INSTANCE;
        }
        if ((i & 2) != 0) {
            jobFactory = C435201.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jobFactory, "jobFactory");
        return CoroutineScope2.CoroutineScope(CoroutineContext3.newCoroutineContext(coroutineScope, context.plus((Job) jobFactory.invoke(JobKt.getJob(coroutineScope.getCoroutineContext())))));
    }

    public static final CoroutineScope newChildCoroutineScope(CoroutineScope coroutineScope, CoroutineContext context, Function1<? super Job, ? extends Job> jobFactory) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jobFactory, "jobFactory");
        return CoroutineScope2.CoroutineScope(CoroutineContext3.newCoroutineContext(coroutineScope, context.plus(jobFactory.invoke(JobKt.getJob(coroutineScope.getCoroutineContext())))));
    }
}
