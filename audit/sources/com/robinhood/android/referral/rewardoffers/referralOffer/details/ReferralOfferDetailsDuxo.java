package com.robinhood.android.referral.rewardoffers.referralOffer.details;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.eventLogging.ReferralOfferDetailEventLoggingDelegate;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.installation.WhatsAppInstallation;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ContactsAccessDeniedViewState;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ContactsAccessGrantedViewState;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsEvent;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsViewData;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsViewState;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.util.Args2;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.util.ReferralOfferDetailsViewStates;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.util.ToContactInfo;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.DefaultContactsStore;
import com.robinhood.librobinhood.data.store.ReferralStore;
import com.robinhood.librobinhood.util.PersistentCacheManager;
import com.robinhood.models.api.ReferrerData;
import com.robinhood.models.contacts.ReferralContact;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;
import timber.log.Timber;

/* compiled from: ReferralOfferDetailsDuxo.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 ;2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001;BI\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\u0006\u0010\u001e\u001a\u00020\u001cJ\u0006\u0010\u001f\u001a\u00020\u001cJ\b\u0010 \u001a\u00020\u001cH\u0002J\u0006\u0010!\u001a\u00020\u001cJ\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020\u001cJ\u0006\u0010&\u001a\u00020\u001cJ\u0006\u0010'\u001a\u00020\u001cJ\u000e\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u001aJ\u0006\u0010*\u001a\u00020\u001cJ\u000e\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-J\u0006\u0010.\u001a\u00020\u001cJ\u000e\u0010/\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-J\u000e\u00100\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-J\u0006\u00101\u001a\u00020\u001cJ\u0006\u00102\u001a\u00020\u001cJ\u000e\u00103\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u001aJ\u000e\u00105\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u001aJ\u000e\u00106\u001a\u00020\u001c2\u0006\u00107\u001a\u00020\u001aJ\u000e\u00108\u001a\u00020\u001cH\u0082@¢\u0006\u0002\u00109J\u000e\u0010:\u001a\u00020\u001cH\u0082@¢\u0006\u0002\u00109R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/ReferralOfferDetailsDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewState;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "contactsStore", "Lcom/robinhood/librobinhood/data/store/DefaultContactsStore;", "eventLoggingDelegate", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/eventLogging/ReferralOfferDetailEventLoggingDelegate;", "persistentCacheManager", "Lcom/robinhood/librobinhood/util/PersistentCacheManager;", "referralStore", "Lcom/robinhood/librobinhood/data/store/ReferralStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "whatsAppInstallation", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/installation/WhatsAppInstallation;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/DefaultContactsStore;Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/eventLogging/ReferralOfferDetailEventLoggingDelegate;Lcom/robinhood/librobinhood/util/PersistentCacheManager;Lcom/robinhood/librobinhood/data/store/ReferralStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/installation/WhatsAppInstallation;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "referrerCode", "", "onCreate", "", "onResume", "onPreparationCanceled", "onInviteContactsClicked", "requestPermissionsIfNeeded", "requestPermissionDismissed", "onPermissionRequestResult", "isGranted", "", "showAdditionalInfo", "onShowPastRewardsClicked", "onSearchingStarted", "onSearchQueryChanged", "text", "onCancelSearchClicked", "onInviteSingleContactClicked", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewData$ContactInfo;", "onInviteAllSelectedContacts", "onContactSelected", "onContactDeselected", "onClearSelectedContactsClicked", "inviteNextContact", "onInviteSentConfirmationAlertActionButtonClicked", "buttonText", "onInviteSentConfirmationAlertDismissButtonClicked", "onShareLinkButtonClicked", "buttonTitle", "fetchContacts", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchRecommendedContacts", "Companion", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class ReferralOfferDetailsDuxo extends BaseDuxo5<ReferralOfferDetailsViewState, ReferralOfferDetailsEvent> implements HasSavedState {
    private final DefaultContactsStore contactsStore;
    private final ReferralOfferDetailEventLoggingDelegate eventLoggingDelegate;
    private final PersistentCacheManager persistentCacheManager;
    private final ReferralStore referralStore;
    private String referrerCode;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;
    private final WhatsAppInstallation whatsAppInstallation;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ReferralOfferDetailsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo", m3645f = "ReferralOfferDetailsDuxo.kt", m3646l = {407, 373, 377}, m3647m = "fetchContacts")
    /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$fetchContacts$1 */
    static final class C268511 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C268511(Continuation<? super C268511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReferralOfferDetailsDuxo.this.fetchContacts(this);
        }
    }

    /* compiled from: ReferralOfferDetailsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo", m3645f = "ReferralOfferDetailsDuxo.kt", m3646l = {407}, m3647m = "fetchRecommendedContacts")
    /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$fetchRecommendedContacts$1 */
    static final class C268531 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C268531(Continuation<? super C268531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReferralOfferDetailsDuxo.this.fetchRecommendedContacts(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralOfferDetailsDuxo(DefaultContactsStore contactsStore, ReferralOfferDetailEventLoggingDelegate eventLoggingDelegate, PersistentCacheManager persistentCacheManager, ReferralStore referralStore, UserStore userStore, WhatsAppInstallation whatsAppInstallation, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(Args2.toViewState((ReferralOfferDetailsFragment.Args) INSTANCE.getArgs(savedStateHandle)), duxoBundle);
        Intrinsics.checkNotNullParameter(contactsStore, "contactsStore");
        Intrinsics.checkNotNullParameter(eventLoggingDelegate, "eventLoggingDelegate");
        Intrinsics.checkNotNullParameter(persistentCacheManager, "persistentCacheManager");
        Intrinsics.checkNotNullParameter(referralStore, "referralStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(whatsAppInstallation, "whatsAppInstallation");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.contactsStore = contactsStore;
        this.eventLoggingDelegate = eventLoggingDelegate;
        this.persistentCacheManager = persistentCacheManager;
        this.referralStore = referralStore;
        this.userStore = userStore;
        this.whatsAppInstallation = whatsAppInstallation;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: ReferralOfferDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$onCreate$1", m3645f = "ReferralOfferDetailsDuxo.kt", m3646l = {60}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$onCreate$1 */
    static final class C268591 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C268591(Continuation<? super C268591> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReferralOfferDetailsDuxo.this.new C268591(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C268591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Companion companion = ReferralOfferDetailsDuxo.INSTANCE;
                if (((ReferralOfferDetailsFragment.Args) companion.getArgs((HasSavedState) ReferralOfferDetailsDuxo.this)).getContactsPermissionGranted() && !((ReferralOfferDetailsFragment.Args) companion.getArgs((HasSavedState) ReferralOfferDetailsDuxo.this)).getDetails().getShouldHideSystemContacts() && !((ReferralOfferDetailsFragment.Args) companion.getArgs((HasSavedState) ReferralOfferDetailsDuxo.this)).isRhsg()) {
                    ReferralOfferDetailsDuxo referralOfferDetailsDuxo = ReferralOfferDetailsDuxo.this;
                    this.label = 1;
                    if (referralOfferDetailsDuxo.fetchContacts(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C268591(null), 3, null);
        Observable<ReferrerData> observableDoOnError = this.persistentCacheManager.getSymmetricReferrerData().doOnError(new Consumer() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo.onCreate.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Throwable th) {
                Timber.INSTANCE.mo3355e(th, "Unable to obtain referrer data", new Object[0]);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnError, "doOnError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDoOnError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReferralOfferDetailsDuxo.onCreate$lambda$0(this.f$0, (ReferrerData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(ReferralOfferDetailsDuxo referralOfferDetailsDuxo, ReferrerData referrerData) {
        referralOfferDetailsDuxo.referrerCode = referrerData.getCode();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        withDataState(new Function1() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReferralOfferDetailsDuxo.onResume$lambda$3(this.f$0, (ReferralOfferDetailsViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(ReferralOfferDetailsDuxo referralOfferDetailsDuxo, ReferralOfferDetailsViewState it) {
        List<ReferralOfferDetailsViewData.ContactInfo> pendingInvites;
        ReferralOfferDetailsViewData.ContactInfo contactInfo;
        ReferralContact referralContact;
        String cancelSingleInviteCtaText;
        Intrinsics.checkNotNullParameter(it, "it");
        ContactsAccessGrantedViewState contactsAccessGrantedViewStateIfGranted = ReferralOfferDetailsViewStates.ifGranted(it);
        boolean z = false;
        boolean z2 = contactsAccessGrantedViewStateIfGranted != null && contactsAccessGrantedViewStateIfGranted.isSendingSmsInvite();
        if (z2) {
            referralOfferDetailsDuxo.eventLoggingDelegate.logSmsInviteSent(referralOfferDetailsDuxo.referrerCode);
        }
        ContactsAccessGrantedViewState contactsAccessGrantedViewStateIfGranted2 = ReferralOfferDetailsViewStates.ifGranted(it);
        if (contactsAccessGrantedViewStateIfGranted2 != null && contactsAccessGrantedViewStateIfGranted2.isSendingEmailInvite()) {
            z = true;
        }
        if (z) {
            referralOfferDetailsDuxo.eventLoggingDelegate.logEmailInviteSent(referralOfferDetailsDuxo.referrerCode);
        }
        if (z2 || z) {
            if (ReferralOfferDetailsViewStates.asGranted(it).getPendingInvites().isEmpty()) {
                Companion companion = INSTANCE;
                GenericAction inviteSentConfirmationAlert = ((ReferralOfferDetailsFragment.Args) companion.getArgs((HasSavedState) referralOfferDetailsDuxo)).getDetails().getInviteSentConfirmationAlert();
                GenericAction.InfoAlertAction infoAlertAction = inviteSentConfirmationAlert instanceof GenericAction.InfoAlertAction ? (GenericAction.InfoAlertAction) inviteSentConfirmationAlert : null;
                if (infoAlertAction != null) {
                    referralOfferDetailsDuxo.eventLoggingDelegate.logInviteSentConfirmationAlertAppear(((ReferralOfferDetailsFragment.Args) companion.getArgs((HasSavedState) referralOfferDetailsDuxo)).getDetails().getId(), infoAlertAction.getAlert().getButtons());
                    referralOfferDetailsDuxo.submit(new ReferralOfferDetailsEvent.ShowInviteSentConfirmation((GenericAction.InfoAlertAction) inviteSentConfirmationAlert));
                }
                referralOfferDetailsDuxo.applyMutation(new ReferralOfferDetailsDuxo4(null));
            } else {
                ContactsAccessGrantedViewState contactsAccessGrantedViewStateIfGranted3 = ReferralOfferDetailsViewStates.ifGranted(it);
                if (contactsAccessGrantedViewStateIfGranted3 != null && (pendingInvites = contactsAccessGrantedViewStateIfGranted3.getPendingInvites()) != null && (contactInfo = (ReferralOfferDetailsViewData.ContactInfo) CollectionsKt.firstOrNull((List) pendingInvites)) != null && (referralContact = contactInfo.getReferralContact()) != null) {
                    if (ReferralOfferDetailsViewStates.asGranted(it).getPendingInvites().size() > 1) {
                        cancelSingleInviteCtaText = ReferralOfferDetailsViewStates.asGranted(it).getMultiSelectContent().getCancelMultipleInviteCtaText();
                    } else {
                        cancelSingleInviteCtaText = ReferralOfferDetailsViewStates.asGranted(it).getMultiSelectContent().getCancelSingleInviteCtaText();
                    }
                    String preparingInviteTitle = ReferralOfferDetailsViewStates.asGranted(it).getMultiSelectContent().getPreparingInviteTitle();
                    String shortName = referralContact.getShortName();
                    if (shortName == null) {
                        shortName = "";
                    }
                    referralOfferDetailsDuxo.submit(new ReferralOfferDetailsEvent.ShowPreparationAlert(StringsKt.replace$default(preparingInviteTitle, "{{contact_name}}", shortName, false, 4, (Object) null), cancelSingleInviteCtaText));
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* compiled from: ReferralOfferDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$onPreparationCanceled$1", m3645f = "ReferralOfferDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$onPreparationCanceled$1 */
    static final class C268641 extends ContinuationImpl7 implements Function2<ReferralOfferDetailsViewState, Continuation<? super ReferralOfferDetailsViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C268641(Continuation<? super C268641> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C268641 c268641 = new C268641(continuation);
            c268641.L$0 = obj;
            return c268641;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ReferralOfferDetailsViewState referralOfferDetailsViewState, Continuation<? super ReferralOfferDetailsViewState> continuation) {
            return ((C268641) create(referralOfferDetailsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ContactsAccessGrantedViewState contactsAccessGrantedViewStateCopy$default = ContactsAccessGrantedViewState.copy$default(ReferralOfferDetailsViewStates.asGranted((ReferralOfferDetailsViewState) this.L$0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, null, null, false, false, 8191999, null);
            contactsAccessGrantedViewStateCopy$default.getPendingInvites().clear();
            return contactsAccessGrantedViewStateCopy$default;
        }
    }

    public final void onPreparationCanceled() {
        applyMutation(new C268641(null));
        submit(ReferralOfferDetailsEvent.CancelInvitePreparation.INSTANCE);
    }

    public final void onInviteContactsClicked() {
        Companion companion = INSTANCE;
        if (((ReferralOfferDetailsFragment.Args) companion.getArgs((HasSavedState) this)).isRhsg()) {
            if (this.whatsAppInstallation.isInstalled()) {
                submit(new ReferralOfferDetailsEvent.InviteContactViaWhatsApp(((ReferralOfferDetailsFragment.Args) companion.getArgs((HasSavedState) this)).getDetails().getContactsAccessGranted().getInviteMessageContent()));
                return;
            } else {
                requestPermissionsIfNeeded();
                return;
            }
        }
        requestPermissionsIfNeeded();
    }

    private final void requestPermissionsIfNeeded() {
        Companion companion = INSTANCE;
        if (((ReferralOfferDetailsFragment.Args) companion.getArgs((HasSavedState) this)).getContactsPermissionGranted()) {
            onPermissionRequestResult(true);
            return;
        }
        this.eventLoggingDelegate.logPrimaryButtonTap(((ReferralOfferDetailsFragment.Args) companion.getArgs((HasSavedState) this)).getDetails().getId(), ((ReferralOfferDetailsFragment.Args) companion.getArgs((HasSavedState) this)).getDetails().getContactsAccessDenied().getFooter().getInviteContacts(), ((ReferralOfferDetailsFragment.Args) companion.getArgs((HasSavedState) this)).getSource(), ((ReferralOfferDetailsFragment.Args) companion.getArgs((HasSavedState) this)).getInitialSource());
        this.eventLoggingDelegate.logPermissionDialogAppearEvents();
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C268681(null), 3, null);
    }

    /* compiled from: ReferralOfferDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$requestPermissionsIfNeeded$1", m3645f = "ReferralOfferDetailsDuxo.kt", m3646l = {407}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$requestPermissionsIfNeeded$1 */
    static final class C268681 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C268681(Continuation<? super C268681> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReferralOfferDetailsDuxo.this.new C268681(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C268681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            User.Origin origin;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable<User> user = ReferralOfferDetailsDuxo.this.userStore.getUser();
                this.label = 1;
                obj = RxAwait3.awaitFirstOrNull(user, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            User user2 = (User) obj;
            if (Intrinsics.areEqual((user2 == null || (origin = user2.getOrigin()) == null) ? null : origin.getLocality(), CountryCode.Supported.UnitedStates.INSTANCE)) {
                ReferralOfferDetailsDuxo.this.applyMutation(new AnonymousClass1(null));
            } else {
                ReferralOfferDetailsDuxo.this.submit(ReferralOfferDetailsEvent.ShowPermissionRequest.INSTANCE);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: ReferralOfferDetailsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$requestPermissionsIfNeeded$1$1", m3645f = "ReferralOfferDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$requestPermissionsIfNeeded$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ReferralOfferDetailsViewState, Continuation<? super ReferralOfferDetailsViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ReferralOfferDetailsViewState referralOfferDetailsViewState, Continuation<? super ReferralOfferDetailsViewState> continuation) {
                return ((AnonymousClass1) create(referralOfferDetailsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ContactsAccessDeniedViewState.copy$default(ReferralOfferDetailsViewStates.asDenied((ReferralOfferDetailsViewState) this.L$0), null, null, null, null, false, true, null, null, false, false, 991, null);
            }
        }
    }

    /* compiled from: ReferralOfferDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$requestPermissionDismissed$1", m3645f = "ReferralOfferDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$requestPermissionDismissed$1 */
    static final class C268671 extends ContinuationImpl7 implements Function2<ReferralOfferDetailsViewState, Continuation<? super ReferralOfferDetailsViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C268671(Continuation<? super C268671> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C268671 c268671 = new C268671(continuation);
            c268671.L$0 = obj;
            return c268671;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ReferralOfferDetailsViewState referralOfferDetailsViewState, Continuation<? super ReferralOfferDetailsViewState> continuation) {
            return ((C268671) create(referralOfferDetailsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ContactsAccessDeniedViewState.copy$default(ReferralOfferDetailsViewStates.asDenied((ReferralOfferDetailsViewState) this.L$0), null, null, null, null, false, false, null, null, false, false, 991, null);
        }
    }

    public final void requestPermissionDismissed() {
        applyMutation(new C268671(null));
    }

    /* compiled from: ReferralOfferDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$onPermissionRequestResult$1", m3645f = "ReferralOfferDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$onPermissionRequestResult$1 */
    static final class C268621 extends ContinuationImpl7 implements Function2<ReferralOfferDetailsViewState, Continuation<? super ReferralOfferDetailsViewState>, Object> {
        int label;

        C268621(Continuation<? super C268621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReferralOfferDetailsDuxo.this.new C268621(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ReferralOfferDetailsViewState referralOfferDetailsViewState, Continuation<? super ReferralOfferDetailsViewState> continuation) {
            return ((C268621) create(referralOfferDetailsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Companion companion = ReferralOfferDetailsDuxo.INSTANCE;
            return Args2.toViewState$default(((ReferralOfferDetailsFragment.Args) companion.getArgs((HasSavedState) ReferralOfferDetailsDuxo.this)).getDetails(), true, ((ReferralOfferDetailsFragment.Args) companion.getArgs((HasSavedState) ReferralOfferDetailsDuxo.this)).isMultiSelectContactMember(), ((ReferralOfferDetailsFragment.Args) companion.getArgs((HasSavedState) ReferralOfferDetailsDuxo.this)).isRhsg(), ((ReferralOfferDetailsFragment.Args) companion.getArgs((HasSavedState) ReferralOfferDetailsDuxo.this)).isWhatsAppInstalled(), false, 16, null);
        }
    }

    public final void onPermissionRequestResult(boolean isGranted) {
        if (isGranted) {
            this.eventLoggingDelegate.logGrantPermissionTap();
            applyMutation(new C268621(null));
            BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C268632(null), 3, null);
        } else {
            this.eventLoggingDelegate.logRejectPermissionTap();
            submit(ReferralOfferDetailsEvent.ShowPermissionExplanation.INSTANCE);
        }
    }

    /* compiled from: ReferralOfferDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$onPermissionRequestResult$2", m3645f = "ReferralOfferDetailsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$onPermissionRequestResult$2 */
    static final class C268632 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C268632(Continuation<? super C268632> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReferralOfferDetailsDuxo.this.new C268632(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C268632) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ReferralOfferDetailsDuxo referralOfferDetailsDuxo = ReferralOfferDetailsDuxo.this;
                this.label = 1;
                if (referralOfferDetailsDuxo.fetchContacts(this) == coroutine_suspended) {
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

    public final void showAdditionalInfo() {
        submit(new ReferralOfferDetailsEvent.ShowInfoSheet(((ReferralOfferDetailsFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getDetails().getAdditionalInfo()));
    }

    public final void onShowPastRewardsClicked() {
        submit(ReferralOfferDetailsEvent.ShowPastRewards.INSTANCE);
    }

    /* compiled from: ReferralOfferDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$onSearchingStarted$1", m3645f = "ReferralOfferDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$onSearchingStarted$1 */
    static final class C268661 extends ContinuationImpl7 implements Function2<ReferralOfferDetailsViewState, Continuation<? super ReferralOfferDetailsViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C268661(Continuation<? super C268661> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C268661 c268661 = new C268661(continuation);
            c268661.L$0 = obj;
            return c268661;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ReferralOfferDetailsViewState referralOfferDetailsViewState, Continuation<? super ReferralOfferDetailsViewState> continuation) {
            return ((C268661) create(referralOfferDetailsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ContactsAccessGrantedViewState.copy$default(ReferralOfferDetailsViewStates.asGranted((ReferralOfferDetailsViewState) this.L$0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, false, false, false, null, null, false, false, 8372223, null);
        }
    }

    public final void onSearchingStarted() {
        applyMutation(new C268661(null));
    }

    public final void onSearchQueryChanged(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        String string2 = StringsKt.trim(text).toString();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = string2.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.eventLoggingDelegate.logSearchQuery(lowerCase);
        applyMutation(new C268651(lowerCase, null));
    }

    /* compiled from: ReferralOfferDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$onSearchQueryChanged$1", m3645f = "ReferralOfferDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$onSearchQueryChanged$1 */
    static final class C268651 extends ContinuationImpl7 implements Function2<ReferralOfferDetailsViewState, Continuation<? super ReferralOfferDetailsViewState>, Object> {
        final /* synthetic */ String $normalizedQuery;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C268651(String str, Continuation<? super C268651> continuation) {
            super(2, continuation);
            this.$normalizedQuery = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C268651 c268651 = new C268651(this.$normalizedQuery, continuation);
            c268651.L$0 = obj;
            return c268651;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ReferralOfferDetailsViewState referralOfferDetailsViewState, Continuation<? super ReferralOfferDetailsViewState> continuation) {
            return ((C268651) create(referralOfferDetailsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ContactsAccessGrantedViewState.copy$default(ReferralOfferDetailsViewStates.asGranted((ReferralOfferDetailsViewState) this.L$0), null, null, null, null, null, null, null, null, null, null, null, null, null, this.$normalizedQuery, false, null, false, false, false, null, null, false, false, 8380415, null);
        }
    }

    /* compiled from: ReferralOfferDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$onCancelSearchClicked$1", m3645f = "ReferralOfferDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$onCancelSearchClicked$1 */
    static final class C268551 extends ContinuationImpl7 implements Function2<ReferralOfferDetailsViewState, Continuation<? super ReferralOfferDetailsViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C268551(Continuation<? super C268551> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C268551 c268551 = new C268551(continuation);
            c268551.L$0 = obj;
            return c268551;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ReferralOfferDetailsViewState referralOfferDetailsViewState, Continuation<? super ReferralOfferDetailsViewState> continuation) {
            return ((C268551) create(referralOfferDetailsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ContactsAccessGrantedViewState.copy$default(ReferralOfferDetailsViewStates.asGranted((ReferralOfferDetailsViewState) this.L$0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, null, null, false, false, 8364031, null);
        }
    }

    public final void onCancelSearchClicked() {
        applyMutation(new C268551(null));
    }

    public final void onInviteSingleContactClicked(ReferralOfferDetailsViewData.ContactInfo data) {
        Intrinsics.checkNotNullParameter(data, "data");
        onContactSelected(data);
        onInviteAllSelectedContacts();
    }

    public final void onInviteAllSelectedContacts() {
        withDataState(new Function1() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReferralOfferDetailsDuxo.onInviteAllSelectedContacts$lambda$4((ReferralOfferDetailsViewState) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C268612(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInviteAllSelectedContacts$lambda$4(ReferralOfferDetailsViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ReferralOfferDetailsViewStates.asGranted(it).getPendingInvites().addAll(ReferralOfferDetailsViewStates.asGranted(it).getSelectedContacts());
        return Unit.INSTANCE;
    }

    /* compiled from: ReferralOfferDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$onInviteAllSelectedContacts$2", m3645f = "ReferralOfferDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$onInviteAllSelectedContacts$2 */
    static final class C268612 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C268612(Continuation<? super C268612> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReferralOfferDetailsDuxo.this.new C268612(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C268612) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ReferralOfferDetailsDuxo.this.inviteNextContact();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ReferralOfferDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$onContactSelected$1", m3645f = "ReferralOfferDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$onContactSelected$1 */
    static final class C268581 extends ContinuationImpl7 implements Function2<ReferralOfferDetailsViewState, Continuation<? super ReferralOfferDetailsViewState>, Object> {
        final /* synthetic */ ReferralOfferDetailsViewData.ContactInfo $data;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C268581(ReferralOfferDetailsViewData.ContactInfo contactInfo, Continuation<? super C268581> continuation) {
            super(2, continuation);
            this.$data = contactInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C268581 c268581 = new C268581(this.$data, continuation);
            c268581.L$0 = obj;
            return c268581;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ReferralOfferDetailsViewState referralOfferDetailsViewState, Continuation<? super ReferralOfferDetailsViewState> continuation) {
            return ((C268581) create(referralOfferDetailsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ReferralOfferDetailsViewState referralOfferDetailsViewState = (ReferralOfferDetailsViewState) this.L$0;
            return ContactsAccessGrantedViewState.copy$default(ReferralOfferDetailsViewStates.asGranted(referralOfferDetailsViewState), null, null, null, null, null, null, null, null, null, null, SetsKt.plus(ReferralOfferDetailsViewStates.asGranted(referralOfferDetailsViewState).getSelectedContacts(), this.$data), null, null, null, false, null, false, false, false, null, null, false, false, 8387583, null);
        }
    }

    public final void onContactSelected(ReferralOfferDetailsViewData.ContactInfo data) {
        Intrinsics.checkNotNullParameter(data, "data");
        applyMutation(new C268581(data, null));
    }

    /* compiled from: ReferralOfferDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$onContactDeselected$1", m3645f = "ReferralOfferDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$onContactDeselected$1 */
    static final class C268571 extends ContinuationImpl7 implements Function2<ReferralOfferDetailsViewState, Continuation<? super ReferralOfferDetailsViewState>, Object> {
        final /* synthetic */ ReferralOfferDetailsViewData.ContactInfo $data;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C268571(ReferralOfferDetailsViewData.ContactInfo contactInfo, Continuation<? super C268571> continuation) {
            super(2, continuation);
            this.$data = contactInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C268571 c268571 = new C268571(this.$data, continuation);
            c268571.L$0 = obj;
            return c268571;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ReferralOfferDetailsViewState referralOfferDetailsViewState, Continuation<? super ReferralOfferDetailsViewState> continuation) {
            return ((C268571) create(referralOfferDetailsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ReferralOfferDetailsViewState referralOfferDetailsViewState = (ReferralOfferDetailsViewState) this.L$0;
            return ContactsAccessGrantedViewState.copy$default(ReferralOfferDetailsViewStates.asGranted(referralOfferDetailsViewState), null, null, null, null, null, null, null, null, null, null, SetsKt.minus(ReferralOfferDetailsViewStates.asGranted(referralOfferDetailsViewState).getSelectedContacts(), this.$data), null, null, null, false, null, false, false, false, null, null, false, false, 8387583, null);
        }
    }

    public final void onContactDeselected(ReferralOfferDetailsViewData.ContactInfo data) {
        Intrinsics.checkNotNullParameter(data, "data");
        applyMutation(new C268571(data, null));
    }

    /* compiled from: ReferralOfferDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$onClearSelectedContactsClicked$1", m3645f = "ReferralOfferDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$onClearSelectedContactsClicked$1 */
    static final class C268561 extends ContinuationImpl7 implements Function2<ReferralOfferDetailsViewState, Continuation<? super ReferralOfferDetailsViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C268561(Continuation<? super C268561> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C268561 c268561 = new C268561(continuation);
            c268561.L$0 = obj;
            return c268561;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ReferralOfferDetailsViewState referralOfferDetailsViewState, Continuation<? super ReferralOfferDetailsViewState> continuation) {
            return ((C268561) create(referralOfferDetailsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ContactsAccessGrantedViewState.copy$default(ReferralOfferDetailsViewStates.asGranted((ReferralOfferDetailsViewState) this.L$0), null, null, null, null, null, null, null, null, null, null, new LinkedHashSet(), null, null, null, false, null, false, false, false, null, null, false, false, 8387583, null);
        }
    }

    public final void onClearSelectedContactsClicked() {
        applyMutation(new C268561(null));
    }

    public final void inviteNextContact() {
        withDataState(new Function1() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReferralOfferDetailsDuxo.inviteNextContact$lambda$5(this.f$0, (ReferralOfferDetailsViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit inviteNextContact$lambda$5(ReferralOfferDetailsDuxo referralOfferDetailsDuxo, ReferralOfferDetailsViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ReferralOfferDetailsViewData.ContactInfo contactInfo = (ReferralOfferDetailsViewData.ContactInfo) CollectionsKt.removeFirstOrNull(ReferralOfferDetailsViewStates.asGranted(it).getPendingInvites());
        if (contactInfo == null) {
            return Unit.INSTANCE;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(referralOfferDetailsDuxo), null, null, new ReferralOfferDetailsDuxo2(referralOfferDetailsDuxo, contactInfo, null), 3, null);
        referralOfferDetailsDuxo.eventLoggingDelegate.logSentInviteButtonTap(contactInfo.getReferralContact().usePhone(), contactInfo.isRecommended());
        referralOfferDetailsDuxo.applyMutation(new ReferralOfferDetailsDuxo3(contactInfo, referralOfferDetailsDuxo, null));
        return Unit.INSTANCE;
    }

    public final void onInviteSentConfirmationAlertActionButtonClicked(String buttonText) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.eventLoggingDelegate.logInviteSentConfirmationAlertActionButtonTap(((ReferralOfferDetailsFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getDetails().getId(), buttonText);
    }

    public final void onInviteSentConfirmationAlertDismissButtonClicked(String buttonText) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.eventLoggingDelegate.logInviteSentConfirmationAlertDismissButtonTap(((ReferralOfferDetailsFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getDetails().getId(), buttonText);
    }

    public final void onShareLinkButtonClicked(String buttonTitle) {
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        ReferralOfferDetailEventLoggingDelegate referralOfferDetailEventLoggingDelegate = this.eventLoggingDelegate;
        Companion companion = INSTANCE;
        referralOfferDetailEventLoggingDelegate.logSecondaryButtonTap(((ReferralOfferDetailsFragment.Args) companion.getArgs((HasSavedState) this)).getDetails().getId(), buttonTitle, ((ReferralOfferDetailsFragment.Args) companion.getArgs((HasSavedState) this)).getSource(), ((ReferralOfferDetailsFragment.Args) companion.getArgs((HasSavedState) this)).getInitialSource());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00aa, code lost:
    
        if (r9.uploadContactsData(r2, r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bc, code lost:
    
        if (fetchRecommendedContacts(r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchContacts(Continuation<? super Unit> continuation) {
        C268511 c268511;
        List listEmptyList;
        if (continuation instanceof C268511) {
            c268511 = (C268511) continuation;
            int i = c268511.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c268511.label = i - Integer.MIN_VALUE;
            } else {
                c268511 = new C268511(continuation);
            }
        }
        Object objAwaitFirst = c268511.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c268511.label;
        try {
            try {
            } catch (Exception e) {
                Timber.INSTANCE.mo3355e(e, "Failed to upload contacts data", new Object[0]);
            }
        } catch (Exception e2) {
            Timber.INSTANCE.mo3355e(e2, "Failed to fetch contacts", new Object[0]);
            listEmptyList = CollectionsKt.emptyList();
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitFirst);
            this.contactsStore.refresh();
            Observable<List<ReferralContact>> contacts = this.contactsStore.getContacts();
            c268511.label = 1;
            objAwaitFirst = RxAwait3.awaitFirst(contacts, c268511);
            if (objAwaitFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i2 == 1) {
            ResultKt.throwOnFailure(objAwaitFirst);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objAwaitFirst);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(objAwaitFirst);
            c268511.label = 3;
        }
        listEmptyList = (List) objAwaitFirst;
        Intrinsics.checkNotNull(listEmptyList);
        List list = listEmptyList;
        applyMutation(new C268522(CollectionsKt.sorted(list), this, null));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ReferralContact) it.next()).toContactData());
        }
        ReferralStore referralStore = this.referralStore;
        c268511.label = 2;
    }

    /* compiled from: ReferralOfferDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$fetchContacts$2", m3645f = "ReferralOfferDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$fetchContacts$2 */
    static final class C268522 extends ContinuationImpl7 implements Function2<ReferralOfferDetailsViewState, Continuation<? super ReferralOfferDetailsViewState>, Object> {
        final /* synthetic */ List<ReferralContact> $sortedContacts;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ReferralOfferDetailsDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C268522(List<ReferralContact> list, ReferralOfferDetailsDuxo referralOfferDetailsDuxo, Continuation<? super C268522> continuation) {
            super(2, continuation);
            this.$sortedContacts = list;
            this.this$0 = referralOfferDetailsDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C268522 c268522 = new C268522(this.$sortedContacts, this.this$0, continuation);
            c268522.L$0 = obj;
            return c268522;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ReferralOfferDetailsViewState referralOfferDetailsViewState, Continuation<? super ReferralOfferDetailsViewState> continuation) {
            return ((C268522) create(referralOfferDetailsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ContactsAccessGrantedViewState contactsAccessGrantedViewStateAsGranted = ReferralOfferDetailsViewStates.asGranted((ReferralOfferDetailsViewState) this.L$0);
            List<ReferralContact> list = this.$sortedContacts;
            ReferralOfferDetailsViewData.ContactSectionHeader contactSectionHeader = new ReferralOfferDetailsViewData.ContactSectionHeader(StringResource.INSTANCE.invoke(((ReferralOfferDetailsFragment.Args) ReferralOfferDetailsDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getDetails().getContactsAccessGranted().getAllContactsSectionTitle()));
            List<ReferralContact> list2 = this.$sortedContacts;
            ReferralOfferDetailsDuxo referralOfferDetailsDuxo = this.this$0;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(ToContactInfo.toContactInfo$default((ReferralContact) it.next(), false, ((ReferralOfferDetailsFragment.Args) ReferralOfferDetailsDuxo.INSTANCE.getArgs((HasSavedState) referralOfferDetailsDuxo)).getDetails().getContactsAccessGranted().getInviteContactCta(), null, 4, null));
            }
            return ContactsAccessGrantedViewState.copy$default(contactsAccessGrantedViewStateAsGranted, list, null, null, null, null, null, null, contactSectionHeader, arrayList, null, null, null, null, null, false, null, false, false, false, null, null, false, false, 8388222, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchRecommendedContacts(Continuation<? super Unit> continuation) {
        C268531 c268531;
        List listEmptyList;
        if (continuation instanceof C268531) {
            c268531 = (C268531) continuation;
            int i = c268531.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c268531.label = i - Integer.MIN_VALUE;
            } else {
                c268531 = new C268531(continuation);
            }
        }
        Object objAwait = c268531.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c268531.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objAwait);
                Single<List<ReferralContact>> contactRecommendations = this.contactsStore.getContactRecommendations();
                c268531.label = 1;
                objAwait = RxAwait3.await(contactRecommendations, c268531);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objAwait);
            }
            listEmptyList = (List) objAwait;
        } catch (Exception e) {
            Timber.INSTANCE.mo3355e(e, "Failed to fetch recommended contacts", new Object[0]);
            listEmptyList = CollectionsKt.emptyList();
        }
        applyMutation(new C268542(listEmptyList, null));
        return Unit.INSTANCE;
    }

    /* compiled from: ReferralOfferDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$fetchRecommendedContacts$2", m3645f = "ReferralOfferDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsDuxo$fetchRecommendedContacts$2 */
    static final class C268542 extends ContinuationImpl7 implements Function2<ReferralOfferDetailsViewState, Continuation<? super ReferralOfferDetailsViewState>, Object> {
        final /* synthetic */ List<ReferralContact> $contacts;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C268542(List<ReferralContact> list, Continuation<? super C268542> continuation) {
            super(2, continuation);
            this.$contacts = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C268542 c268542 = ReferralOfferDetailsDuxo.this.new C268542(this.$contacts, continuation);
            c268542.L$0 = obj;
            return c268542;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ReferralOfferDetailsViewState referralOfferDetailsViewState, Continuation<? super ReferralOfferDetailsViewState> continuation) {
            return ((C268542) create(referralOfferDetailsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ContactsAccessGrantedViewState contactsAccessGrantedViewStateAsGranted = ReferralOfferDetailsViewStates.asGranted((ReferralOfferDetailsViewState) this.L$0);
            ReferralOfferDetailsViewData.ContactSectionHeader contactSectionHeader = new ReferralOfferDetailsViewData.ContactSectionHeader(StringResource.INSTANCE.invoke(((ReferralOfferDetailsFragment.Args) ReferralOfferDetailsDuxo.INSTANCE.getArgs((HasSavedState) ReferralOfferDetailsDuxo.this)).getDetails().getContactsAccessGranted().getSuggestedFriendsSectionTitle()));
            List<ReferralContact> list = this.$contacts;
            Intrinsics.checkNotNull(list);
            List<ReferralContact> list2 = list;
            ReferralOfferDetailsDuxo referralOfferDetailsDuxo = ReferralOfferDetailsDuxo.this;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(ToContactInfo.toContactInfo$default((ReferralContact) it.next(), true, ((ReferralOfferDetailsFragment.Args) ReferralOfferDetailsDuxo.INSTANCE.getArgs((HasSavedState) referralOfferDetailsDuxo)).getDetails().getContactsAccessGranted().getInviteContactCta(), null, 4, null));
            }
            return ContactsAccessGrantedViewState.copy$default(contactsAccessGrantedViewStateAsGranted, null, null, null, null, null, contactSectionHeader, arrayList, null, null, null, null, null, null, null, false, null, false, false, false, null, null, false, false, 8388511, null);
        }
    }

    /* compiled from: ReferralOfferDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/ReferralOfferDetailsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/ReferralOfferDetailsDuxo;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/ReferralOfferDetailsFragment$Args;", "<init>", "()V", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ReferralOfferDetailsDuxo, ReferralOfferDetailsFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ReferralOfferDetailsFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (ReferralOfferDetailsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ReferralOfferDetailsFragment.Args getArgs(ReferralOfferDetailsDuxo referralOfferDetailsDuxo) {
            return (ReferralOfferDetailsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, referralOfferDetailsDuxo);
        }
    }
}
