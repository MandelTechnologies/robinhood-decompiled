package com.robinhood.android.directipo.allocation.clarity.p103ui.announcement;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.IpoAccessAnnouncementStore;
import com.robinhood.models.p320db.bonfire.IpoAccessAnnouncement;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.extensions.Completables;
import com.robinhood.utils.extensions.SinglesKt;
import io.reactivex.Maybe;
import io.reactivex.Single;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoNewAnnouncementDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/announcement/DirectIpoNewAnnouncementDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/directipo/allocation/clarity/ui/announcement/DirectIpoNewAnnouncementViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "ipoAccessAnnouncementStore", "Lcom/robinhood/librobinhood/data/store/IpoAccessAnnouncementStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/IpoAccessAnnouncementStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onResume", "", "fetchIpoAccessAnnouncement", "instrumentId", "Ljava/util/UUID;", "updateDayNightOverlay", "overlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "toggleSubtitleExpandedState", "Companion", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class DirectIpoNewAnnouncementDuxo extends OldBaseDuxo<DirectIpoNewAnnouncementViewState> implements HasSavedState {
    private final IpoAccessAnnouncementStore ipoAccessAnnouncementStore;
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
    public DirectIpoNewAnnouncementDuxo(IpoAccessAnnouncementStore ipoAccessAnnouncementStore, SavedStateHandle savedStateHandle) {
        super(new DirectIpoNewAnnouncementViewState(null, null, false, false, null, 31, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(ipoAccessAnnouncementStore, "ipoAccessAnnouncementStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.ipoAccessAnnouncementStore = ipoAccessAnnouncementStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        fetchIpoAccessAnnouncement(((LegacyFragmentKey.IpoAnnouncement) INSTANCE.getArgs((HasSavedState) this)).getInstrumentId());
    }

    private final void fetchIpoAccessAnnouncement(final UUID instrumentId) {
        applyMutation(new Function1() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.announcement.DirectIpoNewAnnouncementDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoNewAnnouncementDuxo.fetchIpoAccessAnnouncement$lambda$0((DirectIpoNewAnnouncementViewState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.ipoAccessAnnouncementStore.streamIpoAccessAnnouncement(instrumentId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.announcement.DirectIpoNewAnnouncementDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoNewAnnouncementDuxo.fetchIpoAccessAnnouncement$lambda$2(this.f$0, (Optional) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, Completables.checkFallbackOrError(this.ipoAccessAnnouncementStore.refreshIpoAnnouncement(true, instrumentId), new Function0() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.announcement.DirectIpoNewAnnouncementDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DirectIpoNewAnnouncementDuxo.fetchIpoAccessAnnouncement$lambda$3(this.f$0, instrumentId);
            }
        }), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.announcement.DirectIpoNewAnnouncementDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DirectIpoNewAnnouncementDuxo.fetchIpoAccessAnnouncement$lambda$5(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.announcement.DirectIpoNewAnnouncementDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoNewAnnouncementDuxo.fetchIpoAccessAnnouncement$lambda$7(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectIpoNewAnnouncementViewState fetchIpoAccessAnnouncement$lambda$0(DirectIpoNewAnnouncementViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DirectIpoNewAnnouncementViewState.copy$default(applyMutation, null, null, false, true, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchIpoAccessAnnouncement$lambda$2(DirectIpoNewAnnouncementDuxo directIpoNewAnnouncementDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        final IpoAccessAnnouncement ipoAccessAnnouncement = (IpoAccessAnnouncement) optional.component1();
        directIpoNewAnnouncementDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.announcement.DirectIpoNewAnnouncementDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoNewAnnouncementDuxo.fetchIpoAccessAnnouncement$lambda$2$lambda$1(ipoAccessAnnouncement, (DirectIpoNewAnnouncementViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectIpoNewAnnouncementViewState fetchIpoAccessAnnouncement$lambda$2$lambda$1(IpoAccessAnnouncement ipoAccessAnnouncement, DirectIpoNewAnnouncementViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DirectIpoNewAnnouncementViewState.copy$default(applyMutation, ipoAccessAnnouncement, null, false, false, null, 22, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Maybe fetchIpoAccessAnnouncement$lambda$3(DirectIpoNewAnnouncementDuxo directIpoNewAnnouncementDuxo, UUID uuid) {
        Single<Optional<IpoAccessAnnouncement>> singleFirst = directIpoNewAnnouncementDuxo.ipoAccessAnnouncementStore.streamIpoAccessAnnouncement(uuid).first(Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(singleFirst, "first(...)");
        return SinglesKt.unwrapOptional(singleFirst);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchIpoAccessAnnouncement$lambda$5(DirectIpoNewAnnouncementDuxo directIpoNewAnnouncementDuxo) {
        directIpoNewAnnouncementDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.announcement.DirectIpoNewAnnouncementDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoNewAnnouncementDuxo.fetchIpoAccessAnnouncement$lambda$5$lambda$4((DirectIpoNewAnnouncementViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectIpoNewAnnouncementViewState fetchIpoAccessAnnouncement$lambda$5$lambda$4(DirectIpoNewAnnouncementViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DirectIpoNewAnnouncementViewState.copy$default(applyMutation, null, null, false, false, null, 23, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchIpoAccessAnnouncement$lambda$7(DirectIpoNewAnnouncementDuxo directIpoNewAnnouncementDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        directIpoNewAnnouncementDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.announcement.DirectIpoNewAnnouncementDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoNewAnnouncementDuxo.fetchIpoAccessAnnouncement$lambda$7$lambda$6(throwable, (DirectIpoNewAnnouncementViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectIpoNewAnnouncementViewState fetchIpoAccessAnnouncement$lambda$7$lambda$6(Throwable th, DirectIpoNewAnnouncementViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DirectIpoNewAnnouncementViewState.copy$default(applyMutation, null, null, false, false, new UiEvent(th), 15, null);
    }

    public final void updateDayNightOverlay(final DayNightOverlay overlay) {
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        applyMutation(new Function1() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.announcement.DirectIpoNewAnnouncementDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoNewAnnouncementDuxo.updateDayNightOverlay$lambda$8(overlay, (DirectIpoNewAnnouncementViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectIpoNewAnnouncementViewState updateDayNightOverlay$lambda$8(DayNightOverlay dayNightOverlay, DirectIpoNewAnnouncementViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DirectIpoNewAnnouncementViewState.copy$default(applyMutation, null, dayNightOverlay, false, false, null, 29, null);
    }

    public final void toggleSubtitleExpandedState() {
        applyMutation(new Function1() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.announcement.DirectIpoNewAnnouncementDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoNewAnnouncementDuxo.toggleSubtitleExpandedState$lambda$9((DirectIpoNewAnnouncementViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectIpoNewAnnouncementViewState toggleSubtitleExpandedState$lambda$9(DirectIpoNewAnnouncementViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DirectIpoNewAnnouncementViewState.copy$default(applyMutation, null, null, !applyMutation.getSubtitleExpanded(), false, null, 27, null);
    }

    /* compiled from: DirectIpoNewAnnouncementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/announcement/DirectIpoNewAnnouncementDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/directipo/allocation/clarity/ui/announcement/DirectIpoNewAnnouncementDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$IpoAnnouncement;", "<init>", "()V", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DirectIpoNewAnnouncementDuxo, LegacyFragmentKey.IpoAnnouncement> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.IpoAnnouncement getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.IpoAnnouncement) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.IpoAnnouncement getArgs(DirectIpoNewAnnouncementDuxo directIpoNewAnnouncementDuxo) {
            return (LegacyFragmentKey.IpoAnnouncement) DuxoCompanion.DefaultImpls.getArgs(this, directIpoNewAnnouncementDuxo);
        }
    }
}
