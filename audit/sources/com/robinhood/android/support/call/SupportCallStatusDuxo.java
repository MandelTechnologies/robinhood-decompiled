package com.robinhood.android.support.call;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.support.call.SupportCallStatusDuxo;
import com.robinhood.android.support.call.SupportCallStatusViewState4;
import com.robinhood.android.support.call.channelavailability.UnavailableChannelData;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedMaybe;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.SupportInquiryStore;
import com.robinhood.librobinhood.data.store.SupportInquiryStore2;
import com.robinhood.librobinhood.data.store.SupportPhoneIssueStore;
import com.robinhood.models.api.ChannelType;
import com.robinhood.models.api.PhoneChannelStatus;
import com.robinhood.models.p355ui.AlertDetails;
import com.robinhood.models.p355ui.ChannelAvailability;
import com.robinhood.models.p355ui.ChannelAvailabilityDetails;
import com.robinhood.models.p355ui.Issue;
import com.robinhood.models.p355ui.PhoneChannelScreen;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.udf.UiEvent;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SupportCallStatusDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0015B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/support/call/SupportCallStatusDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/support/call/SupportCallStatusViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "supportInquiryStore", "Lcom/robinhood/librobinhood/data/store/SupportInquiryStore;", "supportPhoneIssueStore", "Lcom/robinhood/librobinhood/data/store/SupportPhoneIssueStore;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/SupportInquiryStore;Lcom/robinhood/librobinhood/data/store/SupportPhoneIssueStore;Lcom/robinhood/shared/security/auth/AuthManager;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "cancelIssue", "requeueIssue", "forceRequeueIssue", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class SupportCallStatusDuxo extends OldBaseDuxo<SupportCallStatusViewState> implements HasSavedState {
    private final AuthManager authManager;
    private final SavedStateHandle savedStateHandle;
    private final SupportInquiryStore supportInquiryStore;
    private final SupportPhoneIssueStore supportPhoneIssueStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SupportCallStatusDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PhoneChannelStatus.values().length];
            try {
                iArr[PhoneChannelStatus.SCHEDULED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PhoneChannelStatus.WAITING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PhoneChannelStatus.MISSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SupportCallStatusDuxo(SupportInquiryStore supportInquiryStore, SupportPhoneIssueStore supportPhoneIssueStore, AuthManager authManager, SavedStateHandle savedStateHandle) {
        super(new SupportCallStatusViewState(null, null, null, null, null, authManager.isLoggedIn(), false, false, null, 479, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(supportInquiryStore, "supportInquiryStore");
        Intrinsics.checkNotNullParameter(supportPhoneIssueStore, "supportPhoneIssueStore");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.supportInquiryStore = supportInquiryStore;
        this.supportPhoneIssueStore = supportPhoneIssueStore;
        this.authManager = authManager;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        Observable observableFlatMapObservable = Single.just(Boolean.valueOf(this.authManager.isLoggedIn())).flatMapObservable(new Function() { // from class: com.robinhood.android.support.call.SupportCallStatusDuxo.onStart.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Issue.Phone> apply(Boolean isLoggedIn) {
                Intrinsics.checkNotNullParameter(isLoggedIn, "isLoggedIn");
                if (isLoggedIn.booleanValue()) {
                    return SupportCallStatusDuxo.this.supportPhoneIssueStore.streamIssue(((LegacyFragmentKey.SupportCallStatus) SupportCallStatusDuxo.INSTANCE.getArgs((HasSavedState) SupportCallStatusDuxo.this)).getIssueId()).switchMap(new Function() { // from class: com.robinhood.android.support.call.SupportCallStatusDuxo.onStart.1.1
                        @Override // io.reactivex.functions.Function
                        public final ObservableSource<? extends Issue.Phone> apply(Issue issue) {
                            Intrinsics.checkNotNullParameter(issue, "issue");
                            if (issue instanceof Issue.Phone) {
                                return Observable.just(issue);
                            }
                            return Observable.error(new SupportInquiryStore2(ChannelType.PHONE, issue.getChannelType()));
                        }
                    });
                }
                return ObservablesKt.filterIsPresent(SupportCallStatusDuxo.this.supportPhoneIssueStore.streamLoggedOutPhoneIssue());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMapObservable, "flatMapObservable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFlatMapObservable, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.support.call.SupportCallStatusDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportCallStatusDuxo.onStart$lambda$1(this.f$0, (Issue.Phone) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(SupportCallStatusDuxo supportCallStatusDuxo, final Issue.Phone phone) {
        supportCallStatusDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.support.call.SupportCallStatusDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportCallStatusDuxo.onStart$lambda$1$lambda$0(phone, (SupportCallStatusViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SupportCallStatusViewState onStart$lambda$1$lambda$0(Issue.Phone phone, SupportCallStatusViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(phone);
        return SupportCallStatusViewState.copy$default(applyMutation, null, null, null, null, null, false, false, false, new SupportCallStatusViewState4.Success(phone), 255, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SupportCallStatusViewState cancelIssue$lambda$2(SupportCallStatusViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SupportCallStatusViewState.copy$default(applyMutation, null, null, null, null, null, false, true, false, null, 447, null);
    }

    public final void cancelIssue() {
        applyMutation(new Function1() { // from class: com.robinhood.android.support.call.SupportCallStatusDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportCallStatusDuxo.cancelIssue$lambda$2((SupportCallStatusViewState) obj);
            }
        });
        Observable<R> map = getStates().map(new Function() { // from class: com.robinhood.android.support.call.SupportCallStatusDuxo$cancelIssue$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Issue.Phone issue = ((SupportCallStatusViewState) it).getIssue();
                return Optional3.asOptional(issue != null ? issue.getChannelStatus() : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((SupportCallStatusDuxo$cancelIssue$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableFlatMapSingle = ObservablesKt.filterIsPresent(map).take(1L).flatMapSingle(new Function() { // from class: com.robinhood.android.support.call.SupportCallStatusDuxo.cancelIssue.3
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Tuples2<PhoneChannelStatus, Issue.Phone>> apply(final PhoneChannelStatus previousState) {
                Intrinsics.checkNotNullParameter(previousState, "previousState");
                return SupportCallStatusDuxo.this.supportPhoneIssueStore.cancelIssue(((LegacyFragmentKey.SupportCallStatus) SupportCallStatusDuxo.INSTANCE.getArgs((HasSavedState) SupportCallStatusDuxo.this)).getIssueId()).flatMap(new Function() { // from class: com.robinhood.android.support.call.SupportCallStatusDuxo.cancelIssue.3.1
                    @Override // io.reactivex.functions.Function
                    public final SingleSource<? extends Tuples2<PhoneChannelStatus, Issue.Phone>> apply(Issue issue) {
                        Intrinsics.checkNotNullParameter(issue, "issue");
                        if (issue instanceof Issue.Phone) {
                            return Single.just(Tuples4.m3642to(previousState, issue));
                        }
                        return Single.error(new SupportInquiryStore2(ChannelType.PHONE, issue.getChannelType()));
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMapSingle, "flatMapSingle(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableFlatMapSingle, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.support.call.SupportCallStatusDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportCallStatusDuxo.cancelIssue$lambda$5(this.f$0, (Tuples2) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.support.call.SupportCallStatusDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportCallStatusDuxo.cancelIssue$lambda$7(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelIssue$lambda$5(SupportCallStatusDuxo supportCallStatusDuxo, Tuples2 tuples2) {
        final Survey survey;
        Object objComponent1 = tuples2.component1();
        Intrinsics.checkNotNullExpressionValue(objComponent1, "component1(...)");
        Issue.Phone phone = (Issue.Phone) tuples2.component2();
        int i = WhenMappings.$EnumSwitchMapping$0[((PhoneChannelStatus) objComponent1).ordinal()];
        if (i == 1 || i == 2) {
            survey = Survey.CX_CALL_STATUS_SCREEN_CANCEL;
        } else if (i != 3) {
            survey = null;
        } else {
            supportCallStatusDuxo.supportPhoneIssueStore.clearDismissedPhoneIssue(phone);
            survey = Survey.CX_MISSED_CALL_REQUEUE_DISMISS;
        }
        supportCallStatusDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.support.call.SupportCallStatusDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportCallStatusDuxo.cancelIssue$lambda$5$lambda$4(survey, (SupportCallStatusViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SupportCallStatusViewState cancelIssue$lambda$5$lambda$4(Survey survey, SupportCallStatusViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SupportCallStatusViewState.copy$default(applyMutation, new UiEvent(Optional3.asOptional(survey)), null, null, null, null, false, false, false, null, 446, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelIssue$lambda$7(SupportCallStatusDuxo supportCallStatusDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        supportCallStatusDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.support.call.SupportCallStatusDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportCallStatusDuxo.cancelIssue$lambda$7$lambda$6((SupportCallStatusViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SupportCallStatusViewState cancelIssue$lambda$7$lambda$6(SupportCallStatusViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SupportCallStatusViewState.copy$default(applyMutation, null, new UiEvent(Unit.INSTANCE), null, null, null, false, false, false, null, 445, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SupportCallStatusViewState requeueIssue$lambda$8(SupportCallStatusViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SupportCallStatusViewState.copy$default(applyMutation, null, null, null, null, null, false, false, true, null, 383, null);
    }

    public final void requeueIssue() {
        applyMutation(new Function1() { // from class: com.robinhood.android.support.call.SupportCallStatusDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportCallStatusDuxo.requeueIssue$lambda$8((SupportCallStatusViewState) obj);
            }
        });
        Observable<R> map = getStates().map(new Function() { // from class: com.robinhood.android.support.call.SupportCallStatusDuxo$requeueIssue$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((SupportCallStatusViewState) it).getInquiryId());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((SupportCallStatusDuxo$requeueIssue$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Maybe maybeFlatMapSingleElement = ObservablesKt.filterIsPresent(map).firstElement().flatMap(new Function() { // from class: com.robinhood.android.support.call.SupportCallStatusDuxo.requeueIssue.3
            @Override // io.reactivex.functions.Function
            public final MaybeSource<? extends ChannelAvailabilityDetails> apply(UUID inquiryId) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                return SupportCallStatusDuxo.this.supportInquiryStore.fetchChannelAvailability(inquiryId, ChannelType.PHONE, PhoneChannelScreen.STATUS_SCREEN_MISSED.getServerValue()).toMaybe();
            }
        }).doOnSuccess(new C289124()).filter(new Predicate() { // from class: com.robinhood.android.support.call.SupportCallStatusDuxo.requeueIssue.5
            @Override // io.reactivex.functions.Predicate
            public final boolean test(ChannelAvailabilityDetails details) {
                Intrinsics.checkNotNullParameter(details, "details");
                return !details.isHidden() && details.getAlertDetails() == null;
            }
        }).flatMapSingleElement(new Function() { // from class: com.robinhood.android.support.call.SupportCallStatusDuxo.requeueIssue.6
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Issue> apply(ChannelAvailabilityDetails it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return SupportCallStatusDuxo.this.supportPhoneIssueStore.requeueIssue(((LegacyFragmentKey.SupportCallStatus) SupportCallStatusDuxo.INSTANCE.getArgs((HasSavedState) SupportCallStatusDuxo.this)).getIssueId());
            }
        });
        Intrinsics.checkNotNullExpressionValue(maybeFlatMapSingleElement, "flatMapSingleElement(...)");
        ScopedMaybe.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, maybeFlatMapSingleElement, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.support.call.SupportCallStatusDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportCallStatusDuxo.requeueIssue$lambda$11(this.f$0, (Issue) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.support.call.SupportCallStatusDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportCallStatusDuxo.requeueIssue$lambda$13(this.f$0, (Throwable) obj);
            }
        }, null, 4, null);
    }

    /* compiled from: SupportCallStatusDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.support.call.SupportCallStatusDuxo$requeueIssue$4 */
    static final class C289124<T> implements Consumer {
        C289124() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(ChannelAvailabilityDetails channelAvailabilityDetails) {
            if (channelAvailabilityDetails.isHidden()) {
                SupportCallStatusDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.support.call.SupportCallStatusDuxo$requeueIssue$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SupportCallStatusDuxo.C289124.accept$lambda$0((SupportCallStatusViewState) obj);
                    }
                });
                return;
            }
            final ChannelAvailability channelAvailability = channelAvailabilityDetails.getChannelAvailability();
            final AlertDetails alertDetails = channelAvailabilityDetails.getAlertDetails();
            if (alertDetails != null) {
                SupportCallStatusDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.support.call.SupportCallStatusDuxo$requeueIssue$4$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SupportCallStatusDuxo.C289124.accept$lambda$1(alertDetails, channelAvailability, (SupportCallStatusViewState) obj);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SupportCallStatusViewState accept$lambda$0(SupportCallStatusViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return SupportCallStatusViewState.copy$default(applyMutation, null, null, null, new UiEvent(Unit.INSTANCE), null, false, false, false, null, 375, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SupportCallStatusViewState accept$lambda$1(AlertDetails alertDetails, ChannelAvailability channelAvailability, SupportCallStatusViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return SupportCallStatusViewState.copy$default(applyMutation, null, null, null, null, new UiEvent(new UnavailableChannelData(alertDetails, channelAvailability.getAvailabilityReason())), false, false, false, null, 367, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requeueIssue$lambda$11(SupportCallStatusDuxo supportCallStatusDuxo, Issue issue) {
        supportCallStatusDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.support.call.SupportCallStatusDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportCallStatusDuxo.requeueIssue$lambda$11$lambda$10((SupportCallStatusViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SupportCallStatusViewState requeueIssue$lambda$11$lambda$10(SupportCallStatusViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SupportCallStatusViewState.copy$default(applyMutation, null, null, new UiEvent(Unit.INSTANCE), null, null, false, false, false, null, 379, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requeueIssue$lambda$13(SupportCallStatusDuxo supportCallStatusDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        supportCallStatusDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.support.call.SupportCallStatusDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportCallStatusDuxo.requeueIssue$lambda$13$lambda$12((SupportCallStatusViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SupportCallStatusViewState requeueIssue$lambda$13$lambda$12(SupportCallStatusViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SupportCallStatusViewState.copy$default(applyMutation, null, null, null, new UiEvent(Unit.INSTANCE), null, false, false, false, null, 375, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SupportCallStatusViewState forceRequeueIssue$lambda$14(SupportCallStatusViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SupportCallStatusViewState.copy$default(applyMutation, null, null, null, null, null, false, false, true, null, 383, null);
    }

    public final void forceRequeueIssue() {
        applyMutation(new Function1() { // from class: com.robinhood.android.support.call.SupportCallStatusDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportCallStatusDuxo.forceRequeueIssue$lambda$14((SupportCallStatusViewState) obj);
            }
        });
        Completable completableIgnoreElement = this.supportPhoneIssueStore.requeueIssue(((LegacyFragmentKey.SupportCallStatus) INSTANCE.getArgs((HasSavedState) this)).getIssueId()).ignoreElement();
        Intrinsics.checkNotNullExpressionValue(completableIgnoreElement, "ignoreElement(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableIgnoreElement, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.support.call.SupportCallStatusDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SupportCallStatusDuxo.forceRequeueIssue$lambda$16(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.support.call.SupportCallStatusDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportCallStatusDuxo.forceRequeueIssue$lambda$18(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit forceRequeueIssue$lambda$16(SupportCallStatusDuxo supportCallStatusDuxo) {
        supportCallStatusDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.support.call.SupportCallStatusDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportCallStatusDuxo.forceRequeueIssue$lambda$16$lambda$15((SupportCallStatusViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SupportCallStatusViewState forceRequeueIssue$lambda$16$lambda$15(SupportCallStatusViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SupportCallStatusViewState.copy$default(applyMutation, null, null, new UiEvent(Unit.INSTANCE), null, null, false, false, false, null, 379, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit forceRequeueIssue$lambda$18(SupportCallStatusDuxo supportCallStatusDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        supportCallStatusDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.support.call.SupportCallStatusDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportCallStatusDuxo.forceRequeueIssue$lambda$18$lambda$17((SupportCallStatusViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SupportCallStatusViewState forceRequeueIssue$lambda$18$lambda$17(SupportCallStatusViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SupportCallStatusViewState.copy$default(applyMutation, null, null, null, new UiEvent(Unit.INSTANCE), null, false, false, false, null, 375, null);
    }

    /* compiled from: SupportCallStatusDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/support/call/SupportCallStatusDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/support/call/SupportCallStatusDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SupportCallStatus;", "<init>", "()V", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SupportCallStatusDuxo, LegacyFragmentKey.SupportCallStatus> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.SupportCallStatus getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.SupportCallStatus) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.SupportCallStatus getArgs(SupportCallStatusDuxo supportCallStatusDuxo) {
            return (LegacyFragmentKey.SupportCallStatus) DuxoCompanion.DefaultImpls.getArgs(this, supportCallStatusDuxo);
        }
    }
}
