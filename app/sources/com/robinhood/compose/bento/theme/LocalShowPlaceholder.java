package com.robinhood.compose.bento.theme;

import androidx.compose.foundation.gestures.ForEachGesture;
import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.compose.C11917R;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.ModifiersKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LocalShowPlaceholder.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a9\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u000e\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0012\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0011\"\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"", "isLoading", "Landroidx/compose/ui/Modifier;", "modifier", "", "loadingContentDescription", "Lkotlin/Function0;", "", "content", "Loadable", "(ZLandroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "isVisible", "Landroidx/compose/ui/graphics/Shape;", "shapeOverride", "withBentoPlaceholder", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "withBentoCirclePlaceholder", "(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;", "withBentoPillPlaceholder", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalShowPlaceholder", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalShowPlaceholder", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", LocalShowPlaceholder.LoadableTestTag, "Ljava/lang/String;", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.theme.LocalShowPlaceholderKt, reason: use source file name */
/* loaded from: classes20.dex */
public final class LocalShowPlaceholder {
    public static final String LoadableTestTag = "LoadableTestTag";
    private static final CompositionLocal6<Boolean> LocalShowPlaceholder = CompositionLocal3.compositionLocalOf$default(null, new Function0() { // from class: com.robinhood.compose.bento.theme.LocalShowPlaceholderKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(LocalShowPlaceholder.LocalShowPlaceholder$lambda$0());
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loadable$lambda$1(boolean z, Modifier modifier, String str, Function2 function2, int i, int i2, Composer composer, int i3) {
        Loadable(z, modifier, str, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LocalShowPlaceholder$lambda$0() {
        return false;
    }

    public static final CompositionLocal6<Boolean> getLocalShowPlaceholder() {
        return LocalShowPlaceholder;
    }

    /* compiled from: LocalShowPlaceholder.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.compose.bento.theme.LocalShowPlaceholderKt$Loadable$1 */
    /* loaded from: classes15.dex */
    static final class C326521 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        final /* synthetic */ boolean $isLoading;
        final /* synthetic */ String $loadingContentDescription;
        final /* synthetic */ Modifier $modifier;

        /* JADX WARN: Multi-variable type inference failed */
        C326521(boolean z, Modifier modifier, String str, Function2<? super Composer, ? super Integer, Unit> function2) {
            this.$isLoading = z;
            this.$modifier = modifier;
            this.$loadingContentDescription = str;
            this.$content = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(SemanticsPropertyReceiver semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(String str, SemanticsPropertyReceiver clearAndSetSemantics) {
            Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
            SemanticsPropertiesKt.setContentDescription(clearAndSetSemantics, str);
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(925766724, i, -1, "com.robinhood.compose.bento.theme.Loadable.<anonymous> (LocalShowPlaceholder.kt:41)");
            }
            if (this.$isLoading) {
                composer.startReplaceGroup(1531515895);
                Modifier modifier = this.$modifier;
                PointerEventPass pointerEventPass = PointerEventPass.Initial;
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new PointerInputEventHandler() { // from class: com.robinhood.compose.bento.theme.LocalShowPlaceholderKt$Loadable$1$1$1

                        /* compiled from: LocalShowPlaceholder.kt */
                        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.compose.bento.theme.LocalShowPlaceholderKt$Loadable$1$1$1$1", m3645f = "LocalShowPlaceholder.kt", m3646l = {48, 50}, m3647m = "invokeSuspend")
                        /* renamed from: com.robinhood.compose.bento.theme.LocalShowPlaceholderKt$Loadable$1$1$1$1 */
                        static final class C326531 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                            private /* synthetic */ Object L$0;
                            int label;

                            C326531(Continuation<? super C326531> continuation) {
                                super(2, continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C326531 c326531 = new C326531(continuation);
                                c326531.L$0 = obj;
                                return c326531;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                                return ((C326531) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
                            
                                if (androidx.compose.foundation.gestures.TapGestureDetector4.waitForUpOrCancellation(r1, r11, r10) == r0) goto L16;
                             */
                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invokeSuspend(Object obj) {
                                C326531 c326531;
                                AwaitPointerEventScope awaitPointerEventScope;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                                    PointerEventPass pointerEventPass = PointerEventPass.Initial;
                                    this.L$0 = awaitPointerEventScope2;
                                    this.label = 1;
                                    c326531 = this;
                                    obj = TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope2, false, pointerEventPass, c326531, 1, null);
                                    if (obj != coroutine_suspended) {
                                        awaitPointerEventScope = awaitPointerEventScope2;
                                    }
                                    return coroutine_suspended;
                                }
                                if (i != 1) {
                                    if (i != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                    return Unit.INSTANCE;
                                }
                                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                ResultKt.throwOnFailure(obj);
                                c326531 = this;
                                ((PointerInputChange) obj).consume();
                                PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                                c326531.L$0 = null;
                                c326531.label = 2;
                            }
                        }

                        @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                            Object objAwaitEachGesture = ForEachGesture.awaitEachGesture(pointerInputScope, new C326531(null), continuation);
                            return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifier, pointerEventPass, (PointerInputEventHandler) objRememberedValue);
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.compose.bento.theme.LocalShowPlaceholderKt$Loadable$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LocalShowPlaceholder.C326521.invoke$lambda$2$lambda$1((SemanticsPropertyReceiver) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                Modifier modifierTestTag = TestTag3.testTag(SemanticsModifier6.semantics(modifierPointerInput, true, (Function1) objRememberedValue2), LocalShowPlaceholder.LoadableTestTag);
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(this.$loadingContentDescription);
                final String str = this.$loadingContentDescription;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.compose.bento.theme.LocalShowPlaceholderKt$Loadable$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LocalShowPlaceholder.C326521.invoke$lambda$4$lambda$3(str, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                Modifier modifierClearAndSetSemantics = SemanticsModifier6.clearAndSetSemantics(modifierTestTag, (Function1) objRememberedValue3);
                Function2<Composer, Integer, Unit> function2 = this.$content;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierClearAndSetSemantics);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composer.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function2.invoke(composer, 0);
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1532267645);
                this.$content.invoke(composer, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Loadable(final boolean z, Modifier modifier, String str, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(45605124);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changed(str)) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                CompositionLocal3.CompositionLocalProvider(LocalShowPlaceholder.provides(Boolean.valueOf(z)), ComposableLambda3.rememberComposableLambda(925766724, true, new C326521(z, modifier, str, content), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                }
            } else {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if ((i2 & 4) != 0) {
                    str = StringResources_androidKt.stringResource(C11917R.string.content_description_loading, composerStartRestartGroup, 0);
                    i3 &= -897;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(45605124, i3, -1, "com.robinhood.compose.bento.theme.Loadable (LocalShowPlaceholder.kt:39)");
                }
                CompositionLocal3.CompositionLocalProvider(LocalShowPlaceholder.provides(Boolean.valueOf(z)), ComposableLambda3.rememberComposableLambda(925766724, true, new C326521(z, modifier, str, content), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final String str2 = str;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.theme.LocalShowPlaceholderKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LocalShowPlaceholder.Loadable$lambda$1(z, modifier2, str2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ Modifier withBentoPlaceholder$default(Modifier modifier, boolean z, Shape shape, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            shape = null;
        }
        return withBentoPlaceholder(modifier, z, shape);
    }

    public static final Modifier withBentoPlaceholder(Modifier modifier, final boolean z, final Shape shape) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.robinhood.compose.bento.theme.LocalShowPlaceholderKt.withBentoPlaceholder.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(907541267);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(907541267, i, -1, "com.robinhood.compose.bento.theme.withBentoPlaceholder.<anonymous> (LocalShowPlaceholder.kt:68)");
                }
                if (((Boolean) composer.consume(LocalShowPlaceholder.getLocalShowPlaceholder())).booleanValue()) {
                    Shape shape2 = shape;
                    if (shape2 != null) {
                        composed = ModifiersKt.bentoPlaceholder(composed, z, shape2);
                    } else {
                        composed = ModifiersKt.bentoPlaceholder$default(composed, z, null, 2, null);
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return composed;
            }
        }, 1, null);
    }

    public static /* synthetic */ Modifier withBentoCirclePlaceholder$default(Modifier modifier, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return withBentoCirclePlaceholder(modifier, z);
    }

    public static final Modifier withBentoCirclePlaceholder(Modifier modifier, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return withBentoPlaceholder(modifier, z, RoundedCornerShape2.getCircleShape());
    }

    public static /* synthetic */ Modifier withBentoPillPlaceholder$default(Modifier modifier, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return withBentoPillPlaceholder(modifier, z);
    }

    public static final Modifier withBentoPillPlaceholder(Modifier modifier, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return withBentoPlaceholder(modifier, z, RoundedCornerShape2.RoundedCornerShape(50));
    }
}
