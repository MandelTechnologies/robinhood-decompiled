package com.robinhood.shared.posttransfer;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.TransferTimelineStore;
import com.robinhood.models.api.bonfire.ApiPostTransferPage;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.shared.posttransfer.DynamicPostTransferTimelineFragment;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* compiled from: DynamicPostTransferTimelineDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0015B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/DynamicPostTransferTimelineDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/shared/posttransfer/DynamicPostTransferTimelineViewState;", "Lcom/robinhood/shared/posttransfer/DynamicPostTransferTimelineEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "transferTimelineStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferTimelineStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/TransferTimelineStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "transferId", "", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "onResume", "", "Companion", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class DynamicPostTransferTimelineDuxo extends BaseDuxo5<DynamicPostTransferTimelineViewState, DynamicPostTransferTimelineEvent> implements HasSavedState {
    private final MAXTransferContext.EntryPoint entryPoint;
    private final SavedStateHandle savedStateHandle;
    private final String transferId;
    private final TransferTimelineStore transferTimelineStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DynamicPostTransferTimelineDuxo(TransferTimelineStore transferTimelineStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(transferTimelineStore, "transferTimelineStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new DynamicPostTransferTimelineViewState(((DynamicPostTransferTimelineFragment.Args) companion.getArgs(savedStateHandle)).getTimeline().getModel()), duxoBundle);
        this.transferTimelineStore = transferTimelineStore;
        this.savedStateHandle = savedStateHandle;
        this.transferId = ((DynamicPostTransferTimelineFragment.Args) companion.getArgs((HasSavedState) this)).getTransferId();
        this.entryPoint = ((DynamicPostTransferTimelineFragment.Args) companion.getArgs((HasSavedState) this)).getEntryPoint();
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        Observable map = asObservable(Endpoint8.backendPoll$default(this.transferTimelineStore.getEndpoint(), new TransferTimelineStore.GetTransferTimelineRequestArgs(this.transferId, this.entryPoint.getValue()), null, null, 6, null)).map(new Function() { // from class: com.robinhood.shared.posttransfer.DynamicPostTransferTimelineDuxo.onResume.1
            @Override // io.reactivex.functions.Function
            public final Optional<ApiPostTransferPage.DynamicPostTransferTimeline> apply(Response<ApiPostTransferPage.DynamicPostTransferTimeline> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.body());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.filterIsPresent(map), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.posttransfer.DynamicPostTransferTimelineDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DynamicPostTransferTimelineDuxo.onResume$lambda$0(this.f$0, (ApiPostTransferPage.DynamicPostTransferTimeline) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(DynamicPostTransferTimelineDuxo dynamicPostTransferTimelineDuxo, ApiPostTransferPage.DynamicPostTransferTimeline dynamicTimeline) {
        Intrinsics.checkNotNullParameter(dynamicTimeline, "dynamicTimeline");
        dynamicPostTransferTimelineDuxo.applyMutation(new DynamicPostTransferTimelineDuxo2(dynamicTimeline, null));
        return Unit.INSTANCE;
    }

    /* compiled from: DynamicPostTransferTimelineDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/DynamicPostTransferTimelineDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/posttransfer/DynamicPostTransferTimelineDuxo;", "Lcom/robinhood/shared/posttransfer/DynamicPostTransferTimelineFragment$Args;", "<init>", "()V", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DynamicPostTransferTimelineDuxo, DynamicPostTransferTimelineFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DynamicPostTransferTimelineFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (DynamicPostTransferTimelineFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DynamicPostTransferTimelineFragment.Args getArgs(DynamicPostTransferTimelineDuxo dynamicPostTransferTimelineDuxo) {
            return (DynamicPostTransferTimelineFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, dynamicPostTransferTimelineDuxo);
        }
    }
}
