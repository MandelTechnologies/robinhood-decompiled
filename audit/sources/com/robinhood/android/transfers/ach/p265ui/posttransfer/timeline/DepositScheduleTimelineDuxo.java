package com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.DepositScheduleTimelineFragment;
import com.robinhood.android.transfers.ach.p265ui.posttransfer.timeline.DepositScheduleTimelineViewState;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.models.p320db.AchRelationship;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DepositScheduleTimelineDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/DepositScheduleTimelineDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/DepositScheduleTimelineViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class DepositScheduleTimelineDuxo extends OldBaseDuxo<DepositScheduleTimelineViewState> implements HasSavedState {
    private final AchRelationshipStore achRelationshipStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DepositScheduleTimelineDuxo(AchRelationshipStore achRelationshipStore, SavedStateHandle savedStateHandle) {
        super(DepositScheduleTimelineViewState.Loading.INSTANCE, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.achRelationshipStore = achRelationshipStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        this.achRelationshipStore.refresh(false);
        LifecycleHost.DefaultImpls.bind$default(this, this.achRelationshipStore.getAchRelationship(((DepositScheduleTimelineFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getTimelineArgs().getAchRelationshipId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.timeline.DepositScheduleTimelineDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DepositScheduleTimelineDuxo.onCreate$lambda$1(this.f$0, (AchRelationship) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(final DepositScheduleTimelineDuxo depositScheduleTimelineDuxo, final AchRelationship achRelationship) {
        Intrinsics.checkNotNullParameter(achRelationship, "achRelationship");
        depositScheduleTimelineDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.timeline.DepositScheduleTimelineDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DepositScheduleTimelineDuxo.onCreate$lambda$1$lambda$0(achRelationship, depositScheduleTimelineDuxo, (DepositScheduleTimelineViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DepositScheduleTimelineViewState onCreate$lambda$1$lambda$0(AchRelationship achRelationship, DepositScheduleTimelineDuxo depositScheduleTimelineDuxo, DepositScheduleTimelineViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new DepositScheduleTimelineViewState.Loaded(achRelationship, ((DepositScheduleTimelineFragment.Args) INSTANCE.getArgs((HasSavedState) depositScheduleTimelineDuxo)).getTimelineArgs().getDepositSchedule());
    }

    /* compiled from: DepositScheduleTimelineDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/DepositScheduleTimelineDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/DepositScheduleTimelineDuxo;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/timeline/DepositScheduleTimelineFragment$Args;", "<init>", "()V", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DepositScheduleTimelineDuxo, DepositScheduleTimelineFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DepositScheduleTimelineFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (DepositScheduleTimelineFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DepositScheduleTimelineFragment.Args getArgs(DepositScheduleTimelineDuxo depositScheduleTimelineDuxo) {
            return (DepositScheduleTimelineFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, depositScheduleTimelineDuxo);
        }
    }
}
