package com.robinhood.android.slip.onboarding.agreements;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsDuxo;
import com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsFragment;
import com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsViewState;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.slip.SlipAgreementsStore;
import com.robinhood.models.api.ApiSlipOnboardingFlow;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p355ui.UiSlipAgreements;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: SlipOnboardingAgreementsDuxo.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001$B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0013J(\u0010\u0018\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001aH\u0002J\u000e\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 J\u0018\u0010!\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/SlipOnboardingAgreementsDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/slip/onboarding/agreements/SlipOnboardingAgreementsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "slipAgreementsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipAgreementsStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipAgreementsStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/analytics/EventLogger;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onCtaClicked", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "onAgreementsReviewed", "acceptSlipAgreements", "expandableAgreements", "", "Lcom/robinhood/android/slip/onboarding/agreements/ExpandableAgreement;", "agreementsV2", "Lcom/robinhood/models/ui/UiSlipAgreements$AgreementV2;", "onAllCheckboxesCheckedChanged", "allCheckboxesChecked", "", "logCtaTap", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "Companion", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SlipOnboardingAgreementsDuxo extends OldBaseDuxo<SlipOnboardingAgreementsViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final EventLogger eventLogger;
    private final SavedStateHandle savedStateHandle;
    private final SlipAgreementsStore slipAgreementsStore;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SlipOnboardingAgreementsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SlipOnboardingAgreementsViewState.ReviewState.values().length];
            try {
                iArr[SlipOnboardingAgreementsViewState.ReviewState.REVIEWING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SlipOnboardingAgreementsViewState.ReviewState.ACCEPT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
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
    public SlipOnboardingAgreementsDuxo(AccountProvider accountProvider, SlipAgreementsStore slipAgreementsStore, UserStore userStore, EventLogger eventLogger, SavedStateHandle savedStateHandle) {
        super(new SlipOnboardingAgreementsViewState(null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(slipAgreementsStore, "slipAgreementsStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.slipAgreementsStore = slipAgreementsStore;
        this.userStore = userStore;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        Single<Optional<String>> individualAccountNumber;
        super.onCreate();
        Companion companion = INSTANCE;
        String accountNumber = ((SlipOnboardingAgreementsFragment.Args) companion.getArgs((HasSavedState) this)).getAccountNumber();
        final boolean zIsQuickEnrollment = ((SlipOnboardingAgreementsFragment.Args) companion.getArgs((HasSavedState) this)).isQuickEnrollment();
        if (accountNumber != null) {
            individualAccountNumber = Single.just(Optional3.asOptional(accountNumber));
            Intrinsics.checkNotNull(individualAccountNumber);
        } else {
            individualAccountNumber = this.accountProvider.getIndividualAccountNumber();
        }
        Single singleDoOnSubscribe = individualAccountNumber.flatMap(new Function() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsDuxo.onCreate.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends UiSlipAgreements> apply(Optional<String> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                String strComponent1 = optional.component1();
                if (strComponent1 == null) {
                    throw new IllegalStateException("User must have an account to get SLIP agreements");
                }
                return SlipOnboardingAgreementsDuxo.this.slipAgreementsStore.getSlipAgreements(strComponent1, ((SlipOnboardingAgreementsFragment.Args) SlipOnboardingAgreementsDuxo.INSTANCE.getArgs((HasSavedState) SlipOnboardingAgreementsDuxo.this)).getLoggingContext().getEntry_point_source(), ApiSlipOnboardingFlow.STANDARD, zIsQuickEnrollment);
            }
        }).doOnSubscribe(new C285702<>());
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SlipOnboardingAgreementsDuxo.onCreate$lambda$5(this.f$0, (UiSlipAgreements) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SlipOnboardingAgreementsDuxo.onCreate$lambda$7(this.f$0, (Throwable) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SlipOnboardingAgreementsDuxo.onCreate$lambda$9(this.f$0, (User) obj);
            }
        });
    }

    /* compiled from: SlipOnboardingAgreementsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsDuxo$onCreate$2 */
    static final class C285702<T> implements Consumer {
        C285702() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SlipOnboardingAgreementsViewState accept$lambda$0(SlipOnboardingAgreementsViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return applyMutation.copy((65533 & 1) != 0 ? applyMutation.user : null, (65533 & 2) != 0 ? applyMutation.isLoading : true, (65533 & 4) != 0 ? applyMutation.title : null, (65533 & 8) != 0 ? applyMutation.subtitleMarkdown : null, (65533 & 16) != 0 ? applyMutation.acknowledgeContent : null, (65533 & 32) != 0 ? applyMutation.summaryTitle : null, (65533 & 64) != 0 ? applyMutation.summaryItems : null, (65533 & 128) != 0 ? applyMutation.crsLink : null, (65533 & 256) != 0 ? applyMutation.expandableAgreements : null, (65533 & 512) != 0 ? applyMutation.additionalCheckboxes : null, (65533 & 1024) != 0 ? applyMutation.agreementsAcceptedEvent : null, (65533 & 2048) != 0 ? applyMutation.scrollToBottomEvent : null, (65533 & 4096) != 0 ? applyMutation.reviewState : null, (65533 & 8192) != 0 ? applyMutation.allCheckboxesChecked : false, (65533 & 16384) != 0 ? applyMutation.agreementsV2 : null, (65533 & 32768) != 0 ? applyMutation.errorEvent : null);
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            SlipOnboardingAgreementsDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsDuxo$onCreate$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SlipOnboardingAgreementsDuxo.C285702.accept$lambda$0((SlipOnboardingAgreementsViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$5(SlipOnboardingAgreementsDuxo slipOnboardingAgreementsDuxo, final UiSlipAgreements uiSlipAgreements) {
        final List<UiSlipAgreements.AgreementV2> agreementsV2 = uiSlipAgreements.getAgreementsV2();
        if (agreementsV2 != null) {
            slipOnboardingAgreementsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsDuxo$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SlipOnboardingAgreementsDuxo.onCreate$lambda$5$lambda$1$lambda$0(uiSlipAgreements, agreementsV2, (SlipOnboardingAgreementsViewState) obj);
                }
            });
        } else {
            List<UiSlipAgreements.Agreement> agreements = uiSlipAgreements.getAgreements();
            final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(agreements, 10));
            int i = 0;
            for (Object obj : agreements) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(new ExpandableAgreement(i2, (UiSlipAgreements.Agreement) obj));
                i = i2;
            }
            slipOnboardingAgreementsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsDuxo$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SlipOnboardingAgreementsDuxo.onCreate$lambda$5$lambda$4$lambda$3(uiSlipAgreements, arrayList, (SlipOnboardingAgreementsViewState) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SlipOnboardingAgreementsViewState onCreate$lambda$5$lambda$1$lambda$0(UiSlipAgreements uiSlipAgreements, List list, SlipOnboardingAgreementsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((65533 & 1) != 0 ? applyMutation.user : null, (65533 & 2) != 0 ? applyMutation.isLoading : false, (65533 & 4) != 0 ? applyMutation.title : null, (65533 & 8) != 0 ? applyMutation.subtitleMarkdown : null, (65533 & 16) != 0 ? applyMutation.acknowledgeContent : uiSlipAgreements.getAcknowledgeContent(), (65533 & 32) != 0 ? applyMutation.summaryTitle : null, (65533 & 64) != 0 ? applyMutation.summaryItems : null, (65533 & 128) != 0 ? applyMutation.crsLink : uiSlipAgreements.getCrsLink(), (65533 & 256) != 0 ? applyMutation.expandableAgreements : null, (65533 & 512) != 0 ? applyMutation.additionalCheckboxes : null, (65533 & 1024) != 0 ? applyMutation.agreementsAcceptedEvent : null, (65533 & 2048) != 0 ? applyMutation.scrollToBottomEvent : null, (65533 & 4096) != 0 ? applyMutation.reviewState : SlipOnboardingAgreementsViewState.ReviewState.ACCEPT, (65533 & 8192) != 0 ? applyMutation.allCheckboxesChecked : false, (65533 & 16384) != 0 ? applyMutation.agreementsV2 : extensions2.toPersistentList(list), (65533 & 32768) != 0 ? applyMutation.errorEvent : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SlipOnboardingAgreementsViewState onCreate$lambda$5$lambda$4$lambda$3(UiSlipAgreements uiSlipAgreements, List list, SlipOnboardingAgreementsViewState applyMutation) {
        SlipOnboardingAgreementsViewState.ReviewState reviewState;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        String title = uiSlipAgreements.getTitle();
        String subtitleMarkdown = uiSlipAgreements.getSubtitleMarkdown();
        String acknowledgeContent = uiSlipAgreements.getAcknowledgeContent();
        String summaryTitle = uiSlipAgreements.getSummaryTitle();
        List<UIComponent<GenericAction>> summaryItems = uiSlipAgreements.getSummaryItems();
        UiSlipAgreements.TextLink crsLink = uiSlipAgreements.getCrsLink();
        List<String> additionalCheckboxes = uiSlipAgreements.getAdditionalCheckboxes();
        List<String> additionalCheckboxes2 = uiSlipAgreements.getAdditionalCheckboxes();
        if (additionalCheckboxes2 == null || additionalCheckboxes2.isEmpty()) {
            reviewState = SlipOnboardingAgreementsViewState.ReviewState.ACCEPT;
        } else {
            reviewState = SlipOnboardingAgreementsViewState.ReviewState.REVIEWING;
        }
        return applyMutation.copy((65533 & 1) != 0 ? applyMutation.user : null, (65533 & 2) != 0 ? applyMutation.isLoading : false, (65533 & 4) != 0 ? applyMutation.title : title, (65533 & 8) != 0 ? applyMutation.subtitleMarkdown : subtitleMarkdown, (65533 & 16) != 0 ? applyMutation.acknowledgeContent : acknowledgeContent, (65533 & 32) != 0 ? applyMutation.summaryTitle : summaryTitle, (65533 & 64) != 0 ? applyMutation.summaryItems : summaryItems, (65533 & 128) != 0 ? applyMutation.crsLink : crsLink, (65533 & 256) != 0 ? applyMutation.expandableAgreements : list, (65533 & 512) != 0 ? applyMutation.additionalCheckboxes : additionalCheckboxes, (65533 & 1024) != 0 ? applyMutation.agreementsAcceptedEvent : null, (65533 & 2048) != 0 ? applyMutation.scrollToBottomEvent : null, (65533 & 4096) != 0 ? applyMutation.reviewState : reviewState, (65533 & 8192) != 0 ? applyMutation.allCheckboxesChecked : false, (65533 & 16384) != 0 ? applyMutation.agreementsV2 : null, (65533 & 32768) != 0 ? applyMutation.errorEvent : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$7(SlipOnboardingAgreementsDuxo slipOnboardingAgreementsDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        slipOnboardingAgreementsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SlipOnboardingAgreementsDuxo.onCreate$lambda$7$lambda$6(throwable, (SlipOnboardingAgreementsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SlipOnboardingAgreementsViewState onCreate$lambda$7$lambda$6(Throwable th, SlipOnboardingAgreementsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((65533 & 1) != 0 ? applyMutation.user : null, (65533 & 2) != 0 ? applyMutation.isLoading : false, (65533 & 4) != 0 ? applyMutation.title : null, (65533 & 8) != 0 ? applyMutation.subtitleMarkdown : null, (65533 & 16) != 0 ? applyMutation.acknowledgeContent : null, (65533 & 32) != 0 ? applyMutation.summaryTitle : null, (65533 & 64) != 0 ? applyMutation.summaryItems : null, (65533 & 128) != 0 ? applyMutation.crsLink : null, (65533 & 256) != 0 ? applyMutation.expandableAgreements : null, (65533 & 512) != 0 ? applyMutation.additionalCheckboxes : null, (65533 & 1024) != 0 ? applyMutation.agreementsAcceptedEvent : null, (65533 & 2048) != 0 ? applyMutation.scrollToBottomEvent : null, (65533 & 4096) != 0 ? applyMutation.reviewState : null, (65533 & 8192) != 0 ? applyMutation.allCheckboxesChecked : false, (65533 & 16384) != 0 ? applyMutation.agreementsV2 : null, (65533 & 32768) != 0 ? applyMutation.errorEvent : new UiEvent(th));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$9(SlipOnboardingAgreementsDuxo slipOnboardingAgreementsDuxo, final User it) {
        Intrinsics.checkNotNullParameter(it, "it");
        slipOnboardingAgreementsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SlipOnboardingAgreementsDuxo.onCreate$lambda$9$lambda$8(it, (SlipOnboardingAgreementsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SlipOnboardingAgreementsViewState onCreate$lambda$9$lambda$8(User user, SlipOnboardingAgreementsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((65533 & 1) != 0 ? applyMutation.user : user, (65533 & 2) != 0 ? applyMutation.isLoading : false, (65533 & 4) != 0 ? applyMutation.title : null, (65533 & 8) != 0 ? applyMutation.subtitleMarkdown : null, (65533 & 16) != 0 ? applyMutation.acknowledgeContent : null, (65533 & 32) != 0 ? applyMutation.summaryTitle : null, (65533 & 64) != 0 ? applyMutation.summaryItems : null, (65533 & 128) != 0 ? applyMutation.crsLink : null, (65533 & 256) != 0 ? applyMutation.expandableAgreements : null, (65533 & 512) != 0 ? applyMutation.additionalCheckboxes : null, (65533 & 1024) != 0 ? applyMutation.agreementsAcceptedEvent : null, (65533 & 2048) != 0 ? applyMutation.scrollToBottomEvent : null, (65533 & 4096) != 0 ? applyMutation.reviewState : null, (65533 & 8192) != 0 ? applyMutation.allCheckboxesChecked : false, (65533 & 16384) != 0 ? applyMutation.agreementsV2 : null, (65533 & 32768) != 0 ? applyMutation.errorEvent : null);
    }

    public final void onCtaClicked(final Screen eventScreen) {
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        applyMutation(new Function1() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SlipOnboardingAgreementsDuxo.onCtaClicked$lambda$10(this.f$0, eventScreen, (SlipOnboardingAgreementsViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SlipOnboardingAgreementsViewState onCtaClicked$lambda$10(SlipOnboardingAgreementsDuxo slipOnboardingAgreementsDuxo, Screen screen, SlipOnboardingAgreementsViewState applyMutation) {
        List<String> additionalCheckboxes;
        ImmutableList<UiSlipAgreements.AgreementV2> agreementsV2;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (applyMutation.getExpandableAgreements().isEmpty() && (((additionalCheckboxes = applyMutation.getAdditionalCheckboxes()) == null || additionalCheckboxes.isEmpty()) && ((agreementsV2 = applyMutation.getAgreementsV2()) == null || agreementsV2.isEmpty()))) {
            return applyMutation.copy((65533 & 1) != 0 ? applyMutation.user : null, (65533 & 2) != 0 ? applyMutation.isLoading : false, (65533 & 4) != 0 ? applyMutation.title : null, (65533 & 8) != 0 ? applyMutation.subtitleMarkdown : null, (65533 & 16) != 0 ? applyMutation.acknowledgeContent : null, (65533 & 32) != 0 ? applyMutation.summaryTitle : null, (65533 & 64) != 0 ? applyMutation.summaryItems : null, (65533 & 128) != 0 ? applyMutation.crsLink : null, (65533 & 256) != 0 ? applyMutation.expandableAgreements : null, (65533 & 512) != 0 ? applyMutation.additionalCheckboxes : null, (65533 & 1024) != 0 ? applyMutation.agreementsAcceptedEvent : null, (65533 & 2048) != 0 ? applyMutation.scrollToBottomEvent : null, (65533 & 4096) != 0 ? applyMutation.reviewState : null, (65533 & 8192) != 0 ? applyMutation.allCheckboxesChecked : false, (65533 & 16384) != 0 ? applyMutation.agreementsV2 : null, (65533 & 32768) != 0 ? applyMutation.errorEvent : null);
        }
        int i = WhenMappings.$EnumSwitchMapping$0[applyMutation.getReviewState().ordinal()];
        if (i == 1) {
            slipOnboardingAgreementsDuxo.logCtaTap(screen, UserInteractionEventData.Action.REVIEW);
            return applyMutation.copy((65533 & 1) != 0 ? applyMutation.user : null, (65533 & 2) != 0 ? applyMutation.isLoading : false, (65533 & 4) != 0 ? applyMutation.title : null, (65533 & 8) != 0 ? applyMutation.subtitleMarkdown : null, (65533 & 16) != 0 ? applyMutation.acknowledgeContent : null, (65533 & 32) != 0 ? applyMutation.summaryTitle : null, (65533 & 64) != 0 ? applyMutation.summaryItems : null, (65533 & 128) != 0 ? applyMutation.crsLink : null, (65533 & 256) != 0 ? applyMutation.expandableAgreements : null, (65533 & 512) != 0 ? applyMutation.additionalCheckboxes : null, (65533 & 1024) != 0 ? applyMutation.agreementsAcceptedEvent : null, (65533 & 2048) != 0 ? applyMutation.scrollToBottomEvent : new UiEvent(Unit.INSTANCE), (65533 & 4096) != 0 ? applyMutation.reviewState : null, (65533 & 8192) != 0 ? applyMutation.allCheckboxesChecked : false, (65533 & 16384) != 0 ? applyMutation.agreementsV2 : null, (65533 & 32768) != 0 ? applyMutation.errorEvent : null);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        slipOnboardingAgreementsDuxo.logCtaTap(screen, UserInteractionEventData.Action.CONTINUE);
        slipOnboardingAgreementsDuxo.acceptSlipAgreements(applyMutation.getExpandableAgreements(), applyMutation.getAgreementsV2());
        return applyMutation.copy((65533 & 1) != 0 ? applyMutation.user : null, (65533 & 2) != 0 ? applyMutation.isLoading : true, (65533 & 4) != 0 ? applyMutation.title : null, (65533 & 8) != 0 ? applyMutation.subtitleMarkdown : null, (65533 & 16) != 0 ? applyMutation.acknowledgeContent : null, (65533 & 32) != 0 ? applyMutation.summaryTitle : null, (65533 & 64) != 0 ? applyMutation.summaryItems : null, (65533 & 128) != 0 ? applyMutation.crsLink : null, (65533 & 256) != 0 ? applyMutation.expandableAgreements : null, (65533 & 512) != 0 ? applyMutation.additionalCheckboxes : null, (65533 & 1024) != 0 ? applyMutation.agreementsAcceptedEvent : null, (65533 & 2048) != 0 ? applyMutation.scrollToBottomEvent : null, (65533 & 4096) != 0 ? applyMutation.reviewState : null, (65533 & 8192) != 0 ? applyMutation.allCheckboxesChecked : false, (65533 & 16384) != 0 ? applyMutation.agreementsV2 : null, (65533 & 32768) != 0 ? applyMutation.errorEvent : null);
    }

    public final void onAgreementsReviewed() {
        applyMutation(new Function1() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SlipOnboardingAgreementsDuxo.onAgreementsReviewed$lambda$11((SlipOnboardingAgreementsViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SlipOnboardingAgreementsViewState onAgreementsReviewed$lambda$11(SlipOnboardingAgreementsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((65533 & 1) != 0 ? applyMutation.user : null, (65533 & 2) != 0 ? applyMutation.isLoading : false, (65533 & 4) != 0 ? applyMutation.title : null, (65533 & 8) != 0 ? applyMutation.subtitleMarkdown : null, (65533 & 16) != 0 ? applyMutation.acknowledgeContent : null, (65533 & 32) != 0 ? applyMutation.summaryTitle : null, (65533 & 64) != 0 ? applyMutation.summaryItems : null, (65533 & 128) != 0 ? applyMutation.crsLink : null, (65533 & 256) != 0 ? applyMutation.expandableAgreements : null, (65533 & 512) != 0 ? applyMutation.additionalCheckboxes : null, (65533 & 1024) != 0 ? applyMutation.agreementsAcceptedEvent : null, (65533 & 2048) != 0 ? applyMutation.scrollToBottomEvent : null, (65533 & 4096) != 0 ? applyMutation.reviewState : SlipOnboardingAgreementsViewState.ReviewState.ACCEPT, (65533 & 8192) != 0 ? applyMutation.allCheckboxesChecked : false, (65533 & 16384) != 0 ? applyMutation.agreementsV2 : null, (65533 & 32768) != 0 ? applyMutation.errorEvent : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void acceptSlipAgreements$default(SlipOnboardingAgreementsDuxo slipOnboardingAgreementsDuxo, List list, List list2, int i, Object obj) {
        if ((i & 2) != 0) {
            list2 = null;
        }
        slipOnboardingAgreementsDuxo.acceptSlipAgreements(list, list2);
    }

    private final void acceptSlipAgreements(final List<ExpandableAgreement> expandableAgreements, final List<UiSlipAgreements.AgreementV2> agreementsV2) {
        Single<Optional<String>> individualAccountNumber;
        String accountNumber = ((SlipOnboardingAgreementsFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber();
        if (accountNumber != null) {
            individualAccountNumber = Single.just(Optional3.asOptional(accountNumber));
            Intrinsics.checkNotNull(individualAccountNumber);
        } else {
            individualAccountNumber = this.accountProvider.getIndividualAccountNumber();
        }
        Completable completableFlatMapCompletable = individualAccountNumber.flatMapCompletable(new Function() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsDuxo.acceptSlipAgreements.1
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(Optional<String> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                String strComponent1 = optional.component1();
                if (strComponent1 != null) {
                    SlipAgreementsStore slipAgreementsStore = SlipOnboardingAgreementsDuxo.this.slipAgreementsStore;
                    List<ExpandableAgreement> list = expandableAgreements;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ExpandableAgreement) it.next()).getAgreement());
                    }
                    return slipAgreementsStore.acceptAgreements(strComponent1, arrayList, agreementsV2);
                }
                throw new IllegalStateException("User must have an account to get SLIP agreements");
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "flatMapCompletable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableFlatMapCompletable, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SlipOnboardingAgreementsDuxo.acceptSlipAgreements$lambda$13(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SlipOnboardingAgreementsDuxo.acceptSlipAgreements$lambda$15(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit acceptSlipAgreements$lambda$13(SlipOnboardingAgreementsDuxo slipOnboardingAgreementsDuxo) {
        slipOnboardingAgreementsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SlipOnboardingAgreementsDuxo.acceptSlipAgreements$lambda$13$lambda$12((SlipOnboardingAgreementsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SlipOnboardingAgreementsViewState acceptSlipAgreements$lambda$13$lambda$12(SlipOnboardingAgreementsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((65533 & 1) != 0 ? applyMutation.user : null, (65533 & 2) != 0 ? applyMutation.isLoading : false, (65533 & 4) != 0 ? applyMutation.title : null, (65533 & 8) != 0 ? applyMutation.subtitleMarkdown : null, (65533 & 16) != 0 ? applyMutation.acknowledgeContent : null, (65533 & 32) != 0 ? applyMutation.summaryTitle : null, (65533 & 64) != 0 ? applyMutation.summaryItems : null, (65533 & 128) != 0 ? applyMutation.crsLink : null, (65533 & 256) != 0 ? applyMutation.expandableAgreements : null, (65533 & 512) != 0 ? applyMutation.additionalCheckboxes : null, (65533 & 1024) != 0 ? applyMutation.agreementsAcceptedEvent : new UiEvent(Unit.INSTANCE), (65533 & 2048) != 0 ? applyMutation.scrollToBottomEvent : null, (65533 & 4096) != 0 ? applyMutation.reviewState : null, (65533 & 8192) != 0 ? applyMutation.allCheckboxesChecked : false, (65533 & 16384) != 0 ? applyMutation.agreementsV2 : null, (65533 & 32768) != 0 ? applyMutation.errorEvent : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit acceptSlipAgreements$lambda$15(SlipOnboardingAgreementsDuxo slipOnboardingAgreementsDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        slipOnboardingAgreementsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SlipOnboardingAgreementsDuxo.acceptSlipAgreements$lambda$15$lambda$14(throwable, (SlipOnboardingAgreementsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SlipOnboardingAgreementsViewState acceptSlipAgreements$lambda$15$lambda$14(Throwable th, SlipOnboardingAgreementsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((65533 & 1) != 0 ? applyMutation.user : null, (65533 & 2) != 0 ? applyMutation.isLoading : false, (65533 & 4) != 0 ? applyMutation.title : null, (65533 & 8) != 0 ? applyMutation.subtitleMarkdown : null, (65533 & 16) != 0 ? applyMutation.acknowledgeContent : null, (65533 & 32) != 0 ? applyMutation.summaryTitle : null, (65533 & 64) != 0 ? applyMutation.summaryItems : null, (65533 & 128) != 0 ? applyMutation.crsLink : null, (65533 & 256) != 0 ? applyMutation.expandableAgreements : null, (65533 & 512) != 0 ? applyMutation.additionalCheckboxes : null, (65533 & 1024) != 0 ? applyMutation.agreementsAcceptedEvent : null, (65533 & 2048) != 0 ? applyMutation.scrollToBottomEvent : null, (65533 & 4096) != 0 ? applyMutation.reviewState : null, (65533 & 8192) != 0 ? applyMutation.allCheckboxesChecked : false, (65533 & 16384) != 0 ? applyMutation.agreementsV2 : null, (65533 & 32768) != 0 ? applyMutation.errorEvent : new UiEvent(th));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SlipOnboardingAgreementsViewState onAllCheckboxesCheckedChanged$lambda$16(boolean z, SlipOnboardingAgreementsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((65533 & 1) != 0 ? applyMutation.user : null, (65533 & 2) != 0 ? applyMutation.isLoading : false, (65533 & 4) != 0 ? applyMutation.title : null, (65533 & 8) != 0 ? applyMutation.subtitleMarkdown : null, (65533 & 16) != 0 ? applyMutation.acknowledgeContent : null, (65533 & 32) != 0 ? applyMutation.summaryTitle : null, (65533 & 64) != 0 ? applyMutation.summaryItems : null, (65533 & 128) != 0 ? applyMutation.crsLink : null, (65533 & 256) != 0 ? applyMutation.expandableAgreements : null, (65533 & 512) != 0 ? applyMutation.additionalCheckboxes : null, (65533 & 1024) != 0 ? applyMutation.agreementsAcceptedEvent : null, (65533 & 2048) != 0 ? applyMutation.scrollToBottomEvent : null, (65533 & 4096) != 0 ? applyMutation.reviewState : null, (65533 & 8192) != 0 ? applyMutation.allCheckboxesChecked : z, (65533 & 16384) != 0 ? applyMutation.agreementsV2 : null, (65533 & 32768) != 0 ? applyMutation.errorEvent : null);
    }

    public final void onAllCheckboxesCheckedChanged(final boolean allCheckboxesChecked) {
        applyMutation(new Function1() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SlipOnboardingAgreementsDuxo.onAllCheckboxesCheckedChanged$lambda$16(allCheckboxesChecked, (SlipOnboardingAgreementsViewState) obj);
            }
        });
    }

    private final void logCtaTap(Screen eventScreen, UserInteractionEventData.Action action) {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, action, eventScreen, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
    }

    /* compiled from: SlipOnboardingAgreementsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/SlipOnboardingAgreementsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/slip/onboarding/agreements/SlipOnboardingAgreementsDuxo;", "Lcom/robinhood/android/slip/onboarding/agreements/SlipOnboardingAgreementsFragment$Args;", "<init>", "()V", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SlipOnboardingAgreementsDuxo, SlipOnboardingAgreementsFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SlipOnboardingAgreementsFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (SlipOnboardingAgreementsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SlipOnboardingAgreementsFragment.Args getArgs(SlipOnboardingAgreementsDuxo slipOnboardingAgreementsDuxo) {
            return (SlipOnboardingAgreementsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, slipOnboardingAgreementsDuxo);
        }
    }
}
