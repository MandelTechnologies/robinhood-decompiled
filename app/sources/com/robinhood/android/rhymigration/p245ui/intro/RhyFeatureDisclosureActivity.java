package com.robinhood.android.rhymigration.p245ui.intro;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhymigration.C27577R;
import com.robinhood.android.rhymigration.databinding.ActivityRhyFeatureDisclosureBinding;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.activity.ActivityCompanion3;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.noties.markwon.Markwon;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RhyFeatureDisclosureActivity.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0018H\u0014J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!H\u0002J\t\u0010\"\u001a\u00020!H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/intro/RhyFeatureDisclosureActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/rhymigration/ui/intro/RhyFeatureDisclosureDuxo;", "getDuxo", "()Lcom/robinhood/android/rhymigration/ui/intro/RhyFeatureDisclosureDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/rhymigration/databinding/ActivityRhyFeatureDisclosureBinding;", "getBinding", "()Lcom/robinhood/android/rhymigration/databinding/ActivityRhyFeatureDisclosureBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "bindState", "state", "Lcom/robinhood/android/rhymigration/ui/intro/RhyFeatureDisclosureState;", "onLoading", "isLoading", "", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhyFeatureDisclosureActivity extends BaseActivity implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhyFeatureDisclosureActivity.class, "binding", "getBinding()Lcom/robinhood/android/rhymigration/databinding/ActivityRhyFeatureDisclosureBinding;", 0))};

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

    public RhyFeatureDisclosureActivity() {
        super(C27577R.layout.activity_rhy_feature_disclosure);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, RhyFeatureDisclosureDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, RhyFeatureDisclosureActivity2.INSTANCE);
    }

    private final RhyFeatureDisclosureDuxo getDuxo() {
        return (RhyFeatureDisclosureDuxo) this.duxo.getValue();
    }

    private final ActivityRhyFeatureDisclosureBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ActivityRhyFeatureDisclosureBinding) value;
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RdsButton rhyFeatureDisclosureOkBtn = getBinding().rhyFeatureDisclosureOkBtn;
        Intrinsics.checkNotNullExpressionValue(rhyFeatureDisclosureOkBtn, "rhyFeatureDisclosureOkBtn");
        OnClickListeners.onClick(rhyFeatureDisclosureOkBtn, new Function0() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyFeatureDisclosureActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyFeatureDisclosureActivity.onCreate$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(RhyFeatureDisclosureActivity rhyFeatureDisclosureActivity) {
        rhyFeatureDisclosureActivity.finish();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C276221(this));
    }

    /* compiled from: RhyFeatureDisclosureActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhymigration.ui.intro.RhyFeatureDisclosureActivity$onStart$1 */
    /* synthetic */ class C276221 extends FunctionReferenceImpl implements Function1<RhyFeatureDisclosureState, Unit> {
        C276221(Object obj) {
            super(1, obj, RhyFeatureDisclosureActivity.class, "bindState", "bindState(Lcom/robinhood/android/rhymigration/ui/intro/RhyFeatureDisclosureState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RhyFeatureDisclosureState rhyFeatureDisclosureState) throws Throwable {
            invoke2(rhyFeatureDisclosureState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RhyFeatureDisclosureState p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RhyFeatureDisclosureActivity) this.receiver).bindState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindState(RhyFeatureDisclosureState state) throws Throwable {
        Throwable thConsume;
        onLoading(state.getIsLoading());
        Disclosure content = state.getContent();
        if (content != null) {
            getBinding().rhyFeatureDisclosureTxt.setText(Markwons.toSpanned$default(getMarkwon(), content.getContent(), null, 2, null));
        }
        UiEvent<Throwable> error = state.getError();
        if (error == null || (thConsume = error.consume()) == null) {
            return;
        }
        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, this, thConsume, true, false, 0, null, 56, null);
    }

    private final void onLoading(boolean isLoading) {
        getBinding().rhyFeatureDisclosureOkBtn.setLoading(isLoading);
        showProgressBar(isLoading);
    }

    /* compiled from: RhyFeatureDisclosureActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/intro/RhyFeatureDisclosureActivity$Companion;", "Lcom/robinhood/utils/ui/activity/ActivityWithExtrasCompanion;", "Lcom/robinhood/android/rhymigration/ui/intro/RhyFeatureDisclosureActivity;", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "<init>", "()V", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements ActivityCompanion3<RhyFeatureDisclosureActivity, ResourceLink<EntryResource<Disclosure>>> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public ResourceLink<EntryResource<Disclosure>> getExtras(RhyFeatureDisclosureActivity rhyFeatureDisclosureActivity) {
            return (ResourceLink) ActivityCompanion3.DefaultImpls.getExtras(this, rhyFeatureDisclosureActivity);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, ResourceLink<EntryResource<Disclosure>> resourceLink) {
            return ActivityCompanion3.DefaultImpls.getIntentWithExtras(this, context, resourceLink);
        }
    }
}
