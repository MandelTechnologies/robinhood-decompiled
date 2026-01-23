package com.stripe.android.stripe3ds2.views;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.stripe.android.stripe3ds2.R$drawable;
import com.stripe.android.stripe3ds2.R$layout;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeFragmentBinding;
import com.stripe.android.stripe3ds2.init.p418ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.init.p418ui.UiCustomization;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.IntentData;
import com.stripe.android.stripe3ds2.transaction.TransactionTimer;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.transactions.UiType;
import com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: ChallengeFragment.kt */
@Metadata(m3635d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 s2\u00020\u0001:\u0001sBI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010#\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b/\u0010.J\u0017\u0010-\u001a\u00020\u001a2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b-\u00102J!\u00107\u001a\u00020\u001a2\u0006\u00104\u001a\u0002032\b\u00106\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u001aH\u0016¢\u0006\u0004\b9\u0010\u001eJ\r\u0010:\u001a\u00020\u001a¢\u0006\u0004\b:\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010;R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010>R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010?R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010@R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010AR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010BR\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010CR\u001b\u0010I\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020J8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bK\u0010F\u001a\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010F\u001a\u0004\bQ\u0010RR\u0018\u0010U\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001b\u0010[\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010F\u001a\u0004\bY\u0010ZR\u001b\u0010`\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010F\u001a\u0004\b^\u0010_R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00148@X\u0080\u0084\u0002¢\u0006\f\n\u0004\ba\u0010F\u001a\u0004\bb\u0010cR\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00168@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bd\u0010F\u001a\u0004\be\u0010fR\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00188@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bg\u0010F\u001a\u0004\bh\u0010iR\u0014\u0010m\u001a\u00020j8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0014\u0010p\u001a\u00020T8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0014\u0010r\u001a\u00020D8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bq\u0010H¨\u0006t"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "uiCustomization", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "transactionTimer", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "errorRequestExecutor", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "challengeActionHandler", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "initialUiType", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "intentData", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;Lkotlin/coroutines/CoroutineContext;)V", "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;", "challengeZoneTextView", "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;", "challengeZoneSelectView", "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;", "challengeZoneWebView", "", "configure", "(Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;)V", "updateBrandZoneImages", "()V", "configureInformationZoneView", "configureChallengeZoneView", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "result", "onChallengeRequestResult", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;)V", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "cresData", "onSuccess", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;)V", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", WebsocketGatewayConstants.DATA_KEY, "onError", "(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;)V", "onTimeout", "", "throwable", "(Ljava/lang/Throwable;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "refreshUi", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "Lkotlin/coroutines/CoroutineContext;", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "", "uiTypeCode$delegate", "Lkotlin/Lazy;", "getUiTypeCode", "()Ljava/lang/String;", "uiTypeCode", "Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;", "viewModel$delegate", "getViewModel$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;", "viewModel", "Lcom/stripe/android/stripe3ds2/views/ChallengeEntryViewFactory;", "challengeEntryViewFactory$delegate", "getChallengeEntryViewFactory", "()Lcom/stripe/android/stripe3ds2/views/ChallengeEntryViewFactory;", "challengeEntryViewFactory", "Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;", "_viewBinding", "Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;", "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;", "challengeZoneView$delegate", "getChallengeZoneView", "()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;", "challengeZoneView", "Lcom/stripe/android/stripe3ds2/views/BrandZoneView;", "brandZoneView$delegate", "getBrandZoneView", "()Lcom/stripe/android/stripe3ds2/views/BrandZoneView;", "brandZoneView", "challengeZoneTextView$delegate", "getChallengeZoneTextView$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;", "challengeZoneSelectView$delegate", "getChallengeZoneSelectView$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;", "challengeZoneWebView$delegate", "getChallengeZoneWebView$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "getChallengeAction", "()Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "challengeAction", "getViewBinding$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;", "viewBinding", "getUserEntry$3ds2sdk_release", "userEntry", "Companion", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class ChallengeFragment extends Fragment {
    private StripeChallengeFragmentBinding _viewBinding;

    /* renamed from: brandZoneView$delegate, reason: from kotlin metadata */
    private final Lazy brandZoneView;
    private final ChallengeActionHandler challengeActionHandler;

    /* renamed from: challengeEntryViewFactory$delegate, reason: from kotlin metadata */
    private final Lazy challengeEntryViewFactory;

    /* renamed from: challengeZoneSelectView$delegate, reason: from kotlin metadata */
    private final Lazy challengeZoneSelectView;

    /* renamed from: challengeZoneTextView$delegate, reason: from kotlin metadata */
    private final Lazy challengeZoneTextView;

    /* renamed from: challengeZoneView$delegate, reason: from kotlin metadata */
    private final Lazy challengeZoneView;

    /* renamed from: challengeZoneWebView$delegate, reason: from kotlin metadata */
    private final Lazy challengeZoneWebView;
    private ChallengeResponseData cresData;
    private final ErrorReporter errorReporter;
    private final ErrorRequestExecutor errorRequestExecutor;
    private final UiType initialUiType;
    private final IntentData intentData;
    private final TransactionTimer transactionTimer;
    private final StripeUiCustomization uiCustomization;

    /* renamed from: uiTypeCode$delegate, reason: from kotlin metadata */
    private final Lazy uiTypeCode;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;
    private final CoroutineContext workContext;

    /* compiled from: ChallengeFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UiType.values().length];
            try {
                iArr[UiType.Text.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UiType.SingleSelect.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UiType.MultiSelect.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UiType.Html.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UiType.OutOfBand.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final String getUiTypeCode() {
        return (String) this.uiTypeCode.getValue();
    }

    public final ChallengeActivityViewModel getViewModel$3ds2sdk_release() {
        return (ChallengeActivityViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChallengeEntryViewFactory getChallengeEntryViewFactory() {
        return (ChallengeEntryViewFactory) this.challengeEntryViewFactory.getValue();
    }

    public final StripeChallengeFragmentBinding getViewBinding$3ds2sdk_release() {
        StripeChallengeFragmentBinding stripeChallengeFragmentBinding = this._viewBinding;
        if (stripeChallengeFragmentBinding != null) {
            return stripeChallengeFragmentBinding;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final ChallengeZoneView getChallengeZoneView() {
        return (ChallengeZoneView) this.challengeZoneView.getValue();
    }

    private final BrandZoneView getBrandZoneView() {
        return (BrandZoneView) this.brandZoneView.getValue();
    }

    public final ChallengeZoneTextView getChallengeZoneTextView$3ds2sdk_release() {
        return (ChallengeZoneTextView) this.challengeZoneTextView.getValue();
    }

    public final ChallengeZoneSelectView getChallengeZoneSelectView$3ds2sdk_release() {
        return (ChallengeZoneSelectView) this.challengeZoneSelectView.getValue();
    }

    public final ChallengeZoneWebView getChallengeZoneWebView$3ds2sdk_release() {
        return (ChallengeZoneWebView) this.challengeZoneWebView.getValue();
    }

    public final String getUserEntry$3ds2sdk_release() {
        ChallengeResponseData challengeResponseData = this.cresData;
        String userEntry = null;
        if (challengeResponseData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData = null;
        }
        UiType uiType = challengeResponseData.getUiType();
        int i = uiType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[uiType.ordinal()];
        if (i == 1) {
            ChallengeZoneTextView challengeZoneTextView$3ds2sdk_release = getChallengeZoneTextView$3ds2sdk_release();
            if (challengeZoneTextView$3ds2sdk_release != null) {
                userEntry = challengeZoneTextView$3ds2sdk_release.getUserEntry();
            }
        } else if (i == 2 || i == 3) {
            ChallengeZoneSelectView challengeZoneSelectView$3ds2sdk_release = getChallengeZoneSelectView$3ds2sdk_release();
            if (challengeZoneSelectView$3ds2sdk_release != null) {
                userEntry = challengeZoneSelectView$3ds2sdk_release.getUserEntry();
            }
        } else if (i != 4) {
            userEntry = "";
        } else {
            ChallengeZoneWebView challengeZoneWebView$3ds2sdk_release = getChallengeZoneWebView$3ds2sdk_release();
            if (challengeZoneWebView$3ds2sdk_release != null) {
                userEntry = challengeZoneWebView$3ds2sdk_release.getUserEntry();
            }
        }
        return userEntry == null ? "" : userEntry;
    }

    private final ChallengeAction getChallengeAction() {
        ChallengeResponseData challengeResponseData = this.cresData;
        if (challengeResponseData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData = null;
        }
        UiType uiType = challengeResponseData.getUiType();
        int i = uiType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[uiType.ordinal()];
        if (i == 4) {
            return new ChallengeAction.HtmlForm(getUserEntry$3ds2sdk_release());
        }
        if (i == 5) {
            return ChallengeAction.Oob.INSTANCE;
        }
        return new ChallengeAction.NativeForm(getUserEntry$3ds2sdk_release());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        ChallengeResponseData challengeResponseData = arguments != null ? (ChallengeResponseData) BundleCompat.getParcelable(arguments, "arg_cres", ChallengeResponseData.class) : null;
        if (challengeResponseData == null) {
            onError(new IllegalArgumentException("Could not start challenge screen. Challenge response data was null."));
            return;
        }
        this.cresData = challengeResponseData;
        this._viewBinding = StripeChallengeFragmentBinding.bind(view);
        getViewModel$3ds2sdk_release().getChallengeText().observe(getViewLifecycleOwner(), new ChallengeFragment$sam$androidx_lifecycle_Observer$0(new Function1<String, Unit>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment.onViewCreated.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                ChallengeZoneTextView challengeZoneTextView$3ds2sdk_release = ChallengeFragment.this.getChallengeZoneTextView$3ds2sdk_release();
                if (challengeZoneTextView$3ds2sdk_release != null) {
                    Intrinsics.checkNotNull(str);
                    challengeZoneTextView$3ds2sdk_release.setText(str);
                }
            }
        }));
        getViewModel$3ds2sdk_release().getRefreshUi().observe(getViewLifecycleOwner(), new ChallengeFragment$sam$androidx_lifecycle_Observer$0(new Function1<Unit, Unit>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment.onViewCreated.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
                invoke2(unit);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Unit unit) {
                ChallengeFragment.this.refreshUi();
            }
        }));
        getViewModel$3ds2sdk_release().getChallengeRequestResult().observe(getViewLifecycleOwner(), new ChallengeFragment$sam$androidx_lifecycle_Observer$0(new Function1<ChallengeRequestResult, Unit>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment.onViewCreated.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ChallengeRequestResult challengeRequestResult) {
                invoke2(challengeRequestResult);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ChallengeRequestResult challengeRequestResult) {
                if (challengeRequestResult != null) {
                    ChallengeFragment.this.onChallengeRequestResult(challengeRequestResult);
                }
            }
        }));
        updateBrandZoneImages();
        configure(getChallengeZoneTextView$3ds2sdk_release(), getChallengeZoneSelectView$3ds2sdk_release(), getChallengeZoneWebView$3ds2sdk_release());
        configureInformationZoneView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._viewBinding = null;
    }

    private final void configure(ChallengeZoneTextView challengeZoneTextView, ChallengeZoneSelectView challengeZoneSelectView, ChallengeZoneWebView challengeZoneWebView) {
        ChallengeResponseData challengeResponseData = null;
        if (challengeZoneTextView != null) {
            getChallengeZoneView().setChallengeEntryView(challengeZoneTextView);
            ChallengeZoneView challengeZoneView = getChallengeZoneView();
            ChallengeResponseData challengeResponseData2 = this.cresData;
            if (challengeResponseData2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
                challengeResponseData2 = null;
            }
            challengeZoneView.setSubmitButton(challengeResponseData2.getSubmitAuthenticationLabel(), this.uiCustomization.getButtonCustomization(UiCustomization.ButtonType.SUBMIT));
            ChallengeZoneView challengeZoneView2 = getChallengeZoneView();
            ChallengeResponseData challengeResponseData3 = this.cresData;
            if (challengeResponseData3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
            } else {
                challengeResponseData = challengeResponseData3;
            }
            challengeZoneView2.setResendButtonLabel(challengeResponseData.getResendInformationLabel(), this.uiCustomization.getButtonCustomization(UiCustomization.ButtonType.RESEND));
        } else if (challengeZoneSelectView != null) {
            getChallengeZoneView().setChallengeEntryView(challengeZoneSelectView);
            ChallengeZoneView challengeZoneView3 = getChallengeZoneView();
            ChallengeResponseData challengeResponseData4 = this.cresData;
            if (challengeResponseData4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
                challengeResponseData4 = null;
            }
            challengeZoneView3.setSubmitButton(challengeResponseData4.getSubmitAuthenticationLabel(), this.uiCustomization.getButtonCustomization(UiCustomization.ButtonType.NEXT));
            ChallengeZoneView challengeZoneView4 = getChallengeZoneView();
            ChallengeResponseData challengeResponseData5 = this.cresData;
            if (challengeResponseData5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
            } else {
                challengeResponseData = challengeResponseData5;
            }
            challengeZoneView4.setResendButtonLabel(challengeResponseData.getResendInformationLabel(), this.uiCustomization.getButtonCustomization(UiCustomization.ButtonType.RESEND));
        } else if (challengeZoneWebView != null) {
            getChallengeZoneView().setChallengeEntryView(challengeZoneWebView);
            getChallengeZoneView().setInfoHeaderText(null, null);
            getChallengeZoneView().setInfoText(null, null);
            getChallengeZoneView().setSubmitButton(null, null);
            challengeZoneWebView.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChallengeFragment.configure$lambda$1(this.f$0, view);
                }
            });
            getBrandZoneView().setVisibility(8);
        } else {
            ChallengeResponseData challengeResponseData6 = this.cresData;
            if (challengeResponseData6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
                challengeResponseData6 = null;
            }
            if (challengeResponseData6.getUiType() == UiType.OutOfBand) {
                ChallengeZoneView challengeZoneView5 = getChallengeZoneView();
                ChallengeResponseData challengeResponseData7 = this.cresData;
                if (challengeResponseData7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cresData");
                } else {
                    challengeResponseData = challengeResponseData7;
                }
                challengeZoneView5.setSubmitButton(challengeResponseData.getOobContinueLabel(), this.uiCustomization.getButtonCustomization(UiCustomization.ButtonType.CONTINUE));
            }
        }
        configureChallengeZoneView();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeFragment(StripeUiCustomization uiCustomization, TransactionTimer transactionTimer, ErrorRequestExecutor errorRequestExecutor, ErrorReporter errorReporter, ChallengeActionHandler challengeActionHandler, UiType uiType, IntentData intentData, CoroutineContext workContext) {
        super(R$layout.stripe_challenge_fragment);
        Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
        Intrinsics.checkNotNullParameter(transactionTimer, "transactionTimer");
        Intrinsics.checkNotNullParameter(errorRequestExecutor, "errorRequestExecutor");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(challengeActionHandler, "challengeActionHandler");
        Intrinsics.checkNotNullParameter(intentData, "intentData");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.uiCustomization = uiCustomization;
        this.transactionTimer = transactionTimer;
        this.errorRequestExecutor = errorRequestExecutor;
        this.errorReporter = errorReporter;
        this.challengeActionHandler = challengeActionHandler;
        this.initialUiType = uiType;
        this.intentData = intentData;
        this.workContext = workContext;
        this.uiTypeCode = LazyKt.lazy(new Function0<String>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$uiTypeCode$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                ChallengeResponseData challengeResponseData = this.this$0.cresData;
                if (challengeResponseData == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cresData");
                    challengeResponseData = null;
                }
                UiType uiType2 = challengeResponseData.getUiType();
                String code = uiType2 != null ? uiType2.getCode() : null;
                return code == null ? "" : code;
            }
        });
        final Function0 function0 = null;
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(ChallengeActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore store = this.requireActivity().getStore();
                Intrinsics.checkNotNullExpressionValue(store, "requireActivity().viewModelStore");
                return store;
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return new ChallengeActivityViewModel.Factory(this.this$0.challengeActionHandler, this.this$0.transactionTimer, this.this$0.errorReporter, this.this$0.workContext);
            }
        });
        this.challengeEntryViewFactory = LazyKt.lazy(new Function0<ChallengeEntryViewFactory>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$challengeEntryViewFactory$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ChallengeEntryViewFactory invoke() {
                FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                return new ChallengeEntryViewFactory(fragmentActivityRequireActivity);
            }
        });
        this.challengeZoneView = LazyKt.lazy(new Function0<ChallengeZoneView>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$challengeZoneView$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ChallengeZoneView invoke() {
                ChallengeZoneView caChallengeZone = this.this$0.getViewBinding$3ds2sdk_release().caChallengeZone;
                Intrinsics.checkNotNullExpressionValue(caChallengeZone, "caChallengeZone");
                return caChallengeZone;
            }
        });
        this.brandZoneView = LazyKt.lazy(new Function0<BrandZoneView>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$brandZoneView$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final BrandZoneView invoke() {
                BrandZoneView caBrandZone = this.this$0.getViewBinding$3ds2sdk_release().caBrandZone;
                Intrinsics.checkNotNullExpressionValue(caBrandZone, "caBrandZone");
                return caBrandZone;
            }
        });
        this.challengeZoneTextView = LazyKt.lazy(new Function0<ChallengeZoneTextView>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$challengeZoneTextView$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ChallengeZoneTextView invoke() {
                ChallengeResponseData challengeResponseData = this.this$0.cresData;
                ChallengeResponseData challengeResponseData2 = null;
                if (challengeResponseData == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cresData");
                    challengeResponseData = null;
                }
                if (challengeResponseData.getUiType() != UiType.Text) {
                    return null;
                }
                ChallengeEntryViewFactory challengeEntryViewFactory = this.this$0.getChallengeEntryViewFactory();
                ChallengeResponseData challengeResponseData3 = this.this$0.cresData;
                if (challengeResponseData3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cresData");
                } else {
                    challengeResponseData2 = challengeResponseData3;
                }
                return challengeEntryViewFactory.createChallengeEntryTextView(challengeResponseData2, this.this$0.uiCustomization);
            }
        });
        this.challengeZoneSelectView = LazyKt.lazy(new Function0<ChallengeZoneSelectView>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$challengeZoneSelectView$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ChallengeZoneSelectView invoke() {
                ChallengeResponseData challengeResponseData = this.this$0.cresData;
                ChallengeResponseData challengeResponseData2 = null;
                if (challengeResponseData == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cresData");
                    challengeResponseData = null;
                }
                if (challengeResponseData.getUiType() != UiType.SingleSelect) {
                    ChallengeResponseData challengeResponseData3 = this.this$0.cresData;
                    if (challengeResponseData3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cresData");
                        challengeResponseData3 = null;
                    }
                    if (challengeResponseData3.getUiType() != UiType.MultiSelect) {
                        return null;
                    }
                }
                ChallengeEntryViewFactory challengeEntryViewFactory = this.this$0.getChallengeEntryViewFactory();
                ChallengeResponseData challengeResponseData4 = this.this$0.cresData;
                if (challengeResponseData4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cresData");
                } else {
                    challengeResponseData2 = challengeResponseData4;
                }
                return challengeEntryViewFactory.createChallengeEntrySelectView(challengeResponseData2, this.this$0.uiCustomization);
            }
        });
        this.challengeZoneWebView = LazyKt.lazy(new Function0<ChallengeZoneWebView>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$challengeZoneWebView$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ChallengeZoneWebView invoke() {
                ChallengeResponseData challengeResponseData = this.this$0.cresData;
                ChallengeResponseData challengeResponseData2 = null;
                if (challengeResponseData == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cresData");
                    challengeResponseData = null;
                }
                if (challengeResponseData.getUiType() != UiType.Html) {
                    return null;
                }
                ChallengeEntryViewFactory challengeEntryViewFactory = this.this$0.getChallengeEntryViewFactory();
                ChallengeResponseData challengeResponseData3 = this.this$0.cresData;
                if (challengeResponseData3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cresData");
                } else {
                    challengeResponseData2 = challengeResponseData3;
                }
                return challengeEntryViewFactory.createChallengeEntryWebView(challengeResponseData2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configure$lambda$1(ChallengeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel$3ds2sdk_release().onSubmitClicked(this$0.getChallengeAction());
    }

    private final void updateBrandZoneImages() {
        BrandZoneView caBrandZone = getViewBinding$3ds2sdk_release().caBrandZone;
        Intrinsics.checkNotNullExpressionValue(caBrandZone, "caBrandZone");
        ImageView issuerImageView = caBrandZone.getIssuerImageView();
        ChallengeResponseData challengeResponseData = this.cresData;
        ChallengeResponseData challengeResponseData2 = null;
        if (challengeResponseData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData = null;
        }
        Tuples2 tuples2M3642to = Tuples4.m3642to(issuerImageView, challengeResponseData.getIssuerImage());
        ImageView paymentSystemImageView = caBrandZone.getPaymentSystemImageView();
        ChallengeResponseData challengeResponseData3 = this.cresData;
        if (challengeResponseData3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
        } else {
            challengeResponseData2 = challengeResponseData3;
        }
        for (Map.Entry entry : MapsKt.mapOf(tuples2M3642to, Tuples4.m3642to(paymentSystemImageView, challengeResponseData2.getPaymentSystemImage())).entrySet()) {
            final ImageView imageView = (ImageView) entry.getKey();
            getViewModel$3ds2sdk_release().getImage((ChallengeResponseData.Image) entry.getValue(), getResources().getDisplayMetrics().densityDpi).observe(getViewLifecycleOwner(), new ChallengeFragment$sam$androidx_lifecycle_Observer$0(new Function1<Bitmap, Unit>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$updateBrandZoneImages$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
                    invoke2(bitmap);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Bitmap bitmap) {
                    if (bitmap != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(bitmap);
                    } else {
                        imageView.setVisibility(8);
                    }
                }
            }));
        }
    }

    private final void configureInformationZoneView() {
        InformationZoneView caInformationZone = getViewBinding$3ds2sdk_release().caInformationZone;
        Intrinsics.checkNotNullExpressionValue(caInformationZone, "caInformationZone");
        ChallengeResponseData challengeResponseData = this.cresData;
        ChallengeResponseData challengeResponseData2 = null;
        if (challengeResponseData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData = null;
        }
        String whyInfoLabel = challengeResponseData.getWhyInfoLabel();
        ChallengeResponseData challengeResponseData3 = this.cresData;
        if (challengeResponseData3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData3 = null;
        }
        caInformationZone.setWhyInfo(whyInfoLabel, challengeResponseData3.getWhyInfoText(), this.uiCustomization.getLabelCustomization());
        ChallengeResponseData challengeResponseData4 = this.cresData;
        if (challengeResponseData4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData4 = null;
        }
        String expandInfoLabel = challengeResponseData4.getExpandInfoLabel();
        ChallengeResponseData challengeResponseData5 = this.cresData;
        if (challengeResponseData5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
        } else {
            challengeResponseData2 = challengeResponseData5;
        }
        caInformationZone.setExpandInfo(expandInfoLabel, challengeResponseData2.getExpandInfoText(), this.uiCustomization.getLabelCustomization());
        String accentColor = this.uiCustomization.getAccentColor();
        if (accentColor != null) {
            caInformationZone.setToggleColor$3ds2sdk_release(Color.parseColor(accentColor));
        }
    }

    private final void configureChallengeZoneView() {
        ChallengeZoneView challengeZoneView = getChallengeZoneView();
        ChallengeResponseData challengeResponseData = this.cresData;
        ChallengeResponseData challengeResponseData2 = null;
        if (challengeResponseData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData = null;
        }
        challengeZoneView.setInfoHeaderText(challengeResponseData.getChallengeInfoHeader(), this.uiCustomization.getLabelCustomization());
        ChallengeZoneView challengeZoneView2 = getChallengeZoneView();
        ChallengeResponseData challengeResponseData3 = this.cresData;
        if (challengeResponseData3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData3 = null;
        }
        challengeZoneView2.setInfoText(challengeResponseData3.getChallengeInfoText(), this.uiCustomization.getLabelCustomization());
        ChallengeZoneView challengeZoneView3 = getChallengeZoneView();
        ChallengeResponseData challengeResponseData4 = this.cresData;
        if (challengeResponseData4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData4 = null;
        }
        challengeZoneView3.setInfoTextIndicator(challengeResponseData4.getShouldShowChallengeInfoTextIndicator() ? R$drawable.stripe_3ds2_ic_indicator : 0);
        ChallengeZoneView challengeZoneView4 = getChallengeZoneView();
        ChallengeResponseData challengeResponseData5 = this.cresData;
        if (challengeResponseData5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
        } else {
            challengeResponseData2 = challengeResponseData5;
        }
        challengeZoneView4.setWhitelistingLabel(challengeResponseData2.getWhitelistingInfoText(), this.uiCustomization.getLabelCustomization(), this.uiCustomization.getButtonCustomization(UiCustomization.ButtonType.SELECT));
        getChallengeZoneView().setSubmitButtonClickListener(new View.OnClickListener() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChallengeFragment.configureChallengeZoneView$lambda$4(this.f$0, view);
            }
        });
        getChallengeZoneView().setResendButtonClickListener(new View.OnClickListener() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChallengeFragment.configureChallengeZoneView$lambda$5(this.f$0, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureChallengeZoneView$lambda$4(ChallengeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel$3ds2sdk_release().onSubmitClicked(this$0.getChallengeAction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureChallengeZoneView$lambda$5(ChallengeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel$3ds2sdk_release().submit(ChallengeAction.Resend.INSTANCE);
    }

    public final void refreshUi() {
        ChallengeResponseData challengeResponseData = this.cresData;
        ChallengeResponseData challengeResponseData2 = null;
        if (challengeResponseData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData = null;
        }
        if (challengeResponseData.getUiType() == UiType.Html) {
            ChallengeResponseData challengeResponseData3 = this.cresData;
            if (challengeResponseData3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
                challengeResponseData3 = null;
            }
            String acsHtmlRefresh = challengeResponseData3.getAcsHtmlRefresh();
            if (acsHtmlRefresh != null && !StringsKt.isBlank(acsHtmlRefresh)) {
                ChallengeZoneWebView challengeZoneWebView$3ds2sdk_release = getChallengeZoneWebView$3ds2sdk_release();
                if (challengeZoneWebView$3ds2sdk_release != null) {
                    ChallengeResponseData challengeResponseData4 = this.cresData;
                    if (challengeResponseData4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cresData");
                    } else {
                        challengeResponseData2 = challengeResponseData4;
                    }
                    challengeZoneWebView$3ds2sdk_release.loadHtml(challengeResponseData2.getAcsHtmlRefresh());
                    return;
                }
                return;
            }
        }
        ChallengeResponseData challengeResponseData5 = this.cresData;
        if (challengeResponseData5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData5 = null;
        }
        if (challengeResponseData5.getUiType() == UiType.OutOfBand) {
            ChallengeResponseData challengeResponseData6 = this.cresData;
            if (challengeResponseData6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
                challengeResponseData6 = null;
            }
            String challengeAdditionalInfoText = challengeResponseData6.getChallengeAdditionalInfoText();
            if (challengeAdditionalInfoText == null || StringsKt.isBlank(challengeAdditionalInfoText)) {
                return;
            }
            ChallengeZoneView challengeZoneView = getChallengeZoneView();
            ChallengeResponseData challengeResponseData7 = this.cresData;
            if (challengeResponseData7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
            } else {
                challengeResponseData2 = challengeResponseData7;
            }
            challengeZoneView.setInfoText(challengeResponseData2.getChallengeAdditionalInfoText(), this.uiCustomization.getLabelCustomization());
            getChallengeZoneView().setInfoTextIndicator(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onChallengeRequestResult(ChallengeRequestResult result) {
        if (result instanceof ChallengeRequestResult.Success) {
            ChallengeRequestResult.Success success = (ChallengeRequestResult.Success) result;
            onSuccess(success.getCreqData(), success.getCresData());
        } else if (result instanceof ChallengeRequestResult.ProtocolError) {
            onError(((ChallengeRequestResult.ProtocolError) result).getData());
        } else if (result instanceof ChallengeRequestResult.RuntimeError) {
            onError(((ChallengeRequestResult.RuntimeError) result).getThrowable());
        } else if (result instanceof ChallengeRequestResult.Timeout) {
            onTimeout(((ChallengeRequestResult.Timeout) result).getData());
        }
    }

    private final void onSuccess(ChallengeRequestData creqData, ChallengeResponseData cresData) {
        ChallengeResult failed;
        if (cresData.getIsChallengeCompleted()) {
            getViewModel$3ds2sdk_release().stopTimer();
            if (creqData.getCancelReason() != null) {
                failed = new ChallengeResult.Canceled(getUiTypeCode(), this.initialUiType, this.intentData);
            } else {
                String transStatus = cresData.getTransStatus();
                if (transStatus == null) {
                    transStatus = "";
                }
                if (Intrinsics.areEqual("Y", transStatus)) {
                    failed = new ChallengeResult.Succeeded(getUiTypeCode(), this.initialUiType, this.intentData);
                } else {
                    failed = new ChallengeResult.Failed(getUiTypeCode(), this.initialUiType, this.intentData);
                }
            }
            getViewModel$3ds2sdk_release().onFinish(failed);
            return;
        }
        getViewModel$3ds2sdk_release().onNextScreen(cresData);
    }

    private final void onError(ErrorData data) {
        getViewModel$3ds2sdk_release().onFinish(new ChallengeResult.ProtocolError(data, this.initialUiType, this.intentData));
        getViewModel$3ds2sdk_release().stopTimer();
        this.errorRequestExecutor.executeAsync(data);
    }

    private final void onTimeout(ErrorData data) {
        getViewModel$3ds2sdk_release().stopTimer();
        this.errorRequestExecutor.executeAsync(data);
        getViewModel$3ds2sdk_release().onFinish(new ChallengeResult.Timeout(getUiTypeCode(), this.initialUiType, this.intentData));
    }

    private final void onError(Throwable throwable) {
        getViewModel$3ds2sdk_release().onFinish(new ChallengeResult.RuntimeError(throwable, this.initialUiType, this.intentData));
    }
}
