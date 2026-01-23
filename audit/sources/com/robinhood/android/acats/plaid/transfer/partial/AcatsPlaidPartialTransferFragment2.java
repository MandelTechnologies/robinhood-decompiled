package com.robinhood.android.acats.plaid.transfer.partial;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.analytics.EventLogger;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AcatsPlaidPartialTransferFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferFragment$ComposeContent$1$1", m3645f = "AcatsPlaidPartialTransferFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsPlaidPartialTransferFragment2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AcatsPlaidPartialTransferAssetRowData $currentEditAsset;
    final /* synthetic */ SnapshotState<AcatsPlaidPartialTransferAssetRowData> $lastEditAsset$delegate;
    int label;
    final /* synthetic */ AcatsPlaidPartialTransferFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsPlaidPartialTransferFragment2(AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, SnapshotState<AcatsPlaidPartialTransferAssetRowData> snapshotState, AcatsPlaidPartialTransferFragment acatsPlaidPartialTransferFragment, Continuation<? super AcatsPlaidPartialTransferFragment2> continuation) {
        super(2, continuation);
        this.$currentEditAsset = acatsPlaidPartialTransferAssetRowData;
        this.$lastEditAsset$delegate = snapshotState;
        this.this$0 = acatsPlaidPartialTransferFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AcatsPlaidPartialTransferFragment2(this.$currentEditAsset, this.$lastEditAsset$delegate, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AcatsPlaidPartialTransferFragment2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowDataComposeContent$lambda$2 = AcatsPlaidPartialTransferFragment.ComposeContent$lambda$2(this.$lastEditAsset$delegate);
            if (acatsPlaidPartialTransferAssetRowDataComposeContent$lambda$2 != null) {
                if (Intrinsics.areEqual(acatsPlaidPartialTransferAssetRowDataComposeContent$lambda$2, this.$currentEditAsset)) {
                    acatsPlaidPartialTransferAssetRowDataComposeContent$lambda$2 = null;
                }
                if (acatsPlaidPartialTransferAssetRowDataComposeContent$lambda$2 != null) {
                    AcatsPlaidPartialTransferFragment acatsPlaidPartialTransferFragment = this.this$0;
                    EventLogger.DefaultImpls.logScreenDisappear$default(acatsPlaidPartialTransferFragment.getEventLogger(), null, new Screen(Screen.Name.ACATS_IN_EDIT_ASSET, null, acatsPlaidPartialTransferAssetRowDataComposeContent$lambda$2.editLoggingIdentifier(), null, 10, null), null, null, acatsPlaidPartialTransferFragment.getScreenEventContext(), 13, null);
                }
            }
            AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData = this.$currentEditAsset;
            if (acatsPlaidPartialTransferAssetRowData != null) {
                AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData2 = Intrinsics.areEqual(acatsPlaidPartialTransferAssetRowData, AcatsPlaidPartialTransferFragment.ComposeContent$lambda$2(this.$lastEditAsset$delegate)) ? null : acatsPlaidPartialTransferAssetRowData;
                if (acatsPlaidPartialTransferAssetRowData2 != null) {
                    AcatsPlaidPartialTransferFragment acatsPlaidPartialTransferFragment2 = this.this$0;
                    EventLogger.DefaultImpls.logScreenAppear$default(acatsPlaidPartialTransferFragment2.getEventLogger(), null, new Screen(Screen.Name.ACATS_IN_EDIT_ASSET, null, acatsPlaidPartialTransferAssetRowData2.editLoggingIdentifier(), null, 10, null), null, null, acatsPlaidPartialTransferFragment2.getScreenEventContext(), 13, null);
                }
            }
            this.$lastEditAsset$delegate.setValue(this.$currentEditAsset);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
