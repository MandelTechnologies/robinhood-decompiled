package com.robinhood.android.odyssey.lib.view;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.lib.odyssey.databinding.MergeSdSectionBinding;
import com.robinhood.android.odyssey.lib.utils.MergePropertiesValues;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.api.serverdrivenui.component.ApiSdListOptionsComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdOption;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.models.api.serverdrivenui.component.ApiSelectionConfig;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SdMultiSelectOptionsView.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0004H\u0016J\u0018\u00103\u001a\u00020&2\u0006\u00102\u001a\u00020\u00042\u0006\u00104\u001a\u000205H\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020&\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b-\u0010.¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdMultiSelectOptionsView;", "Landroid/widget/FrameLayout;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdListOptionsComponent;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdListOptionsComponent$Data$ListOption;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", WebsocketGatewayConstants.DATA_KEY, "getData", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdListOptionsComponent$Data$ListOption;", "setData", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdListOptionsComponent$Data$ListOption;)V", "checkboxPosition", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSelectionConfig$CheckboxPosition;", "getCheckboxPosition", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSelectionConfig$CheckboxPosition;", "setCheckboxPosition", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSelectionConfig$CheckboxPosition;)V", "maxSelections", "", "getMaxSelections", "()I", "setMaxSelections", "(I)V", "exclusionRules", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSelectionConfig$ExclusionRule;", "getExclusionRules", "()Lkotlinx/collections/immutable/ImmutableList;", "setExclusionRules", "(Lkotlinx/collections/immutable/ImmutableList;)V", "onToggledCountChanged", "Lkotlin/Function1;", "", "getOnToggledCountChanged", "()Lkotlin/jvm/functions/Function1;", "setOnToggledCountChanged", "(Lkotlin/jvm/functions/Function1;)V", "binding", "Lcom/robinhood/android/lib/odyssey/databinding/MergeSdSectionBinding;", "getBinding", "()Lcom/robinhood/android/lib/odyssey/databinding/MergeSdSectionBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "mergeNewData", "newData", "onDataUpdated", "updateSource", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$UpdateSource;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdMultiSelectOptionsView extends FrameLayout implements SdBaseView<ApiSdListOptionsComponent, ApiSdListOptionsComponent.Data.ListOption, SdBaseView.Callbacks> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SdMultiSelectOptionsView.class, "binding", "getBinding()Lcom/robinhood/android/lib/odyssey/databinding/MergeSdSectionBinding;", 0))};
    public static final int $stable = 8;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private ApiSelectionConfig.CheckboxPosition checkboxPosition;
    private ApiSdListOptionsComponent.Data.ListOption data;
    private ImmutableList<ApiSelectionConfig.ExclusionRule> exclusionRules;
    private int maxSelections;
    private Function1<? super Integer, Unit> onToggledCountChanged;

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void bind(ApiSdListOptionsComponent apiSdListOptionsComponent) {
        SdBaseView.DefaultImpls.bind(this, apiSdListOptionsComponent);
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
    public ApiSdTypedValue onSubmitValue() {
        return SdBaseView.DefaultImpls.onSubmitValue(this);
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
    public SdMultiSelectOptionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.checkboxPosition = ApiSelectionConfig.CheckboxPosition.LEFT;
        this.maxSelections = Integer.MAX_VALUE;
        this.binding = ViewBinding5.viewBinding(this, SdMultiSelectOptionsView2.INSTANCE);
        ViewGroups.inflate(this, C20335R.layout.merge_sd_section, true);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdListOptionsComponent.Data.ListOption getData() {
        return this.data;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void setData(ApiSdListOptionsComponent.Data.ListOption listOption) {
        this.data = listOption;
    }

    public final ApiSelectionConfig.CheckboxPosition getCheckboxPosition() {
        return this.checkboxPosition;
    }

    public final void setCheckboxPosition(ApiSelectionConfig.CheckboxPosition checkboxPosition) {
        Intrinsics.checkNotNullParameter(checkboxPosition, "<set-?>");
        this.checkboxPosition = checkboxPosition;
    }

    public final int getMaxSelections() {
        return this.maxSelections;
    }

    public final void setMaxSelections(int i) {
        this.maxSelections = i;
    }

    public final ImmutableList<ApiSelectionConfig.ExclusionRule> getExclusionRules() {
        return this.exclusionRules;
    }

    public final void setExclusionRules(ImmutableList<ApiSelectionConfig.ExclusionRule> immutableList) {
        this.exclusionRules = immutableList;
    }

    public final Function1<Integer, Unit> getOnToggledCountChanged() {
        return this.onToggledCountChanged;
    }

    public final void setOnToggledCountChanged(Function1<? super Integer, Unit> function1) {
        this.onToggledCountChanged = function1;
    }

    private final MergeSdSectionBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeSdSectionBinding) value;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdListOptionsComponent.Data.ListOption mergeNewData(ApiSdListOptionsComponent.Data.ListOption newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        return (ApiSdListOptionsComponent.Data.ListOption) MergePropertiesValues.mergePropertiesValues(getData(), Reflection.getOrCreateKotlinClass(ApiSdListOptionsComponent.Data.ListOption.class), newData);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void onDataUpdated(ApiSdListOptionsComponent.Data.ListOption newData, SdBaseView.UpdateSource updateSource) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        Intrinsics.checkNotNullParameter(updateSource, "updateSource");
        SdBaseView.DefaultImpls.onDataUpdated(this, newData, updateSource);
        final List<ApiSdOption> options = newData.getOptions();
        if (options != null) {
            Iterator<ApiSdOption> it = options.iterator();
            while (it.hasNext()) {
                requireAlternateComponentOnSubmitValueMap().put(it.next().getKey(), new ApiSdTypedValue.ApiSdBoolean(false));
            }
            getBinding().composeView.setContent(ComposableLambda3.composableLambdaInstance(-2040288184, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.odyssey.lib.view.SdMultiSelectOptionsView$onDataUpdated$1$1

                /* compiled from: SdMultiSelectOptionsView.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.odyssey.lib.view.SdMultiSelectOptionsView$onDataUpdated$1$1$1 */
                static final class C227291 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ List<ApiSdOption> $options;
                    final /* synthetic */ SdMultiSelectOptionsView this$0;

                    C227291(List<ApiSdOption> list, SdMultiSelectOptionsView sdMultiSelectOptionsView) {
                        this.$options = list;
                        this.this$0 = sdMultiSelectOptionsView;
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
                            ComposerKt.traceEventStart(-1606704426, i, -1, "com.robinhood.android.odyssey.lib.view.SdMultiSelectOptionsView.onDataUpdated.<anonymous>.<anonymous>.<anonymous> (SdMultiSelectOptionsView.kt:55)");
                        }
                        ImmutableList immutableList = extensions2.toImmutableList(this.$options);
                        int maxSelections = this.this$0.getMaxSelections();
                        ApiSelectionConfig.CheckboxPosition checkboxPosition = this.this$0.getCheckboxPosition();
                        ImmutableList<ApiSelectionConfig.ExclusionRule> exclusionRules = this.this$0.getExclusionRules();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final SdMultiSelectOptionsView sdMultiSelectOptionsView = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0057: CONSTRUCTOR (r5v1 'objRememberedValue' java.lang.Object) = (r4v0 'sdMultiSelectOptionsView' com.robinhood.android.odyssey.lib.view.SdMultiSelectOptionsView A[DONT_INLINE]) A[MD:(com.robinhood.android.odyssey.lib.view.SdMultiSelectOptionsView):void (m)] (LINE:61) call: com.robinhood.android.odyssey.lib.view.SdMultiSelectOptionsView$onDataUpdated$1$1$1$$ExternalSyntheticLambda0.<init>(com.robinhood.android.odyssey.lib.view.SdMultiSelectOptionsView):void type: CONSTRUCTOR in method: com.robinhood.android.odyssey.lib.view.SdMultiSelectOptionsView$onDataUpdated$1$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes10.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.odyssey.lib.view.SdMultiSelectOptionsView$onDataUpdated$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 25 more
                                */
                            /*
                                this = this;
                                r0 = r11 & 3
                                r1 = 2
                                if (r0 != r1) goto L10
                                boolean r0 = r10.getSkipping()
                                if (r0 != 0) goto Lc
                                goto L10
                            Lc:
                                r10.skipToGroupEnd()
                                return
                            L10:
                                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r0 == 0) goto L1f
                                r0 = -1
                                java.lang.String r1 = "com.robinhood.android.odyssey.lib.view.SdMultiSelectOptionsView.onDataUpdated.<anonymous>.<anonymous>.<anonymous> (SdMultiSelectOptionsView.kt:55)"
                                r2 = -1606704426(0xffffffffa03ba2d6, float:-1.5893394E-19)
                                androidx.compose.runtime.ComposerKt.traceEventStart(r2, r11, r0, r1)
                            L1f:
                                java.util.List<com.robinhood.models.api.serverdrivenui.component.ApiSdOption> r11 = r9.$options
                                java.lang.Iterable r11 = (java.lang.Iterable) r11
                                kotlinx.collections.immutable.ImmutableList r0 = kotlinx.collections.immutable.extensions2.toImmutableList(r11)
                                com.robinhood.android.odyssey.lib.view.SdMultiSelectOptionsView r11 = r9.this$0
                                int r1 = r11.getMaxSelections()
                                com.robinhood.android.odyssey.lib.view.SdMultiSelectOptionsView r11 = r9.this$0
                                com.robinhood.models.api.serverdrivenui.component.ApiSelectionConfig$CheckboxPosition r2 = r11.getCheckboxPosition()
                                com.robinhood.android.odyssey.lib.view.SdMultiSelectOptionsView r11 = r9.this$0
                                kotlinx.collections.immutable.ImmutableList r3 = r11.getExclusionRules()
                                r11 = 5004770(0x4c5de2, float:7.013177E-39)
                                r10.startReplaceGroup(r11)
                                com.robinhood.android.odyssey.lib.view.SdMultiSelectOptionsView r11 = r9.this$0
                                boolean r11 = r10.changedInstance(r11)
                                com.robinhood.android.odyssey.lib.view.SdMultiSelectOptionsView r4 = r9.this$0
                                java.lang.Object r5 = r10.rememberedValue()
                                if (r11 != 0) goto L55
                                androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.INSTANCE
                                java.lang.Object r11 = r11.getEmpty()
                                if (r5 != r11) goto L5d
                            L55:
                                com.robinhood.android.odyssey.lib.view.SdMultiSelectOptionsView$onDataUpdated$1$1$1$$ExternalSyntheticLambda0 r5 = new com.robinhood.android.odyssey.lib.view.SdMultiSelectOptionsView$onDataUpdated$1$1$1$$ExternalSyntheticLambda0
                                r5.<init>(r4)
                                r10.updateRememberedValue(r5)
                            L5d:
                                r4 = r5
                                kotlin.jvm.functions.Function3 r4 = (kotlin.jvm.functions.Function3) r4
                                r10.endReplaceGroup()
                                r7 = 0
                                r8 = 32
                                r5 = 0
                                r6 = r10
                                com.robinhood.android.odyssey.lib.compose.SdMultiSelectOptions.SdMultiSelectOptions(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                                boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r10 == 0) goto L74
                                androidx.compose.runtime.ComposerKt.traceEventEnd()
                            L74:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.odyssey.lib.view.SdMultiSelectOptionsView3.C227291.invoke(androidx.compose.runtime.Composer, int):void");
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(SdMultiSelectOptionsView sdMultiSelectOptionsView, ApiSdOption option, boolean z, int i) {
                            Intrinsics.checkNotNullParameter(option, "option");
                            sdMultiSelectOptionsView.requireAlternateComponentOnSubmitValueMap().put(option.getKey(), new ApiSdTypedValue.ApiSdBoolean(z));
                            Function1<Integer, Unit> onToggledCountChanged = sdMultiSelectOptionsView.getOnToggledCountChanged();
                            if (onToggledCountChanged != null) {
                                onToggledCountChanged.invoke(Integer.valueOf(i));
                            }
                            return Unit.INSTANCE;
                        }
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
                            ComposerKt.traceEventStart(-2040288184, i, -1, "com.robinhood.android.odyssey.lib.view.SdMultiSelectOptionsView.onDataUpdated.<anonymous>.<anonymous> (SdMultiSelectOptionsView.kt:54)");
                        }
                        BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(this.this$0)), null, ComposableLambda3.rememberComposableLambda(-1606704426, true, new C227291(options, this.this$0), composer, 54), composer, 384, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
        }
    }
