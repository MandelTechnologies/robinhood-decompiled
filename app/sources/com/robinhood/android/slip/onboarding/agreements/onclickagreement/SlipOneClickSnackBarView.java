package com.robinhood.android.slip.onboarding.agreements.onclickagreement;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SlipRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.slip.C28532R;
import com.robinhood.android.slip.contracts.TransparentViewKey;
import com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickSnackBarView;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SlipOneClickSnackBarView.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\t\u0010\u000f\u001a\u00020\u0010H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickSnackBarView;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickSnackBarViewDuxo;", "getDuxo", "()Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickSnackBarViewDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-slip_externalDebug", "viewState", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/EmptyViewDuxoViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SlipOneClickSnackBarView extends BaseActivity implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public SlipOneClickSnackBarView() {
        super(C28532R.layout.activity_empty_view);
        this.$$delegate_0 = new RegionGated2(SlipRegionGate.INSTANCE);
        this.duxo = DuxosKt.duxo(this, SlipOneClickSnackBarViewDuxo.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SlipOneClickSnackBarViewDuxo getDuxo() {
        return (SlipOneClickSnackBarViewDuxo) this.duxo.getValue();
    }

    /* compiled from: SlipOneClickSnackBarView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickSnackBarView$onCreate$1 */
    static final class C285941 implements Function2<Composer, Integer, Unit> {
        C285941() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1159817028, i, -1, "com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickSnackBarView.onCreate.<anonymous> (SlipOneClickSnackBarView.kt:25)");
            }
            SlipOneClickSnackBarViewDuxo4 slipOneClickSnackBarViewDuxo4Invoke$lambda$0 = invoke$lambda$0(FlowExtKt.collectAsStateWithLifecycle(SlipOneClickSnackBarView.this.getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 0, 7));
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(SlipOneClickSnackBarView.this);
            final SlipOneClickSnackBarView slipOneClickSnackBarView = SlipOneClickSnackBarView.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickSnackBarView$onCreate$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SlipOneClickSnackBarView.C285941.invoke$lambda$2$lambda$1(slipOneClickSnackBarView);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            SnackbarScreen.SnackBarScreen(slipOneClickSnackBarViewDuxo4Invoke$lambda$0, (Function0) objRememberedValue, null, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(SlipOneClickSnackBarView slipOneClickSnackBarView) {
            slipOneClickSnackBarView.finish();
            return Unit.INSTANCE;
        }

        private static final SlipOneClickSnackBarViewDuxo4 invoke$lambda$0(SnapshotState4<? extends SlipOneClickSnackBarViewDuxo4> snapshotState4) {
            return snapshotState4.getValue();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((ComposeView) findViewById(C28532R.id.compose_view)).setContent(ComposableLambda3.composableLambdaInstance(1159817028, true, new C285941()));
    }

    /* compiled from: SlipOneClickSnackBarView.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickSnackBarView$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickSnackBarView;", "Lcom/robinhood/android/slip/contracts/TransparentViewKey;", "<init>", "()V", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<SlipOneClickSnackBarView, TransparentViewKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public TransparentViewKey getExtras(SlipOneClickSnackBarView slipOneClickSnackBarView) {
            return (TransparentViewKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, slipOneClickSnackBarView);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, TransparentViewKey transparentViewKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, transparentViewKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, TransparentViewKey transparentViewKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, transparentViewKey);
        }
    }
}
