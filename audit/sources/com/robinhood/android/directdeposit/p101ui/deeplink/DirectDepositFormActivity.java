package com.robinhood.android.directdeposit.p101ui.deeplink;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.android.directdeposit.p101ui.deeplink.DirectDepositFormDuxo2;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.transfers.contracts.DirectDepositShimKey;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.utils.extensions.Files;
import com.robinhood.utils.extensions.ObservablesAndroid;
import java.io.File;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: DirectDepositFormActivity.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/deeplink/DirectDepositFormActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "<init>", "()V", "duxo", "Lcom/robinhood/android/directdeposit/ui/deeplink/DirectDepositFormDuxo;", "getDuxo", "()Lcom/robinhood/android/directdeposit/ui/deeplink/DirectDepositFormDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "loadingView", "Landroid/view/View;", "getLoadingView", "()Landroid/view/View;", "loadingView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onResume", "", "bind", "state", "Lcom/robinhood/android/directdeposit/ui/deeplink/DirectDepositFormViewState;", "onPositiveButtonClicked", "", "id", "", "passthroughArgs", "Landroid/os/Bundle;", "onNegativeButtonClicked", "onDialogDismissed", "openForm", "directDepositForm", "Ljava/io/File;", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class DirectDepositFormActivity extends BaseActivity implements RhDialogFragment.OnDismissListener {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: loadingView$delegate, reason: from kotlin metadata */
    private final Interfaces2 loadingView;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DirectDepositFormActivity.class, "loadingView", "getLoadingView()Landroid/view/View;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public DirectDepositFormActivity() {
        super(C14044R.layout.activity_direct_deposit_form);
        this.duxo = OldDuxos.oldDuxo(this, DirectDepositFormDuxo.class);
        this.loadingView = bindView(C14044R.id.loading_view);
    }

    private final DirectDepositFormDuxo getDuxo() {
        return (DirectDepositFormDuxo) this.duxo.getValue();
    }

    private final View getLoadingView() {
        return (View) this.loadingView.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        DirectDepositFormDuxo duxo = getDuxo();
        Companion companion = INSTANCE;
        duxo.startDownload(((LegacyIntentKey.DirectDepositForm) companion.getExtras((Activity) this)).getDocumentId(), ((LegacyIntentKey.DirectDepositForm) companion.getExtras((Activity) this)).getSpending(), this);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C140651(this));
    }

    /* compiled from: DirectDepositFormActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directdeposit.ui.deeplink.DirectDepositFormActivity$onResume$1 */
    /* synthetic */ class C140651 extends FunctionReferenceImpl implements Function1<DirectDepositFormDuxo2, Unit> {
        C140651(Object obj) {
            super(1, obj, DirectDepositFormActivity.class, "bind", "bind(Lcom/robinhood/android/directdeposit/ui/deeplink/DirectDepositFormViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DirectDepositFormDuxo2 directDepositFormDuxo2) {
            invoke2(directDepositFormDuxo2);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DirectDepositFormDuxo2 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DirectDepositFormActivity) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(DirectDepositFormDuxo2 state) {
        getLoadingView().setVisibility(state.getShowLoadingView() ? 0 : 8);
        if (Intrinsics.areEqual(state, DirectDepositFormDuxo2.Loading.INSTANCE)) {
            return;
        }
        if (state instanceof DirectDepositFormDuxo2.Loaded) {
            openForm(((DirectDepositFormDuxo2.Loaded) state).getForm());
        } else {
            if (!(state instanceof DirectDepositFormDuxo2.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            RhDialogFragment.Builder builderCreateDialog = ((DirectDepositFormDuxo2.Error) state).createDialog(this);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(builderCreateDialog, supportFragmentManager, "directDepositFormError", false, 4, null);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C14044R.id.dialog_direct_deposit_form_invalid) {
            finish();
            return true;
        }
        if (id == C14044R.id.dialog_direct_deposit_form_expired) {
            Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new DirectDepositShimKey(false, false, false, false, false, false, false, false, 255, null), null, false, null, null, 60, null);
            finish();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C14044R.id.dialog_direct_deposit_form_expired) {
            finish();
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C14044R.id.dialog_direct_deposit_form_invalid || id == C14044R.id.dialog_direct_deposit_form_expired) {
            finish();
        }
    }

    private final void openForm(File directDepositForm) {
        Intent openOrShareIntent$default = Files.getOpenOrShareIntent$default(directDepositForm, this, C11048R.string.general_action_share, null, 4, null);
        if (openOrShareIntent$default != null) {
            startActivity(openOrShareIntent$default);
            finish();
        }
    }

    /* compiled from: DirectDepositFormActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/deeplink/DirectDepositFormActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/directdeposit/ui/deeplink/DirectDepositFormActivity;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectDepositForm;", "<init>", "()V", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<DirectDepositFormActivity, LegacyIntentKey.DirectDepositForm> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public LegacyIntentKey.DirectDepositForm getExtras(DirectDepositFormActivity directDepositFormActivity) {
            return (LegacyIntentKey.DirectDepositForm) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, directDepositFormActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.DirectDepositForm directDepositForm) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, directDepositForm);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, LegacyIntentKey.DirectDepositForm directDepositForm) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, directDepositForm);
        }
    }
}
