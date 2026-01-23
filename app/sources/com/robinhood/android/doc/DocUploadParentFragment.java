package com.robinhood.android.doc;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.doc.event.DocUploadDestination;
import com.robinhood.android.doc.event.DocUploadEventReducer;
import com.robinhood.android.doc.event.DocUploadResult;
import com.robinhood.android.doc.event.DocUploadWizardState;
import com.robinhood.android.doc.p109ui.DocUploadSelectOriginFragment;
import com.robinhood.android.doc.p109ui.DocUploadSelectTypeFragment;
import com.robinhood.android.doc.p109ui.DocUploadSubmissionFragment;
import com.robinhood.android.doc.p109ui.PersonaClientLogStatus;
import com.robinhood.android.doc.p109ui.UtilKt;
import com.robinhood.android.doc.p109ui.initial.DocUploadInitialIdentiFragment;
import com.robinhood.android.doc.p109ui.persona.DocUploadPersonaSubmittedReportFragment;
import com.robinhood.android.doc.p109ui.persona.PersonaClientLoadingFragment;
import com.robinhood.android.doc.p109ui.persona.PersonaStartFragment;
import com.robinhood.android.doc.p109ui.photo.DocUploadCaptureDocumentFragment;
import com.robinhood.android.doc.p109ui.photo.DocUploadReviewPdfFragment;
import com.robinhood.android.doc.p109ui.photo.DocUploadReviewPhotoFragment;
import com.robinhood.android.doc.p109ui.residency.DocUploadVerifyResidencyFragment;
import com.robinhood.android.doc.p109ui.splash.DocUploadSelfieSplashFragment;
import com.robinhood.android.doc.p109ui.splash.DocUploadSplashFragment;
import com.robinhood.android.doc.p109ui.thanks.DocUploadThanksFragment;
import com.robinhood.android.doc.serverdriven.parent.SddrParentFragment;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.app.keys.data.ChooseAddressSource;
import com.robinhood.android.onboarding.contracts.DocumentUpload;
import com.robinhood.android.util.play.GooglePlay;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.librobinhood.data.store.identi.DocumentRequestStore;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.documents.contracts.PrismFragmentKey;
import com.robinhood.shared.documents.lib.docupload.DocUploadEvent;
import com.robinhood.shared.documents.lib.docupload.DocUploadEventReceiver;
import com.robinhood.shared.documents.lib.docupload.PersonaFlowStyle;
import com.robinhood.shared.onboarding.handler.OnboardingClickHandler;
import com.robinhood.utils.buildconfig.BuildFlavors;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DocUploadParentFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0002PQB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0018\u0010:\u001a\u0002072\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020*H\u0016J\u0018\u0010>\u001a\u0002072\u0006\u0010?\u001a\u00020@2\u0006\u0010=\u001a\u00020*H\u0002J\u0018\u0010A\u001a\u0002072\u0006\u0010B\u001a\u00020C2\u0006\u0010=\u001a\u00020*H\u0002J\u0018\u0010D\u001a\u0002072\u0006\u0010E\u001a\u00020C2\u0006\u0010=\u001a\u00020*H\u0002J\u0010\u0010F\u001a\u0002072\u0006\u0010;\u001a\u00020<H\u0002J\b\u0010G\u001a\u00020*H\u0016J\u0010\u0010H\u001a\u0002072\u0006\u0010I\u001a\u00020JH\u0016J\u0010\u0010K\u001a\u0002072\u0006\u0010L\u001a\u00020MH\u0016J\u001a\u0010N\u001a\u00020*2\u0006\u0010L\u001a\u00020M2\b\u0010O\u001a\u0004\u0018\u000109H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R+\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020.8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006R"}, m3636d2 = {"Lcom/robinhood/android/doc/DocUploadParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "getCardManager", "()Lcom/robinhood/android/common/util/CardManager;", "setCardManager", "(Lcom/robinhood/android/common/util/CardManager;)V", "clickHandler", "Lcom/robinhood/shared/onboarding/handler/OnboardingClickHandler;", "getClickHandler", "()Lcom/robinhood/shared/onboarding/handler/OnboardingClickHandler;", "setClickHandler", "(Lcom/robinhood/shared/onboarding/handler/OnboardingClickHandler;)V", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "getSortingHatStore", "()Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "setSortingHatStore", "(Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;)V", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "documentRequestStore", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;", "getDocumentRequestStore", "()Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;", "setDocumentRequestStore", "(Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;)V", "forCrypto", "", "getForCrypto", "()Z", "<set-?>", "Lcom/robinhood/android/doc/event/DocUploadWizardState;", "wizardState", "getWizardState", "()Lcom/robinhood/android/doc/event/DocUploadWizardState;", "setWizardState", "(Lcom/robinhood/android/doc/event/DocUploadWizardState;)V", "wizardState$delegate", "Lkotlin/properties/ReadWriteProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onEvent", "event", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEvent;", "showTransition", "navigate", "result", "Lcom/robinhood/android/doc/event/DocUploadResult;", "clearBackstackAndReplaceFragment", "newFragment", "Landroidx/fragment/app/Fragment;", "replaceFragment", "fragment", "performSideEffects", "onBackPressed", "onError", "error", "", "onDialogDismissed", "id", "", "onPositiveButtonClicked", "passthroughArgs", "DocUploadSubmissionException", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DocUploadParentFragment extends BaseFragment implements DocUploadEventReceiver {
    public static final String USER_ACTION_DOC_UPLOAD_EVENT = "document_request_event";
    public static final String V2_TAG = "v2";
    public AnalyticsLogger analytics;
    public AppType appType;
    public CardManager cardManager;
    public OnboardingClickHandler clickHandler;
    public DocumentRequestStore documentRequestStore;
    public BaseSortingHatStore sortingHatStore;

    /* renamed from: wizardState$delegate, reason: from kotlin metadata */
    private final Interfaces3 wizardState;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(DocUploadParentFragment.class, "wizardState", "getWizardState()Lcom/robinhood/android/doc/event/DocUploadWizardState;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public DocUploadParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.wizardState = (Interfaces3) BindSavedState2.savedParcelable(this, new DocUploadWizardState(null, null, null, false, false, false, false, null, null, null, false, 2047, null)).provideDelegate(this, $$delegatedProperties[0]);
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    public final CardManager getCardManager() {
        CardManager cardManager = this.cardManager;
        if (cardManager != null) {
            return cardManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cardManager");
        return null;
    }

    public final void setCardManager(CardManager cardManager) {
        Intrinsics.checkNotNullParameter(cardManager, "<set-?>");
        this.cardManager = cardManager;
    }

    public final OnboardingClickHandler getClickHandler() {
        OnboardingClickHandler onboardingClickHandler = this.clickHandler;
        if (onboardingClickHandler != null) {
            return onboardingClickHandler;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clickHandler");
        return null;
    }

    public final void setClickHandler(OnboardingClickHandler onboardingClickHandler) {
        Intrinsics.checkNotNullParameter(onboardingClickHandler, "<set-?>");
        this.clickHandler = onboardingClickHandler;
    }

    public final BaseSortingHatStore getSortingHatStore() {
        BaseSortingHatStore baseSortingHatStore = this.sortingHatStore;
        if (baseSortingHatStore != null) {
            return baseSortingHatStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sortingHatStore");
        return null;
    }

    public final void setSortingHatStore(BaseSortingHatStore baseSortingHatStore) {
        Intrinsics.checkNotNullParameter(baseSortingHatStore, "<set-?>");
        this.sortingHatStore = baseSortingHatStore;
    }

    public final AppType getAppType() {
        AppType appType = this.appType;
        if (appType != null) {
            return appType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appType");
        return null;
    }

    public final void setAppType(AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "<set-?>");
        this.appType = appType;
    }

    public final DocumentRequestStore getDocumentRequestStore() {
        DocumentRequestStore documentRequestStore = this.documentRequestStore;
        if (documentRequestStore != null) {
            return documentRequestStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("documentRequestStore");
        return null;
    }

    public final void setDocumentRequestStore(DocumentRequestStore documentRequestStore) {
        Intrinsics.checkNotNullParameter(documentRequestStore, "<set-?>");
        this.documentRequestStore = documentRequestStore;
    }

    private final boolean getForCrypto() {
        List<DocumentRequest> documentRequests = ((DocumentUpload) INSTANCE.getArgs((Fragment) this)).getDocumentRequests();
        if ((documentRequests instanceof Collection) && documentRequests.isEmpty()) {
            return true;
        }
        Iterator<T> it = documentRequests.iterator();
        while (it.hasNext()) {
            if (!((DocumentRequest) it.next()).getForCrypto()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DocUploadWizardState getWizardState() {
        return (DocUploadWizardState) this.wizardState.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setWizardState(DocUploadWizardState docUploadWizardState) {
        this.wizardState.setValue(this, $$delegatedProperties[0], docUploadWizardState);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View viewFindViewById = requireActivity().findViewById(android.R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ApplyWindowInsets.m26663applyWindowInsetsAsMarginqNU9l24(viewFindViewById, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        ScarletManager.putOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE, null, 2, null);
        if (savedInstanceState == null) {
            Companion companion = INSTANCE;
            if (((DocumentUpload) companion.getArgs((Fragment) this)).getMockRequests()) {
                UtilKt.showToastForMockingRequests(this);
            }
            setWizardState(DocUploadWizardState.copy$default(getWizardState(), UtilKt.combineRequests(((DocumentUpload) companion.getArgs((Fragment) this)).getDocumentRequests()), null, null, ((DocumentUpload) companion.getArgs((Fragment) this)).getShowUnderReview(), false, false, ((DocumentUpload) companion.getArgs((Fragment) this)).getSkipInquiryVerificationForUnauthedSelfieConsent(), ((DocumentUpload) companion.getArgs((Fragment) this)).getShowThanks(), null, null, false, 1846, null));
            setFragment(C11048R.id.fragment_container, DocUploadInitialIdentiFragment.INSTANCE.newInstance((Parcelable) new DocUploadInitialIdentiFragment.Args(((DocumentUpload) companion.getArgs((Fragment) this)).getDocumentRequests(), ((DocumentUpload) companion.getArgs((Fragment) this)).isOnboardingOnly(), ((DocumentUpload) companion.getArgs((Fragment) this)).getMockRequests())));
        }
    }

    @Override // com.robinhood.shared.documents.lib.docupload.DocUploadEventReceiver
    public void onEvent(DocUploadEvent event, boolean showTransition) {
        Intrinsics.checkNotNullParameter(event, "event");
        performSideEffects(event);
        DocUploadResult docUploadResultReduce = DocUploadEventReducer.INSTANCE.reduce(event, getWizardState());
        DocUploadWizardState wizardState = docUploadResultReduce.getWizardState();
        if (wizardState != null) {
            new MutablePropertyReference0Impl(this) { // from class: com.robinhood.android.doc.DocUploadParentFragment.onEvent.2
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
                public Object get() {
                    return ((DocUploadParentFragment) this.receiver).getWizardState();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
                public void set(Object obj) {
                    ((DocUploadParentFragment) this.receiver).setWizardState((DocUploadWizardState) obj);
                }
            }.set(wizardState);
        }
        navigate(docUploadResultReduce, showTransition);
    }

    private final void navigate(DocUploadResult result, boolean showTransition) {
        DocUploadDestination destination = result.getDestination();
        if (destination instanceof DocUploadDestination.ServerDrivenFlow) {
            DocUploadParentFragment2.logEntryDestination(getAnalytics(), getWizardState().getRequireActiveRequest(), destination);
            clearBackstackAndReplaceFragment(SddrParentFragment.INSTANCE.newInstance((Parcelable) new SddrParentFragment.Args((DocUploadDestination.ServerDrivenFlow) destination, ((DocumentUpload) INSTANCE.getArgs((Fragment) this)).getMockRequests())), showTransition);
            return;
        }
        if (destination instanceof DocUploadDestination.VerifyResidency) {
            DocUploadParentFragment2.logEntryDestination(getAnalytics(), getWizardState().getRequireActiveRequest(), destination);
            clearBackstackAndReplaceFragment(DocUploadVerifyResidencyFragment.INSTANCE.newInstance((Parcelable) destination), showTransition);
            return;
        }
        if (destination instanceof DocUploadDestination.SelectType) {
            DocUploadParentFragment2.logPersonaClientStatus(getAnalytics(), PersonaClientLogStatus.STARTED, getWizardState());
            DocUploadSelectTypeFragment docUploadSelectTypeFragment = (DocUploadSelectTypeFragment) DocUploadSelectTypeFragment.INSTANCE.newInstance((Parcelable) destination);
            if (((DocUploadDestination.SelectType) destination).isEntryDestination()) {
                DocUploadParentFragment2.logEntryDestination(getAnalytics(), getWizardState().getRequireActiveRequest(), destination);
                clearBackstackAndReplaceFragment(docUploadSelectTypeFragment, showTransition);
                return;
            } else {
                replaceFragment(docUploadSelectTypeFragment, showTransition);
                return;
            }
        }
        if (destination instanceof DocUploadDestination.SelectOrigin) {
            DocUploadSelectOriginFragment docUploadSelectOriginFragment = (DocUploadSelectOriginFragment) DocUploadSelectOriginFragment.INSTANCE.newInstance((Parcelable) destination);
            if (((DocUploadDestination.SelectOrigin) destination).isEntryDestination()) {
                DocUploadParentFragment2.logEntryDestination(getAnalytics(), getWizardState().getRequireActiveRequest(), destination);
                clearBackstackAndReplaceFragment(docUploadSelectOriginFragment, showTransition);
                return;
            } else {
                replaceFragment(docUploadSelectOriginFragment, showTransition);
                return;
            }
        }
        if (destination instanceof DocUploadDestination.Splash) {
            DocUploadSplashFragment docUploadSplashFragment = (DocUploadSplashFragment) DocUploadSplashFragment.INSTANCE.newInstance((Parcelable) destination);
            if (((DocUploadDestination.Splash) destination).isEntryDestination()) {
                DocUploadParentFragment2.logEntryDestination(getAnalytics(), getWizardState().getRequireActiveRequest(), destination);
                clearBackstackAndReplaceFragment(docUploadSplashFragment, showTransition);
                return;
            } else {
                replaceFragment(docUploadSplashFragment, showTransition);
                return;
            }
        }
        if (destination instanceof DocUploadDestination.CaptureDocument) {
            replaceFragment(DocUploadCaptureDocumentFragment.INSTANCE.newInstance((Parcelable) destination), showTransition);
            return;
        }
        if (destination instanceof DocUploadDestination.PhotoReview) {
            replaceFragment(DocUploadReviewPhotoFragment.INSTANCE.newInstance((Parcelable) destination), showTransition);
            return;
        }
        if (destination instanceof DocUploadDestination.PdfReview) {
            replaceFragment(DocUploadReviewPdfFragment.INSTANCE.newInstance((Parcelable) destination), showTransition);
            return;
        }
        if (destination instanceof DocUploadDestination.SelfieSplash) {
            replaceFragment(DocUploadSelfieSplashFragment.INSTANCE.newInstance((Parcelable) destination), showTransition);
            return;
        }
        if (destination instanceof DocUploadDestination.Submission) {
            replaceFragment(DocUploadSubmissionFragment.INSTANCE.newInstance((Parcelable) new DocUploadSubmissionFragment.Args((DocUploadDestination.Submission) destination, ((DocumentUpload) INSTANCE.getArgs((Fragment) this)).getMockRequests())), showTransition);
            return;
        }
        if (Intrinsics.areEqual(destination, DocUploadDestination.ChooseAddress.INSTANCE)) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.ChooseAddress(ChooseAddressSource.SETTINGS_MODIFY_RESIDENTIAL, CountryCode.Supported.UnitedStates.INSTANCE, null, null, false, 28, null), null, false, null, null, 60, null);
            return;
        }
        if (Intrinsics.areEqual(destination, DocUploadDestination.CryptoUpgradeUnderReview.INSTANCE)) {
            replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new LegacyFragmentKey.CryptoUpgradeUnderReview(LegacyFragmentKey.CryptoUpgradeUnderReview.MessageType.VERIFYING_RESIDENCY), null, 2, null), showTransition);
            return;
        }
        if (destination instanceof DocUploadDestination.Finish) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C142491(destination, this, null), 3, null);
            return;
        }
        if (Intrinsics.areEqual(destination, DocUploadDestination.PopBack.INSTANCE)) {
            requireActivity().onBackPressed();
            return;
        }
        if (Intrinsics.areEqual(destination, DocUploadDestination.DelayedPopBack.INSTANCE)) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.robinhood.android.doc.DocUploadParentFragment.navigate.2
                @Override // java.lang.Runnable
                public final void run() {
                    DocUploadParentFragment.this.requireActivity().onBackPressed();
                }
            });
            return;
        }
        if (destination instanceof DocUploadDestination.PersonaStart) {
            DocUploadParentFragment2.logEntryDestination(getAnalytics(), getWizardState().getRequireActiveRequest(), destination);
            if (getWizardState().isRequestStarted()) {
                DocUploadParentFragment2.logPersonaClientStatus(getAnalytics(), PersonaClientLogStatus.STARTED, getWizardState());
            }
            PersonaStartFragment.Companion companion = PersonaStartFragment.INSTANCE;
            DocUploadDestination.PersonaStart personaStart = (DocUploadDestination.PersonaStart) destination;
            Companion companion2 = INSTANCE;
            String style = ((DocumentUpload) companion2.getArgs((Fragment) this)).getStyle();
            clearBackstackAndReplaceFragment(companion.newInstance((Parcelable) new PersonaStartFragment.Args(personaStart, style != null ? PersonaFlowStyle.valueOf(style) : null, ((DocumentUpload) companion2.getArgs((Fragment) this)).getTheme(), personaStart.isVideoSelfie())), showTransition);
            return;
        }
        if (destination instanceof DocUploadDestination.Prism) {
            replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new PrismFragmentKey(!r12.isCollection(), ((DocUploadDestination.Prism) destination).getRequestId()), null, 2, null), showTransition);
            return;
        }
        if (destination instanceof DocUploadDestination.PersonaClient) {
            replaceFragment(PersonaClientLoadingFragment.INSTANCE.newInstance((Parcelable) DocUploadDestination.PersonaClient.copy$default((DocUploadDestination.PersonaClient) destination, null, null, false, false, ((DocumentUpload) INSTANCE.getArgs((Fragment) this)).getExitOnPersonaError(), 15, null)), showTransition);
            return;
        }
        if (destination instanceof DocUploadDestination.PersonaSubmittedReport) {
            DocUploadPersonaSubmittedReportFragment.Companion companion3 = DocUploadPersonaSubmittedReportFragment.INSTANCE;
            List<DocumentRequest> requireActiveRequest = getWizardState().getRequireActiveRequest();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(requireActiveRequest, 10));
            Iterator<T> it = requireActiveRequest.iterator();
            while (it.hasNext()) {
                UUID id = ((DocumentRequest) it.next()).getId();
                Intrinsics.checkNotNull(id);
                arrayList.add(id);
            }
            clearBackstackAndReplaceFragment(companion3.newInstance((Parcelable) new DocUploadPersonaSubmittedReportFragment.Args(arrayList)), showTransition);
            return;
        }
        if (!(destination instanceof DocUploadDestination.Thanks)) {
            throw new NoWhenBranchMatchedException();
        }
        clearBackstackAndReplaceFragment(DocUploadThanksFragment.INSTANCE.newInstance((Parcelable) new DocUploadThanksFragment.Args(((DocUploadDestination.Thanks) destination).getContext())), showTransition);
    }

    /* compiled from: DocUploadParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.DocUploadParentFragment$navigate$1", m3645f = "DocUploadParentFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.DocUploadParentFragment$navigate$1 */
    static final class C142491 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DocUploadDestination $destination;
        int label;
        final /* synthetic */ DocUploadParentFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C142491(DocUploadDestination docUploadDestination, DocUploadParentFragment docUploadParentFragment, Continuation<? super C142491> continuation) {
            super(2, continuation);
            this.$destination = docUploadDestination;
            this.this$0 = docUploadParentFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C142491(this.$destination, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C142491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (((DocUploadDestination.Finish) this.$destination).getSuccessful()) {
                this.this$0.requireActivity().setResult(-1);
            } else {
                this.this$0.requireActivity().setResult(2);
            }
            OnboardingClickHandler clickHandler = this.this$0.getClickHandler();
            DocUploadParentFragment docUploadParentFragment = this.this$0;
            clickHandler.onFinishDocUpload(docUploadParentFragment, docUploadParentFragment.getCardManager(), this.this$0.getSortingHatStore());
            return Unit.INSTANCE;
        }
    }

    private final void clearBackstackAndReplaceFragment(Fragment newFragment, boolean showTransition) {
        popEntireFragmentBackstack(true);
        if (showTransition) {
            replaceFragmentWithoutBackStack(newFragment);
        } else {
            replaceFragmentWithoutAnimationAndBackStack(newFragment);
        }
    }

    private final void replaceFragment(Fragment fragment, boolean showTransition) {
        if (showTransition) {
            replaceFragment(fragment);
        } else {
            replaceFragmentWithoutAnimation(fragment);
        }
    }

    private final void performSideEffects(DocUploadEvent event) {
        DocUploadParentFragment2.logDocUploadEvent(getAnalytics(), event, getWizardState());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (getChildFragmentManager().getBackStackEntryCount() == 0) {
            DocUploadParentFragment2.logPersonaClientStatus(getAnalytics(), PersonaClientLogStatus.CANCELED, getWizardState());
        }
        return super.onBackPressed();
    }

    @Override // com.robinhood.shared.documents.lib.docupload.DocUploadEventReceiver
    public void onError(Throwable error) throws Throwable {
        Intrinsics.checkNotNullParameter(error, "error");
        ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, error, true, false, 0, null, 56, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C14254R.id.dialog_id_update_app) {
            DocUploadEventReceiver.DefaultImpls.onEvent$default(this, new DocUploadEvent.Exit(false, 1, null), false, 2, null);
        } else {
            super.onDialogDismissed(id);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) throws Resources.NotFoundException {
        if (id == C14254R.id.dialog_id_update_app) {
            GooglePlay googlePlay = GooglePlay.INSTANCE;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            if (!googlePlay.launchStore(contextRequireContext)) {
                Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                Resources resources = getResources();
                int i = C11048R.string.force_update_error_no_play_store;
                AppType appType = getAppType();
                Resources resources2 = getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                String string2 = resources.getString(i, appType.toAppName(resources2));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                ContextsUiExtensions.showLongToast(contextRequireContext2, string2);
            }
            DocUploadEventReceiver.DefaultImpls.onEvent$default(this, new DocUploadEvent.Exit(false, 1, null), false, 2, null);
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    /* compiled from: DocUploadParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/doc/DocUploadParentFragment$DocUploadSubmissionException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "detailMessage", "", "throwable", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DocUploadSubmissionException extends Exception {
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DocUploadSubmissionException(String detailMessage, Throwable throwable) {
            super(detailMessage, throwable);
            Intrinsics.checkNotNullParameter(detailMessage, "detailMessage");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
        }
    }

    /* compiled from: DocUploadParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/doc/DocUploadParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/onboarding/contracts/DocumentUpload;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/doc/DocUploadParentFragment;", "<init>", "()V", "V2_TAG", "", "USER_ACTION_DOC_UPLOAD_EVENT", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<DocumentUpload>, FragmentWithArgsCompanion<DocUploadParentFragment, DocumentUpload> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public DocumentUpload getArgs(DocUploadParentFragment docUploadParentFragment) {
            return (DocumentUpload) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, docUploadParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DocUploadParentFragment newInstance(DocumentUpload documentUpload) {
            return (DocUploadParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, documentUpload);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DocUploadParentFragment docUploadParentFragment, DocumentUpload documentUpload) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, docUploadParentFragment, documentUpload);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(DocumentUpload key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!key.getMockRequests() || BuildFlavors.INSTANCE.isDebugOrInternal()) {
                return newInstance((Parcelable) key);
            }
            throw new IllegalStateException("Mock requests are only allowed for debug or internal use");
        }
    }
}
