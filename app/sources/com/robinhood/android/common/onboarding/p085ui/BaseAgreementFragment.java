package com.robinhood.android.common.onboarding.p085ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.core.text.PrecomputedTextCompat;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.brokeragecontent.BrokerageResource;
import com.robinhood.android.brokeragecontent.BrokerageResourceManager;
import com.robinhood.android.common.onboarding.C11287R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.GoldOverlay;
import com.robinhood.contentful.markdown.ContentRenderer;
import com.robinhood.librobinhood.data.store.UserInfoStore;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.common.agreementview.RdsAgreementView;
import com.robinhood.staticcontent.model.Agreement;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import dispatch.core.Suspend;
import io.noties.markwon.Markwon;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: BaseAgreementFragment.kt */
@Metadata(m3635d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u0010\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0016J\u001a\u0010C\u001a\u00020@2\u0006\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\u0010\u0010H\u001a\u00020@2\u0006\u0010I\u001a\u00020JH\u0016J\u0010\u0010K\u001a\u00020@2\u0006\u0010D\u001a\u00020'H\u0016J\b\u0010L\u001a\u00020@H&J\b\u0010M\u001a\u00020@H\u0016J\u001e\u0010N\u001a\u00020@2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020-0P2\b\b\u0002\u00108\u001a\u000209J \u0010Q\u001a\u00020@2\u0006\u0010R\u001a\u00020S2\b\b\u0002\u00108\u001a\u0002092\u0006\u0010T\u001a\u00020SJ\u0016\u0010U\u001a\u00020@2\u0006\u0010,\u001a\u00020-H\u0082@¢\u0006\u0002\u0010VJ\u001e\u0010W\u001a\u00020@2\u0006\u0010,\u001a\u0002032\u0006\u0010T\u001a\u00020SH\u0082@¢\u0006\u0002\u0010XR\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001b\u0010&\u001a\u00020'8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u00102\u001a\u0004\u0018\u000103X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u000e\u00108\u001a\u000209X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010:\u001a\u0002098TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010=\u001a\u0002098TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b>\u0010<¨\u0006Y"}, m3636d2 = {"Lcom/robinhood/android/common/onboarding/ui/BaseAgreementFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/shared/common/agreementview/RdsAgreementView$OnAgreementAcceptedListener;", "layoutRes", "", "<init>", "(I)V", "()V", "agreementSingletons", "Lcom/robinhood/android/common/onboarding/ui/BaseAgreementFragmentSingletons;", "getAgreementSingletons", "()Lcom/robinhood/android/common/onboarding/ui/BaseAgreementFragmentSingletons;", "setAgreementSingletons", "(Lcom/robinhood/android/common/onboarding/ui/BaseAgreementFragmentSingletons;)V", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "getAgreementsStore", "()Lcom/robinhood/android/agreements/AgreementsStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "brokerageResourceManager", "Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "getBrokerageResourceManager", "()Lcom/robinhood/android/brokeragecontent/BrokerageResourceManager;", "contentRenderer", "Lcom/robinhood/contentful/markdown/ContentRenderer;", "getContentRenderer", "()Lcom/robinhood/contentful/markdown/ContentRenderer;", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "userInfoStore", "Lcom/robinhood/librobinhood/data/store/UserInfoStore;", "getUserInfoStore", "()Lcom/robinhood/librobinhood/data/store/UserInfoStore;", "agreementView", "Lcom/robinhood/shared/common/agreementview/RdsAgreementView;", "getAgreementView", "()Lcom/robinhood/shared/common/agreementview/RdsAgreementView;", "agreementView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "agreement", "Lcom/robinhood/staticcontent/model/Agreement;", "getAgreement", "()Lcom/robinhood/staticcontent/model/Agreement;", "setAgreement", "(Lcom/robinhood/staticcontent/model/Agreement;)V", "agreementWithContent", "Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "getAgreementWithContent", "()Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "setAgreementWithContent", "(Lcom/robinhood/android/agreements/models/UiAgreementWithContent;)V", "useProgressBar", "", "forAchromatic", "getForAchromatic", "()Z", "forGold", "getForGold", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onAgreementAccepted", "onAgreementRecorded", "onAgreementLoaded", "loadBrokerageAgreement", "brokerageResource", "Lcom/robinhood/android/brokeragecontent/BrokerageResource;", "loadIdentiAgreement", "agreementType", "", "title", "loadMarkdownText", "(Lcom/robinhood/staticcontent/model/Agreement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadIdentiMarkdownText", "(Lcom/robinhood/android/agreements/models/UiAgreementWithContent;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-common-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseAgreementFragment extends BaseFragment implements RdsAgreementView.OnAgreementAcceptedListener {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BaseAgreementFragment.class, "agreementView", "getAgreementView()Lcom/robinhood/shared/common/agreementview/RdsAgreementView;", 0))};
    private Agreement agreement;
    public BaseAgreementFragmentSingletons agreementSingletons;

    /* renamed from: agreementView$delegate, reason: from kotlin metadata */
    private final Interfaces2 agreementView;
    private UiAgreementWithContent agreementWithContent;
    private boolean useProgressBar;

    protected boolean getForAchromatic() {
        return false;
    }

    protected boolean getForGold() {
        return false;
    }

    public void onAgreementLoaded() {
    }

    public abstract void onAgreementRecorded();

    public BaseAgreementFragment(int i) {
        super(i);
        this.agreementView = bindView(C11287R.id.base_agreement_view);
        this.useProgressBar = true;
    }

    public BaseAgreementFragment() {
        this(C11287R.layout.fragment_base_agreement);
    }

    public final BaseAgreementFragmentSingletons getAgreementSingletons() {
        BaseAgreementFragmentSingletons baseAgreementFragmentSingletons = this.agreementSingletons;
        if (baseAgreementFragmentSingletons != null) {
            return baseAgreementFragmentSingletons;
        }
        Intrinsics.throwUninitializedPropertyAccessException("agreementSingletons");
        return null;
    }

    public final void setAgreementSingletons(BaseAgreementFragmentSingletons baseAgreementFragmentSingletons) {
        Intrinsics.checkNotNullParameter(baseAgreementFragmentSingletons, "<set-?>");
        this.agreementSingletons = baseAgreementFragmentSingletons;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AgreementsStore getAgreementsStore() {
        return getAgreementSingletons().getAgreementsStore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AnalyticsLogger getAnalytics() {
        return getAgreementSingletons().getAnalytics();
    }

    public final BrokerageResourceManager getBrokerageResourceManager() {
        return getAgreementSingletons().getBrokerageResourceManager();
    }

    public final ContentRenderer getContentRenderer() {
        return getAgreementSingletons().getContentRenderer();
    }

    public final Markwon getMarkwon() {
        return getAgreementSingletons().getMarkwon();
    }

    public final UserInfoStore getUserInfoStore() {
        return getAgreementSingletons().getUserInfoStore();
    }

    protected final RdsAgreementView getAgreementView() {
        return (RdsAgreementView) this.agreementView.getValue(this, $$delegatedProperties[0]);
    }

    protected final Agreement getAgreement() {
        return this.agreement;
    }

    protected final void setAgreement(Agreement agreement) {
        this.agreement = agreement;
    }

    protected final UiAgreementWithContent getAgreementWithContent() {
        return this.agreementWithContent;
    }

    protected final void setAgreementWithContent(UiAgreementWithContent uiAgreementWithContent) {
        this.agreementWithContent = uiAgreementWithContent;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        if (getForAchromatic()) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
        }
        if (getForGold()) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), GoldOverlay.INSTANCE, null, 2, null);
        }
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getAgreementView().setOnAgreementAcceptedListener(this);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle((CharSequence) null);
    }

    @Override // com.robinhood.shared.common.agreementview.RdsAgreementView.OnAgreementAcceptedListener
    public void onAgreementAccepted(RdsAgreementView view) {
        Agreement agreement;
        Intrinsics.checkNotNullParameter(view, "view");
        RhToolbar rhToolbar = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        rhToolbar.setLoadingViewVisible(this.useProgressBar);
        UiAgreementWithContent uiAgreementWithContent = this.agreementWithContent;
        if ((uiAgreementWithContent == null || getLifecycleScope().launchWhenResumed(new BaseAgreementFragment4(this, uiAgreementWithContent, null)) == null) && (agreement = this.agreement) != null) {
            getLifecycleScope().launchWhenResumed(new BaseAgreementFragment5(this, agreement, null));
        }
    }

    public static /* synthetic */ void loadBrokerageAgreement$default(BaseAgreementFragment baseAgreementFragment, BrokerageResource brokerageResource, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadBrokerageAgreement");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        baseAgreementFragment.loadBrokerageAgreement(brokerageResource, z);
    }

    public final void loadBrokerageAgreement(BrokerageResource<Agreement> brokerageResource, boolean useProgressBar) {
        Intrinsics.checkNotNullParameter(brokerageResource, "brokerageResource");
        this.useProgressBar = useProgressBar;
        RhToolbar rhToolbar = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        rhToolbar.setLoadingViewVisible(this.useProgressBar);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C112881(brokerageResource, null), 3, null);
    }

    /* compiled from: BaseAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$loadBrokerageAgreement$1", m3645f = "BaseAgreementFragment.kt", m3646l = {201, EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$loadBrokerageAgreement$1 */
    static final class C112881 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BrokerageResource<Agreement> $brokerageResource;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C112881(BrokerageResource<Agreement> brokerageResource, Continuation<? super C112881> continuation) {
            super(2, continuation);
            this.$brokerageResource = brokerageResource;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseAgreementFragment.this.new C112881(this.$brokerageResource, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C112881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
        
            if (dispatch.core.Suspend.withMain$default(null, r9, r8, 1, null) != r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            BaseAgreementFragment baseAgreementFragment;
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IdlingResourceCounters2.increment(IdlingResourceType.BASE_AGREEMENT_CONTENTFUL_LOAD);
                BaseAgreementFragment baseAgreementFragment2 = BaseAgreementFragment.this;
                Single singleLoadResource = baseAgreementFragment2.getBrokerageResourceManager().loadResource(this.$brokerageResource);
                this.L$0 = baseAgreementFragment2;
                this.label = 1;
                Object objAwait = RxAwait3.await(singleLoadResource, this);
                if (objAwait != coroutine_suspended) {
                    baseAgreementFragment = baseAgreementFragment2;
                    obj = objAwait;
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                baseAgreementFragment = (BaseAgreementFragment) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                baseAgreementFragment = (BaseAgreementFragment) this.L$1;
                obj2 = this.L$0;
                ResultKt.throwOnFailure(obj);
                IdlingResourceCounters2.decrement(IdlingResourceType.BASE_AGREEMENT_CONTENTFUL_LOAD);
                baseAgreementFragment.setAgreement((Agreement) obj2);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(BaseAgreementFragment.this, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
            }
            BaseAgreementFragment baseAgreementFragment3 = BaseAgreementFragment.this;
            Agreement agreement = (Agreement) obj;
            Intrinsics.checkNotNull(agreement);
            this.L$0 = obj;
            this.L$1 = baseAgreementFragment;
            this.label = 2;
            if (baseAgreementFragment3.loadMarkdownText(agreement, this) != coroutine_suspended) {
                obj2 = obj;
                IdlingResourceCounters2.decrement(IdlingResourceType.BASE_AGREEMENT_CONTENTFUL_LOAD);
                baseAgreementFragment.setAgreement((Agreement) obj2);
                AnonymousClass2 anonymousClass22 = new AnonymousClass2(BaseAgreementFragment.this, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
            }
            return coroutine_suspended;
        }

        /* compiled from: BaseAgreementFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$loadBrokerageAgreement$1$2", m3645f = "BaseAgreementFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$loadBrokerageAgreement$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ BaseAgreementFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(BaseAgreementFragment baseAgreementFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = baseAgreementFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                RhToolbar rhToolbar = this.this$0.getRhToolbar();
                Intrinsics.checkNotNull(rhToolbar);
                rhToolbar.setLoadingViewVisible(false);
                this.this$0.onAgreementLoaded();
                return Unit.INSTANCE;
            }
        }
    }

    public static /* synthetic */ void loadIdentiAgreement$default(BaseAgreementFragment baseAgreementFragment, String str, boolean z, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadIdentiAgreement");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        baseAgreementFragment.loadIdentiAgreement(str, z, str2);
    }

    public final void loadIdentiAgreement(String agreementType, boolean useProgressBar, String title) {
        Intrinsics.checkNotNullParameter(agreementType, "agreementType");
        Intrinsics.checkNotNullParameter(title, "title");
        this.useProgressBar = useProgressBar;
        RhToolbar rhToolbar = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        rhToolbar.setLoadingViewVisible(this.useProgressBar);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C112891(agreementType, title, null), 3, null);
    }

    /* compiled from: BaseAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$loadIdentiAgreement$1", m3645f = "BaseAgreementFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE, 167, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$loadIdentiAgreement$1 */
    static final class C112891 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $agreementType;
        final /* synthetic */ String $title;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C112891(String str, String str2, Continuation<? super C112891> continuation) {
            super(2, continuation);
            this.$agreementType = str;
            this.$title = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseAgreementFragment.this.new C112891(this.$agreementType, this.$title, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C112891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
        
            if (dispatch.core.Suspend.withMain$default(null, r10, r9, 1, null) != r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            BaseAgreementFragment baseAgreementFragment;
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IdlingResourceCounters2.increment(IdlingResourceType.BASE_AGREEMENT_CONTENTFUL_LOAD);
                BaseAgreementFragment baseAgreementFragment2 = BaseAgreementFragment.this;
                AgreementsStore agreementsStore = baseAgreementFragment2.getAgreementsStore();
                String str = this.$agreementType;
                this.L$0 = baseAgreementFragment2;
                this.label = 1;
                Object agreementWithContent = agreementsStore.getAgreementWithContent(str, this);
                if (agreementWithContent != coroutine_suspended) {
                    baseAgreementFragment = baseAgreementFragment2;
                    obj = agreementWithContent;
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                baseAgreementFragment = (BaseAgreementFragment) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                baseAgreementFragment = (BaseAgreementFragment) this.L$1;
                obj2 = this.L$0;
                ResultKt.throwOnFailure(obj);
                IdlingResourceCounters2.decrement(IdlingResourceType.BASE_AGREEMENT_CONTENTFUL_LOAD);
                baseAgreementFragment.setAgreementWithContent((UiAgreementWithContent) obj2);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(BaseAgreementFragment.this, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
            }
            BaseAgreementFragment baseAgreementFragment3 = BaseAgreementFragment.this;
            String str2 = this.$title;
            this.L$0 = obj;
            this.L$1 = baseAgreementFragment;
            this.label = 2;
            if (baseAgreementFragment3.loadIdentiMarkdownText((UiAgreementWithContent) obj, str2, this) != coroutine_suspended) {
                obj2 = obj;
                IdlingResourceCounters2.decrement(IdlingResourceType.BASE_AGREEMENT_CONTENTFUL_LOAD);
                baseAgreementFragment.setAgreementWithContent((UiAgreementWithContent) obj2);
                AnonymousClass2 anonymousClass22 = new AnonymousClass2(BaseAgreementFragment.this, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
            }
            return coroutine_suspended;
        }

        /* compiled from: BaseAgreementFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$loadIdentiAgreement$1$2", m3645f = "BaseAgreementFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$loadIdentiAgreement$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ BaseAgreementFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(BaseAgreementFragment baseAgreementFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = baseAgreementFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                RhToolbar rhToolbar = this.this$0.getRhToolbar();
                Intrinsics.checkNotNull(rhToolbar);
                rhToolbar.setLoadingViewVisible(false);
                this.this$0.onAgreementLoaded();
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: BaseAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$loadMarkdownText$2", m3645f = "BaseAgreementFragment.kt", m3646l = {EnumC7081g.f2780x600b66fe}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$loadMarkdownText$2 */
    static final class C112912 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Agreement $agreement;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C112912(Agreement agreement, Continuation<? super C112912> continuation) {
            super(2, continuation);
            this.$agreement = agreement;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseAgreementFragment.this.new C112912(this.$agreement, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C112912) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BaseAgreementFragment3 baseAgreementFragment3 = new BaseAgreementFragment3(BaseAgreementFragment.this, this.$agreement, null);
                this.label = 1;
                obj = Suspend.withDefault$default(null, baseAgreementFragment3, this, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            PrecomputedTextCompat precomputedTextCompat = (PrecomputedTextCompat) obj;
            RdsAgreementView agreementView = BaseAgreementFragment.this.getAgreementView();
            Intrinsics.checkNotNull(precomputedTextCompat);
            agreementView.loadFromString(precomputedTextCompat);
            RhToolbar rhToolbar = BaseAgreementFragment.this.getRhToolbar();
            Intrinsics.checkNotNull(rhToolbar);
            rhToolbar.setTitle(this.$agreement.getTitle());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadMarkdownText(Agreement agreement, Continuation<? super Unit> continuation) {
        return Suspend.withMain$default(null, new C112912(agreement, null), continuation, 1, null);
    }

    /* compiled from: BaseAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$loadIdentiMarkdownText$2", m3645f = "BaseAgreementFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.onboarding.ui.BaseAgreementFragment$loadIdentiMarkdownText$2 */
    static final class C112902 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UiAgreementWithContent $agreement;
        final /* synthetic */ String $title;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C112902(String str, UiAgreementWithContent uiAgreementWithContent, Continuation<? super C112902> continuation) {
            super(2, continuation);
            this.$title = str;
            this.$agreement = uiAgreementWithContent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseAgreementFragment.this.new C112902(this.$title, this.$agreement, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C112902) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BaseAgreementFragment2 baseAgreementFragment2 = new BaseAgreementFragment2(BaseAgreementFragment.this, this.$agreement, null);
                this.label = 1;
                obj = Suspend.withDefault$default(null, baseAgreementFragment2, this, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            PrecomputedTextCompat precomputedTextCompat = (PrecomputedTextCompat) obj;
            RdsAgreementView agreementView = BaseAgreementFragment.this.getAgreementView();
            Intrinsics.checkNotNull(precomputedTextCompat);
            agreementView.loadFromString(precomputedTextCompat);
            RhToolbar rhToolbar = BaseAgreementFragment.this.getRhToolbar();
            Intrinsics.checkNotNull(rhToolbar);
            rhToolbar.setTitle(this.$title);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadIdentiMarkdownText(UiAgreementWithContent uiAgreementWithContent, String str, Continuation<? super Unit> continuation) {
        return Suspend.withMain$default(null, new C112902(str, uiAgreementWithContent, null), continuation, 1, null);
    }
}
