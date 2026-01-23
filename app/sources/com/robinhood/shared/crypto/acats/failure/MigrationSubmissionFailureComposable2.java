package com.robinhood.shared.crypto.acats.failure;

import android.content.Context;
import android.net.Uri;
import com.robinhood.android.navigation.Navigator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MigrationSubmissionFailureComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.acats.failure.MigrationSubmissionFailureComposableKt$MigrationSubmissionFailureComposable$1$1$1$1$1$1$1", m3645f = "MigrationSubmissionFailureComposable.kt", m3646l = {91}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.acats.failure.MigrationSubmissionFailureComposableKt$MigrationSubmissionFailureComposable$1$1$1$1$1$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class MigrationSubmissionFailureComposable2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $deeplink;
    final /* synthetic */ Navigator $navigator;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MigrationSubmissionFailureComposable2(Navigator navigator, Context context, String str, Continuation<? super MigrationSubmissionFailureComposable2> continuation) {
        super(2, continuation);
        this.$navigator = navigator;
        this.$context = context;
        this.$deeplink = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MigrationSubmissionFailureComposable2(this.$navigator, this.$context, this.$deeplink, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MigrationSubmissionFailureComposable2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Navigator navigator = this.$navigator;
            Context context = this.$context;
            Uri uri = Uri.parse(this.$deeplink);
            this.label = 1;
            if (Navigator.DefaultImpls.handleDeepLinkDirect$default(navigator, context, uri, false, false, null, this, 28, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
