package com.robinhood.android.transfers.p271ui.max.rtp;

import com.robinhood.android.lib.transfers.AchTransferOption;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AchTransferOptionsSelectorDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/rtp/AchTransferOptionsSelectorDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/transfers/ui/max/rtp/AchTransferOptionsSelectorViewState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;)V", "selectOption", "", "userSelectedAchTransferOption", "Lcom/robinhood/android/lib/transfers/AchTransferOption;", "updateBundle", "bundle", "Lcom/robinhood/android/transfers/ui/max/rtp/AchTransferOptionsSelectorBundle;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class AchTransferOptionsSelectorDuxo extends BaseDuxo4<AchTransferOptionsSelectorViewState> {
    public static final int $stable = BaseDuxo4.$stable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AchTransferOptionsSelectorDuxo(DuxoBundle duxoBundle) {
        super(new AchTransferOptionsSelectorViewState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
    }

    /* compiled from: AchTransferOptionsSelectorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/rtp/AchTransferOptionsSelectorViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.rtp.AchTransferOptionsSelectorDuxo$selectOption$1", m3645f = "AchTransferOptionsSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.rtp.AchTransferOptionsSelectorDuxo$selectOption$1 */
    static final class C309871 extends ContinuationImpl7 implements Function2<AchTransferOptionsSelectorViewState, Continuation<? super AchTransferOptionsSelectorViewState>, Object> {
        final /* synthetic */ AchTransferOption $userSelectedAchTransferOption;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C309871(AchTransferOption achTransferOption, Continuation<? super C309871> continuation) {
            super(2, continuation);
            this.$userSelectedAchTransferOption = achTransferOption;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C309871 c309871 = new C309871(this.$userSelectedAchTransferOption, continuation);
            c309871.L$0 = obj;
            return c309871;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AchTransferOptionsSelectorViewState achTransferOptionsSelectorViewState, Continuation<? super AchTransferOptionsSelectorViewState> continuation) {
            return ((C309871) create(achTransferOptionsSelectorViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AchTransferOptionsSelectorViewState.copy$default((AchTransferOptionsSelectorViewState) this.L$0, this.$userSelectedAchTransferOption, null, 2, null);
        }
    }

    public final void selectOption(AchTransferOption userSelectedAchTransferOption) {
        applyMutation(new C309871(userSelectedAchTransferOption, null));
    }

    /* compiled from: AchTransferOptionsSelectorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/rtp/AchTransferOptionsSelectorViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.rtp.AchTransferOptionsSelectorDuxo$updateBundle$1", m3645f = "AchTransferOptionsSelectorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.rtp.AchTransferOptionsSelectorDuxo$updateBundle$1 */
    static final class C309881 extends ContinuationImpl7 implements Function2<AchTransferOptionsSelectorViewState, Continuation<? super AchTransferOptionsSelectorViewState>, Object> {
        final /* synthetic */ AchTransferOptionsSelectorBundle $bundle;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C309881(AchTransferOptionsSelectorBundle achTransferOptionsSelectorBundle, Continuation<? super C309881> continuation) {
            super(2, continuation);
            this.$bundle = achTransferOptionsSelectorBundle;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C309881 c309881 = new C309881(this.$bundle, continuation);
            c309881.L$0 = obj;
            return c309881;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AchTransferOptionsSelectorViewState achTransferOptionsSelectorViewState, Continuation<? super AchTransferOptionsSelectorViewState> continuation) {
            return ((C309881) create(achTransferOptionsSelectorViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            AchTransferOption selectedAchTransferOption$feature_transfers_externalRelease;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AchTransferOptionsSelectorViewState achTransferOptionsSelectorViewState = (AchTransferOptionsSelectorViewState) this.L$0;
            UiEvent<AchTransferOption> achTransferOptionSelectionOverride = this.$bundle.getAchTransferOptionSelectionOverride();
            if (achTransferOptionSelectionOverride == null || (selectedAchTransferOption$feature_transfers_externalRelease = achTransferOptionSelectionOverride.consume()) == null) {
                selectedAchTransferOption$feature_transfers_externalRelease = achTransferOptionsSelectorViewState.getSelectedAchTransferOption$feature_transfers_externalRelease();
            }
            return achTransferOptionsSelectorViewState.copy(selectedAchTransferOption$feature_transfers_externalRelease, this.$bundle);
        }
    }

    public final void updateBundle(AchTransferOptionsSelectorBundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        applyMutation(new C309881(bundle, null));
    }
}
