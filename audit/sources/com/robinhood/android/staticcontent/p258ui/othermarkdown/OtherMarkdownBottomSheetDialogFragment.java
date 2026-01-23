package com.robinhood.android.staticcontent.p258ui.othermarkdown;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.fragment.app.Fragment;
import com.robinhood.android.instant.p160ui.InstantRetirementAgreementComponents;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownSpannedText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.staticcontent.model.OtherMarkdown;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: OtherMarkdownBottomSheetDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0003\u0013\u0014\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\r\u0010\u0011\u001a\u00020\u000eH\u0017¢\u0006\u0002\u0010\u0012R\u001e\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownBottomSheetDialogFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "<init>", "()V", "contentStore", "Lcom/robinhood/contentful/StaticContentStore;", "getContentStore$lib_product_marketing_externalDebug", "()Lcom/robinhood/contentful/StaticContentStore;", "setContentStore$lib_product_marketing_externalDebug", "(Lcom/robinhood/contentful/StaticContentStore;)V", "stateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownBottomSheetDialogFragment$State;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "State", "Args", "Companion", "lib-product-marketing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class OtherMarkdownBottomSheetDialogFragment extends GenericComposeBottomSheetDialogFragment {
    public StaticContentStore contentStore;
    private final StateFlow2<State> stateFlow = StateFlow4.MutableStateFlow(new State(null, false, 3, 0 == true ? 1 : 0));

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4(OtherMarkdownBottomSheetDialogFragment otherMarkdownBottomSheetDialogFragment, int i, Composer composer, int i2) {
        otherMarkdownBottomSheetDialogFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final StaticContentStore getContentStore$lib_product_marketing_externalDebug() {
        StaticContentStore staticContentStore = this.contentStore;
        if (staticContentStore != null) {
            return staticContentStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("contentStore");
        return null;
    }

    public final void setContentStore$lib_product_marketing_externalDebug(StaticContentStore staticContentStore) {
        Intrinsics.checkNotNullParameter(staticContentStore, "<set-?>");
        this.contentStore = staticContentStore;
    }

    /* compiled from: OtherMarkdownBottomSheetDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownBottomSheetDialogFragment$State;", "", InstantRetirementAgreementComponents.MarkdownTag, "", "isLoading", "", "<init>", "(Ljava/lang/String;Z)V", "getMarkdown", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "lib-product-marketing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final /* data */ class State {
        private final boolean isLoading;
        private final String markdown;

        /* JADX WARN: Multi-variable type inference failed */
        public State() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ State copy$default(State state, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = state.markdown;
            }
            if ((i & 2) != 0) {
                z = state.isLoading;
            }
            return state.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMarkdown() {
            return this.markdown;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public final State copy(String markdown, boolean isLoading) {
            Intrinsics.checkNotNullParameter(markdown, "markdown");
            return new State(markdown, isLoading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.areEqual(this.markdown, state.markdown) && this.isLoading == state.isLoading;
        }

        public int hashCode() {
            return (this.markdown.hashCode() * 31) + Boolean.hashCode(this.isLoading);
        }

        public String toString() {
            return "State(markdown=" + this.markdown + ", isLoading=" + this.isLoading + ")";
        }

        public State(String markdown, boolean z) {
            Intrinsics.checkNotNullParameter(markdown, "markdown");
            this.markdown = markdown;
            this.isLoading = z;
        }

        public /* synthetic */ State(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? true : z);
        }

        public final String getMarkdown() {
            return this.markdown;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        State value;
        super.onCreate(savedInstanceState);
        String contentfulId = ((Args) INSTANCE.getArgs((Fragment) this)).getContentfulId();
        if (contentfulId != null) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C287181(contentfulId, null), 3, null);
            return;
        }
        StateFlow2<State> stateFlow2 = this.stateFlow;
        do {
            value = stateFlow2.getValue();
        } while (!stateFlow2.compareAndSet(value, State.copy$default(value, null, false, 1, null)));
    }

    /* compiled from: OtherMarkdownBottomSheetDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownBottomSheetDialogFragment$onCreate$1", m3645f = "OtherMarkdownBottomSheetDialogFragment.kt", m3646l = {52}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownBottomSheetDialogFragment$onCreate$1 */
    static final class C287181 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $contentfulId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C287181(String str, Continuation<? super C287181> continuation) {
            super(2, continuation);
            this.$contentfulId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OtherMarkdownBottomSheetDialogFragment.this.new C287181(this.$contentfulId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C287181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C287181 c287181;
            Object value;
            Object value2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StaticContentStore contentStore$lib_product_marketing_externalDebug = OtherMarkdownBottomSheetDialogFragment.this.getContentStore$lib_product_marketing_externalDebug();
                    String str = this.$contentfulId;
                    this.label = 1;
                    c287181 = this;
                    try {
                        obj = ContentRepository.DefaultImpls.loadEntry$default(contentStore$lib_product_marketing_externalDebug, str, null, c287181, 2, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable unused) {
                        StateFlow2 stateFlow2 = OtherMarkdownBottomSheetDialogFragment.this.stateFlow;
                        do {
                            value = stateFlow2.getValue();
                        } while (!stateFlow2.compareAndSet(value, State.copy$default((State) value, null, false, 1, null)));
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    c287181 = this;
                }
                String markdown2 = ((OtherMarkdown) ((EntryResource) obj).getValue()).getMarkdown2();
                StateFlow2 stateFlow22 = OtherMarkdownBottomSheetDialogFragment.this.stateFlow;
                do {
                    value2 = stateFlow22.getValue();
                } while (!stateFlow22.compareAndSet(value2, ((State) value2).copy(markdown2, false)));
            } catch (Throwable unused2) {
                c287181 = this;
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        final OtherMarkdownBottomSheetDialogFragment otherMarkdownBottomSheetDialogFragment;
        State state;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-828544301);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(this) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-828544301, i2, -1, "com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownBottomSheetDialogFragment.ComposeContent (OtherMarkdownBottomSheetDialogFragment.kt:63)");
            }
            State state2 = (State) SnapshotStateKt.collectAsState(this.stateFlow, null, composerStartRestartGroup, 0, 1).getValue();
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM());
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            if (state2.isLoading()) {
                composerStartRestartGroup.startReplaceGroup(1015018236);
                Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(companion, true, null, 2, null);
                Companion companion3 = INSTANCE;
                String fallbackTitle = ((Args) companion3.getArgs((Fragment) this)).getFallbackTitle();
                TextStyle displayCapsuleLarge = bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleLarge();
                TextAlign.Companion companion4 = TextAlign.INSTANCE;
                state = state2;
                BentoText2.m20747BentoText38GnDrw(fallbackTitle, modifierBentoPlaceholder$default, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composerStartRestartGroup, 0, 0, 8124);
                otherMarkdownBottomSheetDialogFragment = this;
                BentoText2.m20747BentoText38GnDrw(((Args) companion3.getArgs((Fragment) otherMarkdownBottomSheetDialogFragment)).getFallbackMessage(), ModifiersKt.bentoPlaceholder$default(companion, true, null, 2, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16316);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                otherMarkdownBottomSheetDialogFragment = this;
                state = state2;
                composerStartRestartGroup.startReplaceGroup(1015611018);
                BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(state.getMarkdown(), null, null, null, 0, 17, 0, 0, null, composerStartRestartGroup, 196608, 478);
                composerStartRestartGroup.endReplaceGroup();
            }
            String dismissButtonText = ((Args) INSTANCE.getArgs((Fragment) otherMarkdownBottomSheetDialogFragment)).getDismissButtonText();
            boolean z = !state.isLoading();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(otherMarkdownBottomSheetDialogFragment);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownBottomSheetDialogFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OtherMarkdownBottomSheetDialogFragment.ComposeContent$lambda$3$lambda$2$lambda$1(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Composer composer3 = composerStartRestartGroup;
            BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, (Function0) objRememberedValue, dismissButtonText, false, null, z, null, null, false, null, false, composer3, 0, 0, 64319);
            composer2 = composer3;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            otherMarkdownBottomSheetDialogFragment = this;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.staticcontent.ui.othermarkdown.OtherMarkdownBottomSheetDialogFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OtherMarkdownBottomSheetDialogFragment.ComposeContent$lambda$4(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3$lambda$2$lambda$1(OtherMarkdownBottomSheetDialogFragment otherMarkdownBottomSheetDialogFragment) {
        otherMarkdownBottomSheetDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* compiled from: OtherMarkdownBottomSheetDialogFragment.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownBottomSheetDialogFragment$Args;", "Landroid/os/Parcelable;", "contentfulId", "", "fallbackTitle", "fallbackMessage", "dismissButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContentfulId", "()Ljava/lang/String;", "getFallbackTitle", "getFallbackMessage", "getDismissButtonText", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-product-marketing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String contentfulId;
        private final String dismissButtonText;
        private final String fallbackMessage;
        private final String fallbackTitle;

        /* compiled from: OtherMarkdownBottomSheetDialogFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.contentfulId;
            }
            if ((i & 2) != 0) {
                str2 = args.fallbackTitle;
            }
            if ((i & 4) != 0) {
                str3 = args.fallbackMessage;
            }
            if ((i & 8) != 0) {
                str4 = args.dismissButtonText;
            }
            return args.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getContentfulId() {
            return this.contentfulId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFallbackTitle() {
            return this.fallbackTitle;
        }

        /* renamed from: component3, reason: from getter */
        public final String getFallbackMessage() {
            return this.fallbackMessage;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDismissButtonText() {
            return this.dismissButtonText;
        }

        public final Args copy(String contentfulId, String fallbackTitle, String fallbackMessage, String dismissButtonText) {
            Intrinsics.checkNotNullParameter(fallbackTitle, "fallbackTitle");
            Intrinsics.checkNotNullParameter(fallbackMessage, "fallbackMessage");
            Intrinsics.checkNotNullParameter(dismissButtonText, "dismissButtonText");
            return new Args(contentfulId, fallbackTitle, fallbackMessage, dismissButtonText);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.contentfulId, args.contentfulId) && Intrinsics.areEqual(this.fallbackTitle, args.fallbackTitle) && Intrinsics.areEqual(this.fallbackMessage, args.fallbackMessage) && Intrinsics.areEqual(this.dismissButtonText, args.dismissButtonText);
        }

        public int hashCode() {
            String str = this.contentfulId;
            return ((((((str == null ? 0 : str.hashCode()) * 31) + this.fallbackTitle.hashCode()) * 31) + this.fallbackMessage.hashCode()) * 31) + this.dismissButtonText.hashCode();
        }

        public String toString() {
            return "Args(contentfulId=" + this.contentfulId + ", fallbackTitle=" + this.fallbackTitle + ", fallbackMessage=" + this.fallbackMessage + ", dismissButtonText=" + this.dismissButtonText + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.contentfulId);
            dest.writeString(this.fallbackTitle);
            dest.writeString(this.fallbackMessage);
            dest.writeString(this.dismissButtonText);
        }

        public Args(String str, String fallbackTitle, String fallbackMessage, String dismissButtonText) {
            Intrinsics.checkNotNullParameter(fallbackTitle, "fallbackTitle");
            Intrinsics.checkNotNullParameter(fallbackMessage, "fallbackMessage");
            Intrinsics.checkNotNullParameter(dismissButtonText, "dismissButtonText");
            this.contentfulId = str;
            this.fallbackTitle = fallbackTitle;
            this.fallbackMessage = fallbackMessage;
            this.dismissButtonText = dismissButtonText;
        }

        public final String getContentfulId() {
            return this.contentfulId;
        }

        public final String getFallbackTitle() {
            return this.fallbackTitle;
        }

        public final String getFallbackMessage() {
            return this.fallbackMessage;
        }

        public final String getDismissButtonText() {
            return this.dismissButtonText;
        }
    }

    /* compiled from: OtherMarkdownBottomSheetDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownBottomSheetDialogFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownBottomSheetDialogFragment;", "Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownBottomSheetDialogFragment$Args;", "<init>", "()V", "lib-product-marketing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OtherMarkdownBottomSheetDialogFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OtherMarkdownBottomSheetDialogFragment otherMarkdownBottomSheetDialogFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, otherMarkdownBottomSheetDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OtherMarkdownBottomSheetDialogFragment newInstance(Args args) {
            return (OtherMarkdownBottomSheetDialogFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OtherMarkdownBottomSheetDialogFragment otherMarkdownBottomSheetDialogFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, otherMarkdownBottomSheetDialogFragment, args);
        }
    }
}
