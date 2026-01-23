package com.robinhood.android.educationtour;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.educationtour.EducationTourOverlayFragment;
import com.robinhood.android.educationtour.EducationTourOverlayViewState;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.bonfire.EducationTourStore;
import com.robinhood.shared.models.p387db.bonfire.education.tour.EducationTour;
import com.robinhood.shared.models.p387db.bonfire.education.tour.EducationTourResult;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Completables;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: EducationTourOverlayDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001aB\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\rJ\u0014\u0010\u0010\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u000e\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/educationtour/EducationTourOverlayDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/educationtour/EducationTourOverlayViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "educationTourStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationTourStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/EducationTourStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "previousSection", "nextSection", "updateAvailableElementIds", "availableElementIds", "", "", "setEducationTourShouldHide", "shouldHide", "", "handleError", "t", "", "Companion", "lib-education-tour_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class EducationTourOverlayDuxo extends OldBaseDuxo<EducationTourOverlayViewState> implements HasSavedState {
    private final EducationTourStore educationTourStore;
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
    public EducationTourOverlayDuxo(EducationTourStore educationTourStore, SavedStateHandle savedStateHandle) {
        super(new EducationTourOverlayViewState(((EducationTourOverlayFragment.Args) INSTANCE.getArgs(savedStateHandle)).getNoSkip(), null, 0, null, false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(educationTourStore, "educationTourStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.educationTourStore = educationTourStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        EducationTourStore educationTourStore = this.educationTourStore;
        Companion companion = INSTANCE;
        LifecycleHost.DefaultImpls.bind$default(this, Completables.checkFallbackOrError(educationTourStore.refreshEducationTour(((EducationTourOverlayFragment.Args) companion.getArgs((HasSavedState) this)).getScreenName(), ((EducationTourOverlayFragment.Args) companion.getArgs((HasSavedState) this)).getScreenUniqueId(), false), new Function0() { // from class: com.robinhood.android.educationtour.EducationTourOverlayDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationTourOverlayDuxo.onStart$lambda$0(this.f$0);
            }
        }), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.educationtour.EducationTourOverlayDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, new Function1() { // from class: com.robinhood.android.educationtour.EducationTourOverlayDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationTourOverlayDuxo.onStart$lambda$2(this.f$0, (Throwable) obj);
            }
        });
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, this.educationTourStore.streamEducationTour(((EducationTourOverlayFragment.Args) companion.getArgs((HasSavedState) this)).getScreenName(), ((EducationTourOverlayFragment.Args) companion.getArgs((HasSavedState) this)).getScreenUniqueId()), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.educationtour.EducationTourOverlayDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationTourOverlayDuxo.onStart$lambda$4(this.f$0, (EducationTourResult) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.educationtour.EducationTourOverlayDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationTourOverlayDuxo.onStart$lambda$5(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Maybe onStart$lambda$0(EducationTourOverlayDuxo educationTourOverlayDuxo) {
        EducationTourStore educationTourStore = educationTourOverlayDuxo.educationTourStore;
        Companion companion = INSTANCE;
        Maybe<EducationTourResult> maybeFirstElement = educationTourStore.streamEducationTour(((EducationTourOverlayFragment.Args) companion.getArgs((HasSavedState) educationTourOverlayDuxo)).getScreenName(), ((EducationTourOverlayFragment.Args) companion.getArgs((HasSavedState) educationTourOverlayDuxo)).getScreenUniqueId()).firstElement();
        Intrinsics.checkNotNullExpressionValue(maybeFirstElement, "firstElement(...)");
        return maybeFirstElement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(EducationTourOverlayDuxo educationTourOverlayDuxo, Throwable it) throws Throwable {
        Intrinsics.checkNotNullParameter(it, "it");
        educationTourOverlayDuxo.handleError(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(EducationTourOverlayDuxo educationTourOverlayDuxo, EducationTourResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final EducationTour tour = it.getTour();
        educationTourOverlayDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.educationtour.EducationTourOverlayDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationTourOverlayDuxo.onStart$lambda$4$lambda$3(tour, (EducationTourOverlayViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationTourOverlayViewState onStart$lambda$4$lambda$3(EducationTour educationTour, EducationTourOverlayViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (educationTour != null) {
            return EducationTourOverlayViewState.copy$default(applyMutation, false, new EducationTourOverlayViewState.Status.Success(educationTour), 0, null, false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
        }
        return EducationTourOverlayViewState.copy$default(applyMutation, false, EducationTourOverlayViewState.Status.NotEligibleForTour.INSTANCE, 0, null, false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(EducationTourOverlayDuxo educationTourOverlayDuxo, Throwable it) throws Throwable {
        Intrinsics.checkNotNullParameter(it, "it");
        educationTourOverlayDuxo.handleError(it);
        return Unit.INSTANCE;
    }

    public final void previousSection() {
        applyMutation(new Function1() { // from class: com.robinhood.android.educationtour.EducationTourOverlayDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationTourOverlayDuxo.previousSection$lambda$6((EducationTourOverlayViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationTourOverlayViewState previousSection$lambda$6(EducationTourOverlayViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationTourOverlayViewState.copy$default(applyMutation, false, null, RangesKt.coerceAtLeast(applyMutation.getCurrentSectionIndex() - 1, 0), null, false, false, null, applyMutation.getCurrentSectionIndex() == 0 ? new UiEvent(Unit.INSTANCE) : null, 91, null);
    }

    public final void nextSection() {
        applyMutation(new Function1() { // from class: com.robinhood.android.educationtour.EducationTourOverlayDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationTourOverlayDuxo.nextSection$lambda$7((EducationTourOverlayViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationTourOverlayViewState nextSection$lambda$7(EducationTourOverlayViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        UiEvent uiEvent = (applyMutation.getCurrentSectionIndex() != applyMutation.getMaxSectionIndex() || applyMutation.getHasOutro()) ? null : new UiEvent(Unit.INSTANCE);
        return EducationTourOverlayViewState.copy$default(applyMutation, false, null, applyMutation.getCurrentSectionIndex() + 1, null, applyMutation.getHasOutro() && applyMutation.getCurrentSectionIndex() == applyMutation.getMaxSectionIndex(), true, applyMutation.getCurrentSectionIndex() == applyMutation.getMaxSectionIndex() ? new UiEvent(Unit.INSTANCE) : null, uiEvent, 11, null);
    }

    public final void updateAvailableElementIds(final Set<String> availableElementIds) {
        Intrinsics.checkNotNullParameter(availableElementIds, "availableElementIds");
        applyMutation(new Function1() { // from class: com.robinhood.android.educationtour.EducationTourOverlayDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationTourOverlayDuxo.updateAvailableElementIds$lambda$8(availableElementIds, (EducationTourOverlayViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationTourOverlayViewState updateAvailableElementIds$lambda$8(Set set, EducationTourOverlayViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationTourOverlayViewState.copy$default(applyMutation, false, null, 0, set, false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null);
    }

    public final void setEducationTourShouldHide(final boolean shouldHide) {
        Observable observableTake = getStates().map(new Function() { // from class: com.robinhood.android.educationtour.EducationTourOverlayDuxo.setEducationTourShouldHide.1
            @Override // io.reactivex.functions.Function
            public final String apply(EducationTourOverlayViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getTrackingId();
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.educationtour.EducationTourOverlayDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationTourOverlayDuxo.setEducationTourShouldHide$lambda$9(this.f$0, shouldHide, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setEducationTourShouldHide$lambda$9(EducationTourOverlayDuxo educationTourOverlayDuxo, boolean z, String str) {
        EducationTourStore educationTourStore = educationTourOverlayDuxo.educationTourStore;
        Intrinsics.checkNotNull(str);
        educationTourStore.setEducationTourShouldHide(str, z);
        return Unit.INSTANCE;
    }

    private final void handleError(Throwable t) throws Throwable {
        if (Throwables.isNetworkRelated(t)) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, t, false, null, 4, null);
            applyMutation(new Function1() { // from class: com.robinhood.android.educationtour.EducationTourOverlayDuxo$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EducationTourOverlayDuxo.handleError$lambda$10((EducationTourOverlayViewState) obj);
                }
            });
            return;
        }
        throw t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationTourOverlayViewState handleError$lambda$10(EducationTourOverlayViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationTourOverlayViewState.copy$default(applyMutation, false, new EducationTourOverlayViewState.Status.Failure(new UiEvent(Unit.INSTANCE)), 0, null, false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
    }

    /* compiled from: EducationTourOverlayDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/educationtour/EducationTourOverlayDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/educationtour/EducationTourOverlayDuxo;", "Lcom/robinhood/android/educationtour/EducationTourOverlayFragment$Args;", "<init>", "()V", "lib-education-tour_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EducationTourOverlayDuxo, EducationTourOverlayFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EducationTourOverlayFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (EducationTourOverlayFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EducationTourOverlayFragment.Args getArgs(EducationTourOverlayDuxo educationTourOverlayDuxo) {
            return (EducationTourOverlayFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, educationTourOverlayDuxo);
        }
    }
}
