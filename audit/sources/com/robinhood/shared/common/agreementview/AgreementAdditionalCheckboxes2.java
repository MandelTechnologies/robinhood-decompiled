package com.robinhood.shared.common.agreementview;

import androidx.compose.runtime.SnapshotState4;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AgreementAdditionalCheckboxes.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxesKt$AgreementAdditionalCheckboxes$2$1", m3645f = "AgreementAdditionalCheckboxes.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxesKt$AgreementAdditionalCheckboxes$2$1, reason: use source file name */
/* loaded from: classes26.dex */
final class AgreementAdditionalCheckboxes2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState4<Boolean> $allCheckboxesChecked$delegate;
    final /* synthetic */ Function1<Boolean, Unit> $onAllCheckboxesCheckedChanged;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AgreementAdditionalCheckboxes2(Function1<? super Boolean, Unit> function1, SnapshotState4<Boolean> snapshotState4, Continuation<? super AgreementAdditionalCheckboxes2> continuation) {
        super(2, continuation);
        this.$onAllCheckboxesCheckedChanged = function1;
        this.$allCheckboxesChecked$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AgreementAdditionalCheckboxes2(this.$onAllCheckboxesCheckedChanged, this.$allCheckboxesChecked$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AgreementAdditionalCheckboxes2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.$onAllCheckboxesCheckedChanged.invoke(boxing.boxBoolean(AgreementAdditionalCheckboxes.AgreementAdditionalCheckboxes$lambda$7(this.$allCheckboxesChecked$delegate)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
