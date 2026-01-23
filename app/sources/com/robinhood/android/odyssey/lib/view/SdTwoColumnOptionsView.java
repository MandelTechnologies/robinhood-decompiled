package com.robinhood.android.odyssey.lib.view;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.view.ViewGroup2;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.utils.MergePropertiesValues;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.api.serverdrivenui.component.ApiSdAction;
import com.robinhood.models.api.serverdrivenui.component.ApiSdListOptionsComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTwoColumnOption;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTwoColumnOption2;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.p409ui.view.recyclerview.AlwaysScrollToTopLayoutEnforcer;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SdTwoColumnOptionsView.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u001a\u001a\u00020\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0016J\u0018\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020'H\u0014J\u0012\u0010(\u001a\u00020\u001b2\b\u0010)\u001a\u0004\u0018\u00010'H\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00130\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdTwoColumnOptionsView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdListOptionsComponent;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdListOptionsComponent$Data$TwoColumnOption;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", WebsocketGatewayConstants.DATA_KEY, "getData", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdListOptionsComponent$Data$TwoColumnOption;", "setData", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdListOptionsComponent$Data$TwoColumnOption;)V", "fullOptions", "", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTwoColumnOption;", "selectedOption", "layoutEnforcer", "Lcom/robinhood/utils/ui/view/recyclerview/AlwaysScrollToTopLayoutEnforcer;", "fullOptionsAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Landroidx/compose/ui/platform/ComposeView;", "onFinishInflate", "", "mergeNewData", "newData", "onDataUpdated", "updateSource", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$UpdateSource;", "onSubmitValue", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue;", "setClickable", "clickable", "", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdTwoColumnOptionsView extends RecyclerView implements SdBaseView<ApiSdListOptionsComponent, ApiSdListOptionsComponent.Data.TwoColumnOption, SdBaseView.Callbacks> {
    public static final int $stable = 8;
    private ApiSdListOptionsComponent.Data.TwoColumnOption data;
    private List<ApiSdTwoColumnOption> fullOptions;
    private final GenericListAdapter<ComposeView, ApiSdTwoColumnOption> fullOptionsAdapter;
    private final AlwaysScrollToTopLayoutEnforcer layoutEnforcer;
    private ApiSdTwoColumnOption selectedOption;

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
    public void update(ApiSdListOptionsComponent.Data.TwoColumnOption twoColumnOption, SdBaseView.UpdateSource updateSource) {
        SdBaseView.DefaultImpls.update(this, twoColumnOption, updateSource);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdTwoColumnOptionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.fullOptions = CollectionsKt.emptyList();
        AlwaysScrollToTopLayoutEnforcer alwaysScrollToTopLayoutEnforcer = new AlwaysScrollToTopLayoutEnforcer();
        this.layoutEnforcer = alwaysScrollToTopLayoutEnforcer;
        GenericListAdapter<ComposeView, ApiSdTwoColumnOption> genericListAdapterM2985of = GenericListAdapter.INSTANCE.m2985of(C20335R.layout.row_sd_compose_view, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.odyssey.lib.view.SdTwoColumnOptionsView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SdTwoColumnOptionsView.fullOptionsAdapter$lambda$0(this.f$0, (ComposeView) obj, (ApiSdTwoColumnOption) obj2);
            }
        });
        genericListAdapterM2985of.registerAdapterDataObserver(alwaysScrollToTopLayoutEnforcer);
        this.fullOptionsAdapter = genericListAdapterM2985of;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdListOptionsComponent.Data.TwoColumnOption getData() {
        return this.data;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void setData(ApiSdListOptionsComponent.Data.TwoColumnOption twoColumnOption) {
        this.data = twoColumnOption;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fullOptionsAdapter$lambda$0(final SdTwoColumnOptionsView sdTwoColumnOptionsView, final ComposeView of, final ApiSdTwoColumnOption option) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(option, "option");
        of.setContent(ComposableLambda3.composableLambdaInstance(1234124941, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.odyssey.lib.view.SdTwoColumnOptionsView$fullOptionsAdapter$1$1

            /* compiled from: SdTwoColumnOptionsView.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.odyssey.lib.view.SdTwoColumnOptionsView$fullOptionsAdapter$1$1$1 */
            static final class C227371 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ ApiSdTwoColumnOption $option;
                final /* synthetic */ SdTwoColumnOptionsView this$0;

                C227371(ApiSdTwoColumnOption apiSdTwoColumnOption, SdTwoColumnOptionsView sdTwoColumnOptionsView) {
                    this.$option = apiSdTwoColumnOption;
                    this.this$0 = sdTwoColumnOptionsView;
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
                        ComposerKt.traceEventStart(-1076007361, i, -1, "com.robinhood.android.odyssey.lib.view.SdTwoColumnOptionsView.fullOptionsAdapter.<anonymous>.<anonymous>.<anonymous> (SdTwoColumnOptionsView.kt:53)");
                    }
                    ApiSdTwoColumnOption apiSdTwoColumnOption = this.$option;
                    composer.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer.changedInstance(this.$option) | composer.changedInstance(this.this$0);
                    final ApiSdTwoColumnOption apiSdTwoColumnOption2 = this.$option;
                    final SdTwoColumnOptionsView sdTwoColumnOptionsView = this.this$0;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0048: CONSTRUCTOR (r2v1 'objRememberedValue' java.lang.Object) = 
                              (r0v4 'apiSdTwoColumnOption2' com.robinhood.models.api.serverdrivenui.component.ApiSdTwoColumnOption A[DONT_INLINE])
                              (r1v1 'sdTwoColumnOptionsView' com.robinhood.android.odyssey.lib.view.SdTwoColumnOptionsView A[DONT_INLINE])
                             A[MD:(com.robinhood.models.api.serverdrivenui.component.ApiSdTwoColumnOption, com.robinhood.android.odyssey.lib.view.SdTwoColumnOptionsView):void (m)] (LINE:56) call: com.robinhood.android.odyssey.lib.view.SdTwoColumnOptionsView$fullOptionsAdapter$1$1$1$$ExternalSyntheticLambda0.<init>(com.robinhood.models.api.serverdrivenui.component.ApiSdTwoColumnOption, com.robinhood.android.odyssey.lib.view.SdTwoColumnOptionsView):void type: CONSTRUCTOR in method: com.robinhood.android.odyssey.lib.view.SdTwoColumnOptionsView$fullOptionsAdapter$1$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes10.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.odyssey.lib.view.SdTwoColumnOptionsView$fullOptionsAdapter$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
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
                            java.lang.String r1 = "com.robinhood.android.odyssey.lib.view.SdTwoColumnOptionsView.fullOptionsAdapter.<anonymous>.<anonymous>.<anonymous> (SdTwoColumnOptionsView.kt:53)"
                            r2 = -1076007361(0xffffffffbfdd6e3f, float:-1.729927)
                            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r11, r0, r1)
                        L1f:
                            com.robinhood.models.api.serverdrivenui.component.ApiSdTwoColumnOption r3 = r9.$option
                            r11 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
                            r10.startReplaceGroup(r11)
                            com.robinhood.models.api.serverdrivenui.component.ApiSdTwoColumnOption r11 = r9.$option
                            boolean r11 = r10.changedInstance(r11)
                            com.robinhood.android.odyssey.lib.view.SdTwoColumnOptionsView r0 = r9.this$0
                            boolean r0 = r10.changedInstance(r0)
                            r11 = r11 | r0
                            com.robinhood.models.api.serverdrivenui.component.ApiSdTwoColumnOption r0 = r9.$option
                            com.robinhood.android.odyssey.lib.view.SdTwoColumnOptionsView r1 = r9.this$0
                            java.lang.Object r2 = r10.rememberedValue()
                            if (r11 != 0) goto L46
                            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.INSTANCE
                            java.lang.Object r11 = r11.getEmpty()
                            if (r2 != r11) goto L4e
                        L46:
                            com.robinhood.android.odyssey.lib.view.SdTwoColumnOptionsView$fullOptionsAdapter$1$1$1$$ExternalSyntheticLambda0 r2 = new com.robinhood.android.odyssey.lib.view.SdTwoColumnOptionsView$fullOptionsAdapter$1$1$1$$ExternalSyntheticLambda0
                            r2.<init>(r0, r1)
                            r10.updateRememberedValue(r2)
                        L4e:
                            r4 = r2
                            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
                            r10.endReplaceGroup()
                            r7 = 0
                            r8 = 4
                            r5 = 0
                            r6 = r10
                            com.robinhood.android.odyssey.lib.view.SdTwoColumnOptionsView3.TwoColumnOptionRow(r3, r4, r5, r6, r7, r8)
                            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                            if (r10 == 0) goto L64
                            androidx.compose.runtime.ComposerKt.traceEventEnd()
                        L64:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.odyssey.lib.view.SdTwoColumnOptionsView2.C227371.invoke(androidx.compose.runtime.Composer, int):void");
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(ApiSdTwoColumnOption apiSdTwoColumnOption, SdTwoColumnOptionsView sdTwoColumnOptionsView) {
                        for (ApiSdTwoColumnOption2 apiSdTwoColumnOption2 : apiSdTwoColumnOption.getRows()) {
                            sdTwoColumnOptionsView.requireAlternateComponentOnSubmitValueMap().put(apiSdTwoColumnOption2.getKey(), new ApiSdTypedValue.ApiSdString(apiSdTwoColumnOption2.getData()));
                        }
                        sdTwoColumnOptionsView.selectedOption = apiSdTwoColumnOption;
                        ApiSdListOptionsComponent.Data.TwoColumnOption data = sdTwoColumnOptionsView.getData();
                        if (data == null) {
                            return Unit.INSTANCE;
                        }
                        ApiSdAction on_click = data.getOn_click();
                        if (on_click != null) {
                            sdTwoColumnOptionsView.requireComponentCallbacks().onComponentAction(data.getId(), on_click);
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
                        ComposerKt.traceEventStart(1234124941, i, -1, "com.robinhood.android.odyssey.lib.view.SdTwoColumnOptionsView.fullOptionsAdapter.<anonymous>.<anonymous> (SdTwoColumnOptionsView.kt:52)");
                    }
                    BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(of)), null, ComposableLambda3.rememberComposableLambda(-1076007361, true, new C227371(option, sdTwoColumnOptionsView), composer, 54), composer, 384, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            return Unit.INSTANCE;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            this.layoutEnforcer.setRecyclerView(this);
            setLayoutManager(new LinearLayoutManager(getContext()));
            setAdapter(this.fullOptionsAdapter);
        }

        @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
        public ApiSdListOptionsComponent.Data.TwoColumnOption mergeNewData(ApiSdListOptionsComponent.Data.TwoColumnOption newData) {
            Intrinsics.checkNotNullParameter(newData, "newData");
            return (ApiSdListOptionsComponent.Data.TwoColumnOption) MergePropertiesValues.mergePropertiesValues(getData(), Reflection.getOrCreateKotlinClass(ApiSdListOptionsComponent.Data.TwoColumnOption.class), newData);
        }

        @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
        public void onDataUpdated(ApiSdListOptionsComponent.Data.TwoColumnOption newData, SdBaseView.UpdateSource updateSource) {
            Intrinsics.checkNotNullParameter(newData, "newData");
            Intrinsics.checkNotNullParameter(updateSource, "updateSource");
            SdBaseView.DefaultImpls.onDataUpdated(this, newData, updateSource);
            List<ApiSdTwoColumnOption> options = newData.getOptions();
            if (options != null) {
                this.fullOptions = options;
                this.fullOptionsAdapter.submitList(options);
            }
        }

        @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
        public ApiSdTypedValue onSubmitValue() {
            ApiSdTypedValue typed_value_object;
            ApiSdTwoColumnOption apiSdTwoColumnOption = this.selectedOption;
            return (apiSdTwoColumnOption == null || (typed_value_object = apiSdTwoColumnOption.getTyped_value_object()) == null) ? new ApiSdTypedValue.ApiSdNull() : typed_value_object;
        }

        @Override // android.view.View
        public void setClickable(boolean clickable) {
            Iterator<View> it = ViewGroup2.getChildren(this).iterator2();
            while (it.hasNext()) {
                it.next().setClickable(clickable);
            }
            super.setClickable(clickable);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        protected Parcelable onSaveInstanceState() {
            return onSaveState(super.onSaveInstanceState());
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        protected void onRestoreInstanceState(Parcelable state) {
            super.onRestoreInstanceState(onRestoreState(state));
        }
    }
