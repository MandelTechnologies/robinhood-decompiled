package com.robinhood.android.odyssey.lib.view;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.utils.MergePropertiesValues;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.api.serverdrivenui.component.ApiSdListOptionsComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdOption;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedIcon;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import java.io.InvalidObjectException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: SdDropdownRow.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H\u0016J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u000202H\u0014J\u0012\u00103\u001a\u00020\u00182\b\u00104\u001a\u0004\u0018\u000102H\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\"X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010$\u001a\u0004\u0018\u00010\u001a2\b\u0010#\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*¢\u0006\b\n\u0000\u001a\u0004\b)\u0010,¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdDropdownRow;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdListOptionsComponent;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdListOptionsComponent$Data$ListOption;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", WebsocketGatewayConstants.DATA_KEY, "getData", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdListOptionsComponent$Data$ListOption;", "setData", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdListOptionsComponent$Data$ListOption;)V", "optionView", "Landroidx/compose/ui/platform/ComposeView;", "getOptionView", "()Landroidx/compose/ui/platform/ComposeView;", "optionView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "updateOptionView", "", AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION, "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdOption;", "placeholder", "", "getPlaceholder", "()Ljava/lang/String;", "setPlaceholder", "(Ljava/lang/String;)V", "_selectedOptionFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "value", "selectedOption", "getSelectedOption", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdOption;", "setSelectedOption", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdOption;)V", "isOptionSelected", "Lkotlinx/coroutines/flow/Flow;", "", "()Lkotlinx/coroutines/flow/Flow;", "mergeNewData", "newData", "onSubmitValue", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue;", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdDropdownRow extends Hammer_SdDropdownRow implements SdBaseView<ApiSdListOptionsComponent, ApiSdListOptionsComponent.Data.ListOption, SdBaseView.Callbacks> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SdDropdownRow.class, "optionView", "getOptionView()Landroidx/compose/ui/platform/ComposeView;", 0))};
    public static final int $stable = 8;
    private final StateFlow2<ApiSdOption> _selectedOptionFlow;
    private ApiSdListOptionsComponent.Data.ListOption data;
    private final Flow<Boolean> isOptionSelected;

    /* renamed from: optionView$delegate, reason: from kotlin metadata */
    private final Interfaces2 optionView;
    private String placeholder;

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void bind(ApiSdListOptionsComponent apiSdListOptionsComponent) {
        SdBaseView.DefaultImpls.bind(this, apiSdListOptionsComponent);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void onDataUpdated(ApiSdListOptionsComponent.Data.ListOption listOption, SdBaseView.UpdateSource updateSource) {
        SdBaseView.DefaultImpls.onDataUpdated(this, listOption, updateSource);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public Parcelable onRestoreState(Parcelable parcelable) {
        return SdBaseView.DefaultImpls.onRestoreState(this, parcelable);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public Parcelable onSaveState(Parcelable parcelable) {
        return SdBaseView.DefaultImpls.onSaveState(this, parcelable);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public Map<String, ApiSdTypedValue> requireAlternateComponentOnSubmitValueMap() {
        return SdBaseView.DefaultImpls.requireAlternateComponentOnSubmitValueMap(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public SdBaseView.Callbacks requireComponentCallbacks() {
        return SdBaseView.DefaultImpls.requireComponentCallbacks(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public View requireSdView() {
        return SdBaseView.DefaultImpls.requireSdView(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void update(ApiSdListOptionsComponent.Data.ListOption listOption, SdBaseView.UpdateSource updateSource) {
        SdBaseView.DefaultImpls.update(this, listOption, updateSource);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdDropdownRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.optionView = BindViewDelegate2.bindView$default(this, C20335R.id.sd_search_input_new_dropdown_option, null, 2, null);
        final StateFlow2<ApiSdOption> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(null);
        this._selectedOptionFlow = stateFlow2MutableStateFlow;
        this.isOptionSelected = new Flow<Boolean>() { // from class: com.robinhood.android.odyssey.lib.view.SdDropdownRow$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.odyssey.lib.view.SdDropdownRow$special$$inlined$map$1$2 */
            public static final class C227232<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.odyssey.lib.view.SdDropdownRow$special$$inlined$map$1$2", m3645f = "SdDropdownRow.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.odyssey.lib.view.SdDropdownRow$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C227232.this.emit(null, this);
                    }
                }

                public C227232(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Boolean boolBoxBoolean = boxing.boxBoolean(((ApiSdOption) obj) != null);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2MutableStateFlow.collect(new C227232(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdListOptionsComponent.Data.ListOption getData() {
        return this.data;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void setData(ApiSdListOptionsComponent.Data.ListOption listOption) {
        this.data = listOption;
    }

    private final ComposeView getOptionView() {
        return (ComposeView) this.optionView.getValue(this, $$delegatedProperties[0]);
    }

    private final void updateOptionView(final ApiSdOption option) {
        getOptionView().setContent(ComposableLambda3.composableLambdaInstance(1431868685, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.odyssey.lib.view.SdDropdownRow.updateOptionView.1
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
                    ComposerKt.traceEventStart(1431868685, i, -1, "com.robinhood.android.odyssey.lib.view.SdDropdownRow.updateOptionView.<anonymous> (SdDropdownRow.kt:40)");
                }
                Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(SdDropdownRow.this));
                final ApiSdOption apiSdOption = option;
                final SdDropdownRow sdDropdownRow = SdDropdownRow.this;
                BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(-1948114149, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.odyssey.lib.view.SdDropdownRow.updateOptionView.1.1
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
                            ComposerKt.traceEventStart(-1948114149, i2, -1, "com.robinhood.android.odyssey.lib.view.SdDropdownRow.updateOptionView.<anonymous>.<anonymous> (SdDropdownRow.kt:41)");
                        }
                        Arrangement arrangement = Arrangement.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i3 = BentoTheme.$stable;
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, i3).m21593getSmallD9Ej5fM());
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        ApiSdOption apiSdOption2 = apiSdOption;
                        SdDropdownRow sdDropdownRow2 = sdDropdownRow;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composer2, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        if (apiSdOption2 != null) {
                            composer2.startReplaceGroup(1277143972);
                            ApiSdTypedIcon typed_icon_object = apiSdOption2.getTyped_icon_object();
                            composer2.startReplaceGroup(1565220191);
                            if (typed_icon_object != null) {
                                SdTypedIcon2.SdTypedIcon(typed_icon_object, composer2, 0);
                            }
                            composer2.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(apiSdOption2.getDisplay_label(), null, null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i3).getTextL(), composer2, 12582912, 0, 8062);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(1277505339);
                            String placeholder = sdDropdownRow2.getPlaceholder();
                            if (placeholder != null) {
                                BentoText2.m20747BentoText38GnDrw(placeholder, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i3).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i3).getTextL(), composer2, 0, 0, 8186);
                                Unit unit = Unit.INSTANCE;
                            }
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
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

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final void setPlaceholder(String str) {
        this.placeholder = str;
    }

    public final ApiSdOption getSelectedOption() {
        return this._selectedOptionFlow.getValue();
    }

    public final void setSelectedOption(ApiSdOption apiSdOption) {
        this._selectedOptionFlow.setValue(apiSdOption);
        updateOptionView(apiSdOption);
    }

    public final Flow<Boolean> isOptionSelected() {
        return this.isOptionSelected;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdListOptionsComponent.Data.ListOption mergeNewData(ApiSdListOptionsComponent.Data.ListOption newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        return (ApiSdListOptionsComponent.Data.ListOption) MergePropertiesValues.mergePropertiesValues(getData(), Reflection.getOrCreateKotlinClass(ApiSdListOptionsComponent.Data.ListOption.class), newData);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdTypedValue onSubmitValue() throws InvalidObjectException {
        ApiSdTypedValue typed_value_object;
        ApiSdOption selectedOption = getSelectedOption();
        if (selectedOption == null || (typed_value_object = selectedOption.getTyped_value_object()) == null) {
            throw new InvalidObjectException("SdDropdownRow is required to submit its value but no value is bind.");
        }
        return typed_value_object;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return onSaveState(super.onSaveInstanceState());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        super.onRestoreInstanceState(onRestoreState(state));
    }
}
