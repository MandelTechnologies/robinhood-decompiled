package com.truelayer.payments.p419ui.components.inputs;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.Transformable3;
import androidx.compose.foundation.gestures.TransformableState;
import androidx.compose.foundation.gestures.TransformableState6;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p011ui.graphics.ImageBitmap;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.input.ImeAction;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.window.AndroidDialog_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.core.domain.payments.Image;
import com.truelayer.payments.p419ui.components.SvgImage4;
import com.truelayer.payments.p419ui.components.inputs.form.models.FieldState;
import com.truelayer.payments.p419ui.components.inputs.form.models.Fields6;
import com.truelayer.payments.p419ui.utils.TestTags;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.ByteString;

/* compiled from: TextInputWithImage.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\b\u001a{\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aZ\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u001e2!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u000fH\u0003¢\u0006\u0002\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#²\u0006\n\u0010$\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010%\u001a\u00020&X\u008a\u008e\u0002"}, m3636d2 = {"TanImage", "", "image", "Lcom/truelayer/payments/core/domain/payments/Image;", "modifier", "Landroidx/compose/ui/Modifier;", "forceMaxWidth", "", "(Lcom/truelayer/payments/core/domain/payments/Image;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "TextInputWithImage", "imageModifier", "dialogImageModifier", "field", "Lcom/truelayer/payments/ui/components/inputs/form/models/TextWithImageField;", "onChange", "Lkotlin/Function1;", "Lcom/truelayer/payments/ui/components/inputs/form/models/FieldState;", "Lkotlin/ParameterName;", "name", "value", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "boxWithConstraintsScope", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "TextInputWithImage-vdpxvcM", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lcom/truelayer/payments/ui/components/inputs/form/models/TextWithImageField;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/KeyboardActions;ILandroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;II)V", "ZoomableTanImage", "onClick", "Lkotlin/Function0;", "onZoom", "Lcom/truelayer/payments/ui/components/inputs/ZoomDirection;", "direction", "(Lcom/truelayer/payments/core/domain/payments/Image;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "payments-ui_release", "isFullScreen", "scale", ""}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class TextInputWithImageKt {
    /* renamed from: TextInputWithImage-vdpxvcM, reason: not valid java name */
    public static final void m27059TextInputWithImagevdpxvcM(Modifier modifier, Modifier modifier2, Modifier modifier3, final Fields6 field, final Function1<? super FieldState, Unit> onChange, KeyboardActions keyboardActions, int i, BoxWithConstraints4 boxWithConstraints4, Composer composer, final int i2, final int i3) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-737921766);
        Modifier modifier4 = (i3 & 1) != 0 ? Modifier.INSTANCE : modifier;
        Modifier modifier5 = (i3 & 2) != 0 ? Modifier.INSTANCE : modifier2;
        final Modifier modifier6 = (i3 & 4) != 0 ? Modifier.INSTANCE : modifier3;
        KeyboardActions keyboardActions2 = (i3 & 32) != 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
        int iM7746getDefaulteUduSuo = (i3 & 64) != 0 ? ImeAction.INSTANCE.m7746getDefaulteUduSuo() : i;
        BoxWithConstraints4 boxWithConstraints42 = (i3 & 128) != 0 ? null : boxWithConstraints4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-737921766, i2, -1, "com.truelayer.payments.ui.components.inputs.TextInputWithImage (TextInputWithImage.kt:46)");
        }
        composerStartRestartGroup.startReplaceableGroup(186064290);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(186064330);
        if (TextInputWithImage_vdpxvcM$lambda$1(snapshotState)) {
            composerStartRestartGroup.startReplaceableGroup(186064397);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.components.inputs.TextInputWithImageKt$TextInputWithImage$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        TextInputWithImageKt.TextInputWithImage_vdpxvcM$lambda$2(snapshotState, false);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidDialog_androidKt.Dialog((Function0) objRememberedValue2, null, ComposableLambda3.composableLambda(composerStartRestartGroup, -807196504, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.TextInputWithImageKt$TextInputWithImage$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-807196504, i4, -1, "com.truelayer.payments.ui.components.inputs.TextInputWithImage.<anonymous> (TextInputWithImage.kt:53)");
                        }
                        Image image = field.getImage();
                        Modifier modifierThen = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifier6);
                        composer2.startReplaceableGroup(-1963556316);
                        final SnapshotState<Boolean> snapshotState2 = snapshotState;
                        Object objRememberedValue3 = composer2.rememberedValue();
                        Composer.Companion companion2 = Composer.INSTANCE;
                        if (objRememberedValue3 == companion2.getEmpty()) {
                            objRememberedValue3 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.components.inputs.TextInputWithImageKt$TextInputWithImage$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    TextInputWithImageKt.TextInputWithImage_vdpxvcM$lambda$2(snapshotState2, false);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        Function0 function0 = (Function0) objRememberedValue3;
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(-1963556265);
                        final SnapshotState<Boolean> snapshotState3 = snapshotState;
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (objRememberedValue4 == companion2.getEmpty()) {
                            objRememberedValue4 = new Function1<ZoomDirection, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.TextInputWithImageKt$TextInputWithImage$2$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(ZoomDirection zoomDirection) {
                                    invoke2(zoomDirection);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(ZoomDirection it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    if (it == ZoomDirection.Out) {
                                        TextInputWithImageKt.TextInputWithImage_vdpxvcM$lambda$2(snapshotState3, false);
                                    }
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        composer2.endReplaceableGroup();
                        TextInputWithImageKt.ZoomableTanImage(image, modifierThen, true, function0, (Function1) objRememberedValue4, composer2, 28040, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), composerStartRestartGroup, 390, 2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        final Modifier modifier7 = modifier4;
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion2);
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
        final Modifier modifier8 = modifier6;
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Column6 column6 = Column6.INSTANCE;
        Image image = field.getImage();
        Modifier modifierThen = SizeKt.m5169size3ABfNKs(companion2, C2002Dp.m7995constructorimpl(200)).then(modifier5);
        composerStartRestartGroup.startReplaceableGroup(-1963555871);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.components.inputs.TextInputWithImageKt$TextInputWithImage$3$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    TextInputWithImageKt.TextInputWithImage_vdpxvcM$lambda$2(snapshotState, !TextInputWithImageKt.TextInputWithImage_vdpxvcM$lambda$1(r0));
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        Function0 function0 = (Function0) objRememberedValue3;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1963555816);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new Function1<ZoomDirection, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.TextInputWithImageKt$TextInputWithImage$3$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ZoomDirection zoomDirection) {
                    invoke2(zoomDirection);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ZoomDirection it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (it == ZoomDirection.f6472In) {
                        TextInputWithImageKt.TextInputWithImage_vdpxvcM$lambda$2(snapshotState, true);
                    }
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        composerStartRestartGroup.endReplaceableGroup();
        ZoomableTanImage(image, modifierThen, false, function0, (Function1) objRememberedValue4, composerStartRestartGroup, 27656, 4);
        int i4 = i2 >> 6;
        int i5 = (i2 & 14) | 64 | (i4 & 896) | (i4 & 7168);
        int i6 = i2 >> 3;
        final Modifier modifier9 = modifier5;
        final KeyboardActions keyboardActions3 = keyboardActions2;
        final BoxWithConstraints4 boxWithConstraints43 = boxWithConstraints42;
        final int i7 = iM7746getDefaulteUduSuo;
        TextInputKt.m27056TextInput9ApJK6A(modifier7, field, onChange, keyboardActions3, 0, i7, boxWithConstraints43, composerStartRestartGroup, i5 | (458752 & i6) | (i6 & 3670016), 16);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.TextInputWithImageKt$TextInputWithImage$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    TextInputWithImageKt.m27059TextInputWithImagevdpxvcM(modifier7, modifier9, modifier8, field, onChange, keyboardActions3, i7, boxWithConstraints43, composer2, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextInputWithImage_vdpxvcM$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ZoomableTanImage(final Image image, Modifier modifier, boolean z, final Function0<Unit> function0, final Function1<? super ZoomDirection, Unit> function1, Composer composer, final int i, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1138150272);
        final Modifier modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        boolean z2 = (i2 & 4) != 0 ? false : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1138150272, i, -1, "com.truelayer.payments.ui.components.inputs.ZoomableTanImage (TextInputWithImage.kt:103)");
        }
        composerStartRestartGroup.startReplaceableGroup(-881616071);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-881615996);
        boolean z3 = (((57344 & i) ^ 24576) > 16384 && composerStartRestartGroup.changed(function1)) || (i & 24576) == 16384;
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (z3 || objRememberedValue2 == companion.getEmpty()) {
            final float f = 0.03f;
            objRememberedValue2 = new Function3<Float, Offset, Float, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.TextInputWithImageKt$ZoomableTanImage$state$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Float f2, Offset offset, Float f3) {
                    m27060invoked4ec7I(f2.floatValue(), offset.getPackedValue(), f3.floatValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                public final void m27060invoked4ec7I(float f2, long j, float f3) {
                    SnapshotState<Float> snapshotState2 = snapshotState;
                    TextInputWithImageKt.ZoomableTanImage$lambda$9(snapshotState2, TextInputWithImageKt.ZoomableTanImage$lambda$8(snapshotState2) * f2);
                    float f4 = 1;
                    float f5 = f;
                    if (f2 < f4 - f5) {
                        function1.invoke(ZoomDirection.Out);
                    } else if (f2 > f4 + f5) {
                        function1.invoke(ZoomDirection.f6472In);
                    }
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        TransformableState transformableStateRememberTransformableState = TransformableState6.rememberTransformableState((Function3) objRememberedValue2, composerStartRestartGroup, 0);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-881615682);
        boolean z4 = (((i & 7168) ^ 3072) > 2048 && composerStartRestartGroup.changed(function0)) || (i & 3072) == 2048;
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (z4 || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.components.inputs.TextInputWithImageKt$ZoomableTanImage$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    function0.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierTransformable = Transformable3.transformable(ClickableKt.m4893clickableXHw0xAI$default(companion2, false, null, null, (Function0) objRememberedValue3, 7, null), transformableStateRememberTransformableState, true, true);
        Alignment center = Alignment.INSTANCE.getCenter();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierTransformable);
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        TanImage(image, TestTag3.testTag(modifier2, TestTags.TAN_IMAGE), z2, composerStartRestartGroup, (i & 896) | 8, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z5 = z2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.TextInputWithImageKt.ZoomableTanImage.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    TextInputWithImageKt.ZoomableTanImage(image, modifier2, z5, function0, function1, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ZoomableTanImage$lambda$9(SnapshotState<Float> snapshotState, float f) {
        snapshotState.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TanImage(final Image image, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        Continuation continuation;
        Composer composerStartRestartGroup = composer.startRestartGroup(992011092);
        final Modifier modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z2 = (i2 & 4) != 0 ? false : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(992011092, i, -1, "com.truelayer.payments.ui.components.inputs.TanImage (TextInputWithImage.kt:135)");
        }
        if (image instanceof Image.Base64) {
            composerStartRestartGroup.startReplaceableGroup(307807795);
            ByteString byteStringDecodeBase64 = ByteString.INSTANCE.decodeBase64(((Image.Base64) image).getData());
            Unit unit = null;
            byte[] byteArray = byteStringDecodeBase64 != null ? byteStringDecodeBase64.toByteArray() : null;
            composerStartRestartGroup.startReplaceableGroup(307807837);
            if (byteArray == null) {
                continuation = null;
            } else {
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                Intrinsics.checkNotNullExpressionValue(bitmapDecodeByteArray, "decodeByteArray(...)");
                ImageBitmap imageBitmapAsImageBitmap = AndroidImageBitmap_androidKt.asImageBitmap(bitmapDecodeByteArray);
                Modifier modifierAspectRatio$default = z2 ? AspectRatio3.aspectRatio$default(Modifier.INSTANCE, imageBitmapAsImageBitmap.getWidth() / imageBitmapAsImageBitmap.getHeight(), false, 2, null) : Modifier.INSTANCE;
                continuation = null;
                ImageKt.m4912Image5hnEew(imageBitmapAsImageBitmap, null, Modifier.INSTANCE.then(modifier2).then(modifierAspectRatio$default), null, null, 0.0f, null, 0, composerStartRestartGroup, 56, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                composerStartRestartGroup = composerStartRestartGroup;
                unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (unit == null) {
                EffectsKt.LaunchedEffect(image, new TextInputWithImageKt$TanImage$2$1(continuation), composerStartRestartGroup, 72);
                Composer composer2 = composerStartRestartGroup;
                TextKt.m6028Text4IGK_g("Failed to load the image", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 6, 0, 131070);
                composerStartRestartGroup = composer2;
            }
            composerStartRestartGroup.endReplaceableGroup();
        } else if (image instanceof Image.Uri) {
            composerStartRestartGroup.startReplaceableGroup(307808881);
            SvgImage4.SvgImage(modifier2, ((Image.Uri) image).getUri(), null, null, null, ComposableSingletons$TextInputWithImageKt.INSTANCE.m27055getLambda1$payments_ui_release(), composerStartRestartGroup, ((i >> 3) & 14) | 196608, 28);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(307809091);
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.TextInputWithImageKt.TanImage.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    TextInputWithImageKt.TanImage(image, modifier2, z2, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TextInputWithImage_vdpxvcM$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ZoomableTanImage$lambda$8(SnapshotState<Float> snapshotState) {
        return snapshotState.getValue().floatValue();
    }
}
