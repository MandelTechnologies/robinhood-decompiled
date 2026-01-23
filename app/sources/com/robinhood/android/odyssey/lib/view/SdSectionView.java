package com.robinhood.android.odyssey.lib.view;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.p011ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.lib.odyssey.databinding.MergeSdSectionBinding;
import com.robinhood.android.odyssey.lib.compose.SdSection;
import com.robinhood.android.odyssey.lib.utils.MergePropertiesValues;
import com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.api.serverdrivenui.component.ApiSdFlexibleComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdSectionComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SdSectionView.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002:\u0001'B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0016J\b\u0010#\u001a\u00020$H\u0014J\u0012\u0010%\u001a\u00020\u001e2\b\u0010&\u001a\u0004\u0018\u00010$H\u0014R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdSectionView;", "Landroid/widget/FrameLayout;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseFlexibleComponentView;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdSectionComponent;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdSectionComponent$Data;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/lib/odyssey/databinding/MergeSdSectionBinding;", "getBinding", "()Lcom/robinhood/android/lib/odyssey/databinding/MergeSdSectionBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", WebsocketGatewayConstants.DATA_KEY, "getData", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdSectionComponent$Data;", "setData", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdSectionComponent$Data;)V", "size", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFlexibleComponent$Size;", "getSize", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFlexibleComponent$Size;", "setSize", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFlexibleComponent$Size;)V", "onDataUpdated", "", "newData", "updateSource", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$UpdateSource;", "mergeNewData", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdSectionView extends FrameLayout implements SdBaseFlexibleComponentView<ApiSdSectionComponent, ApiSdSectionComponent.Data, SdBaseView.Callbacks> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private ApiSdSectionComponent.Data data;
    private ApiSdFlexibleComponent.Size size;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SdSectionView.class, "binding", "getBinding()Lcom/robinhood/android/lib/odyssey/databinding/MergeSdSectionBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView
    public void bind(ApiSdSectionComponent apiSdSectionComponent) {
        SdBaseFlexibleComponentView.DefaultImpls.bind(this, apiSdSectionComponent);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView
    public void onNoSizeDefined() {
        SdBaseFlexibleComponentView.DefaultImpls.onNoSizeDefined(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView, com.robinhood.android.odyssey.lib.view.SdBaseView
    public Parcelable onRestoreState(Parcelable parcelable) {
        return SdBaseFlexibleComponentView.DefaultImpls.onRestoreState(this, parcelable);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView, com.robinhood.android.odyssey.lib.view.SdBaseView
    public Parcelable onSaveState(Parcelable parcelable) {
        return SdBaseFlexibleComponentView.DefaultImpls.onSaveState(this, parcelable);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView
    public void onSizeUpdated() {
        SdBaseFlexibleComponentView.DefaultImpls.onSizeUpdated(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdTypedValue onSubmitValue() {
        return SdBaseFlexibleComponentView.DefaultImpls.onSubmitValue(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView
    public void overrideSize(ApiSdFlexibleComponent.Size size) {
        SdBaseFlexibleComponentView.DefaultImpls.overrideSize(this, size);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public Map<String, ApiSdTypedValue> requireAlternateComponentOnSubmitValueMap() {
        return SdBaseFlexibleComponentView.DefaultImpls.requireAlternateComponentOnSubmitValueMap(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public SdBaseView.Callbacks requireComponentCallbacks() {
        return SdBaseFlexibleComponentView.DefaultImpls.requireComponentCallbacks(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView
    public SdBaseFlexibleComponentView.Callbacks requireLayoutCallbacks() {
        return SdBaseFlexibleComponentView.DefaultImpls.requireLayoutCallbacks(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public View requireSdView() {
        return SdBaseFlexibleComponentView.DefaultImpls.requireSdView(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void update(ApiSdSectionComponent.Data data, SdBaseView.UpdateSource updateSource) {
        SdBaseFlexibleComponentView.DefaultImpls.update(this, data, updateSource);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdSectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C20335R.layout.merge_sd_section, true);
        this.binding = ViewBinding5.viewBinding(this, SdSectionView2.INSTANCE);
    }

    private final MergeSdSectionBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeSdSectionBinding) value;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdSectionComponent.Data getData() {
        return this.data;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void setData(ApiSdSectionComponent.Data data) {
        this.data = data;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView
    public ApiSdFlexibleComponent.Size getSize() {
        return this.size;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView
    public void setSize(ApiSdFlexibleComponent.Size size) {
        this.size = size;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void onDataUpdated(final ApiSdSectionComponent.Data newData, SdBaseView.UpdateSource updateSource) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        Intrinsics.checkNotNullParameter(updateSource, "updateSource");
        SdBaseFlexibleComponentView.DefaultImpls.onDataUpdated(this, newData, updateSource);
        final ComposeView composeView = getBinding().composeView;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambda3.composableLambdaInstance(-2081426455, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.odyssey.lib.view.SdSectionView$onDataUpdated$1$1
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
                    ComposerKt.traceEventStart(-2081426455, i, -1, "com.robinhood.android.odyssey.lib.view.SdSectionView.onDataUpdated.<anonymous>.<anonymous> (SdSectionView.kt:42)");
                }
                ComposeView composeView2 = composeView;
                Intrinsics.checkNotNull(composeView2);
                Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(composeView2));
                final ApiSdSectionComponent.Data data = newData;
                BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(2126779035, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.odyssey.lib.view.SdSectionView$onDataUpdated$1$1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2126779035, i2, -1, "com.robinhood.android.odyssey.lib.view.SdSectionView.onDataUpdated.<anonymous>.<anonymous>.<anonymous> (SdSectionView.kt:43)");
                        }
                        SdSection.SdSection(data, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdSectionComponent.Data mergeNewData(ApiSdSectionComponent.Data newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        return (ApiSdSectionComponent.Data) MergePropertiesValues.mergePropertiesValues(getData(), Reflection.getOrCreateKotlinClass(ApiSdSectionComponent.Data.class), newData);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return onSaveState(super.onSaveInstanceState());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        super.onRestoreInstanceState(onRestoreState(state));
    }

    /* compiled from: SdSectionView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdSectionView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/odyssey/lib/view/SdSectionView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<SdSectionView> {
        private final /* synthetic */ Inflater<SdSectionView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public SdSectionView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (SdSectionView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20335R.layout.include_sd_section);
        }
    }
}
