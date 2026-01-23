package com.robinhood.shared.cards.compose;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SingleValueAnimation;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.NotificationEndCardStyle;
import com.robinhood.shared.cards.compose.NotificationEndCardComposable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NotificationEndCardComposable.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002²\u0006\n\u0010\u000e\u001a\u00020\rX\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\rX\u008a\u0084\u0002²\u0006\n\u0010\u0010\u001a\u00020\rX\u008a\u0084\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0003X\u008a\u008e\u0002"}, m3636d2 = {"NotificationEndCardComposable", "", "isTopCard", "", "modifier", "Landroidx/compose/ui/Modifier;", "animationComplete", "Lkotlin/Function0;", "(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lib-cards-compose_externalDebug", "bgColor", "Landroidx/compose/ui/graphics/Color;", "horizontalPadding", "Landroidx/compose/ui/unit/Dp;", "cornerRadius", "borderStrokeDp", "shadow", "hasAnimationEnded"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.cards.compose.NotificationEndCardComposableKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class NotificationEndCardComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NotificationEndCardComposable$lambda$6(boolean z, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        NotificationEndCardComposable(z, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NotificationEndCardComposable(final boolean z, Modifier modifier, final Function0<Unit> animationComplete, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        EventLogger current;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(animationComplete, "animationComplete");
        Composer composerStartRestartGroup = composer.startRestartGroup(456168210);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(animationComplete) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(456168210, i3, -1, "com.robinhood.shared.cards.compose.NotificationEndCardComposable (NotificationEndCardComposable.kt:36)");
                }
                final NotificationEndCardStyle notificationEndCardStyle = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getCardStackStyle(composerStartRestartGroup, 0).getNotificationEndCardStyle(composerStartRestartGroup, 0);
                SnapshotState4<Color> snapshotState4M4805animateColorAsStateeuL9pac = SingleValueAnimation.m4805animateColorAsStateeuL9pac(!z ? notificationEndCardStyle.getColors().m21859getBgTopCardColor0d7_KjU() : notificationEndCardStyle.getColors().m21858getBgHiddenColor0d7_KjU(), null, "endCardAnimation", null, composerStartRestartGroup, 384, 10);
                SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI = AnimateAsState.m4812animateDpAsStateAjpBEmI(!z ? C2002Dp.m7995constructorimpl(0) : notificationEndCardStyle.getPadding().m21866getHorizontalPaddingD9Ej5fM(), null, "endCardHorizontalPadding", null, composerStartRestartGroup, 384, 10);
                SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI2 = AnimateAsState.m4812animateDpAsStateAjpBEmI(!z ? C2002Dp.m7995constructorimpl(0) : C2002Dp.m7995constructorimpl(8), null, "endCardCornerRadius", null, composerStartRestartGroup, 384, 10);
                SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI3 = AnimateAsState.m4812animateDpAsStateAjpBEmI(!z ? C2002Dp.m7995constructorimpl(0) : C2002Dp.m7995constructorimpl((float) 0.5d), null, "endCardBorderStroke", null, composerStartRestartGroup, 384, 10);
                int i5 = i3;
                SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI4 = AnimateAsState.m4812animateDpAsStateAjpBEmI(!z ? C2002Dp.m7995constructorimpl(0) : C2002Dp.m7995constructorimpl(1), null, "endCardShadow", null, composerStartRestartGroup, 384, 10);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(NotificationEndCardComposable$lambda$2(snapshotState4M4812animateDpAsStateAjpBEmI2));
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifier4, NotificationEndCardComposable$lambda$1(snapshotState4M4812animateDpAsStateAjpBEmI), 0.0f, 2, null);
                long jNotificationEndCardComposable$lambda$0 = NotificationEndCardComposable$lambda$0(snapshotState4M4805animateColorAsStateeuL9pac);
                float fNotificationEndCardComposable$lambda$4 = NotificationEndCardComposable$lambda$4(snapshotState4M4812animateDpAsStateAjpBEmI4);
                long jM21861getTextColor0d7_KjU = notificationEndCardStyle.getColors().m21861getTextColor0d7_KjU();
                BorderStroke borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(NotificationEndCardComposable$lambda$3(snapshotState4M4812animateDpAsStateAjpBEmI3), notificationEndCardStyle.getColors().m21860getBorderColor0d7_KjU());
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-137706281, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.cards.compose.NotificationEndCardComposableKt.NotificationEndCardComposable.1
                    private static final boolean invoke$lambda$1(SnapshotState<Boolean> snapshotState) {
                        return snapshotState.getValue().booleanValue();
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* compiled from: NotificationEndCardComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.cards.compose.NotificationEndCardComposableKt$NotificationEndCardComposable$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
                        final /* synthetic */ Function0<Unit> $animationComplete;
                        final /* synthetic */ CoroutineScope $coroutineScope;
                        final /* synthetic */ SnapshotState<Boolean> $hasAnimationEnded$delegate;
                        final /* synthetic */ boolean $isTopCard;
                        final /* synthetic */ NotificationEndCardStyle $notificationEndCardStyle;

                        AnonymousClass1(NotificationEndCardStyle notificationEndCardStyle, CoroutineScope coroutineScope, Function0<Unit> function0, boolean z, SnapshotState<Boolean> snapshotState) {
                            this.$notificationEndCardStyle = notificationEndCardStyle;
                            this.$coroutineScope = coroutineScope;
                            this.$animationComplete = function0;
                            this.$isTopCard = z;
                            this.$hasAnimationEnded$delegate = snapshotState;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                            invoke(animatedVisibilityScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(531421103, i, -1, "com.robinhood.shared.cards.compose.NotificationEndCardComposable.<anonymous>.<anonymous> (NotificationEndCardComposable.kt:94)");
                            }
                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, this.$notificationEndCardStyle.getPadding().m21867getVerticalPaddingD9Ej5fM(), 1, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            NotificationEndCardStyle notificationEndCardStyle = this.$notificationEndCardStyle;
                            final CoroutineScope coroutineScope = this.$coroutineScope;
                            final Function0<Unit> function0 = this.$animationComplete;
                            boolean z = this.$isTopCard;
                            final SnapshotState<Boolean> snapshotState = this.$hasAnimationEnded$delegate;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer, 54);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            long jM21861getTextColor0d7_KjU = notificationEndCardStyle.getColors().m21861getTextColor0d7_KjU();
                            composer.startReplaceGroup(-1746271574);
                            boolean zChangedInstance = composer.changedInstance(coroutineScope) | composer.changed(function0);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.shared.cards.compose.NotificationEndCardComposableKt$NotificationEndCardComposable$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return NotificationEndCardComposable.C373711.AnonymousClass1.invoke$lambda$2$lambda$1$lambda$0(coroutineScope, snapshotState, function0);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            NotificationEndCardAnimation.m24783NotificationEndCardAnimationdrOMvmE((Function0) objRememberedValue, null, Color.m6701boximpl(jM21861getTextColor0d7_KjU), z, composer, 0, 2);
                            TextStyle textStyle = notificationEndCardStyle.getTextStyle();
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37374R.string.card_stack_empty_message, composer, 0), null, Color.m6701boximpl(notificationEndCardStyle.getColors().m21861getTextColor0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textStyle, composer, 24576, 0, 8170);
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$2$lambda$1$lambda$0(CoroutineScope coroutineScope, SnapshotState snapshotState, Function0 function0) {
                            C373711.invoke$lambda$2(snapshotState, true);
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new NotificationEndCardComposable2(function0, null), 3, null);
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void invoke$lambda$2(SnapshotState<Boolean> snapshotState, boolean z2) {
                        snapshotState.setValue(Boolean.valueOf(z2));
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-137706281, i6, -1, "com.robinhood.shared.cards.compose.NotificationEndCardComposable.<anonymous> (NotificationEndCardComposable.kt:92)");
                        }
                        composer2.startReplaceGroup(1849434622);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceGroup();
                        AnimatedVisibilityKt.AnimatedVisibility(!invoke$lambda$1(r12), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(531421103, true, new AnonymousClass1(notificationEndCardStyle, coroutineScope, animationComplete, z, (SnapshotState) objRememberedValue3), composer2, 54), composer2, 196608, 30);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                Modifier modifier5 = modifier4;
                SurfaceKt.m5967SurfaceT9BRK9s(modifierM5144paddingVpY3zN4$default, roundedCornerShapeM5327RoundedCornerShape0680j_4, jNotificationEndCardComposable$lambda$0, jM21861getTextColor0d7_KjU, 0.0f, fNotificationEndCardComposable$lambda$4, borderStrokeM4886BorderStrokecXLIe8U, composableLambdaRememberComposableLambda, composerStartRestartGroup, 12582912, 16);
                composerStartRestartGroup = composerStartRestartGroup;
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                Boolean boolValueOf = Boolean.valueOf(z);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i6 = i5 & 14;
                zChangedInstance = (i6 != 4) | composerStartRestartGroup.changedInstance(current);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new NotificationEndCardComposable3(z, current, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.cards.compose.NotificationEndCardComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return NotificationEndCardComposable.NotificationEndCardComposable$lambda$6(z, modifier3, animationComplete, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final NotificationEndCardStyle notificationEndCardStyle2 = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getCardStackStyle(composerStartRestartGroup, 0).getNotificationEndCardStyle(composerStartRestartGroup, 0);
            SnapshotState4<Color> snapshotState4M4805animateColorAsStateeuL9pac2 = SingleValueAnimation.m4805animateColorAsStateeuL9pac(!z ? notificationEndCardStyle2.getColors().m21859getBgTopCardColor0d7_KjU() : notificationEndCardStyle2.getColors().m21858getBgHiddenColor0d7_KjU(), null, "endCardAnimation", null, composerStartRestartGroup, 384, 10);
            SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI5 = AnimateAsState.m4812animateDpAsStateAjpBEmI(!z ? C2002Dp.m7995constructorimpl(0) : notificationEndCardStyle2.getPadding().m21866getHorizontalPaddingD9Ej5fM(), null, "endCardHorizontalPadding", null, composerStartRestartGroup, 384, 10);
            SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI22 = AnimateAsState.m4812animateDpAsStateAjpBEmI(!z ? C2002Dp.m7995constructorimpl(0) : C2002Dp.m7995constructorimpl(8), null, "endCardCornerRadius", null, composerStartRestartGroup, 384, 10);
            SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI32 = AnimateAsState.m4812animateDpAsStateAjpBEmI(!z ? C2002Dp.m7995constructorimpl(0) : C2002Dp.m7995constructorimpl((float) 0.5d), null, "endCardBorderStroke", null, composerStartRestartGroup, 384, 10);
            int i52 = i3;
            SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI42 = AnimateAsState.m4812animateDpAsStateAjpBEmI(!z ? C2002Dp.m7995constructorimpl(0) : C2002Dp.m7995constructorimpl(1), null, "endCardShadow", null, composerStartRestartGroup, 384, 10);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(NotificationEndCardComposable$lambda$2(snapshotState4M4812animateDpAsStateAjpBEmI22));
            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(modifier4, NotificationEndCardComposable$lambda$1(snapshotState4M4812animateDpAsStateAjpBEmI5), 0.0f, 2, null);
            long jNotificationEndCardComposable$lambda$02 = NotificationEndCardComposable$lambda$0(snapshotState4M4805animateColorAsStateeuL9pac2);
            float fNotificationEndCardComposable$lambda$42 = NotificationEndCardComposable$lambda$4(snapshotState4M4812animateDpAsStateAjpBEmI42);
            long jM21861getTextColor0d7_KjU2 = notificationEndCardStyle2.getColors().m21861getTextColor0d7_KjU();
            BorderStroke borderStrokeM4886BorderStrokecXLIe8U2 = BorderStroke2.m4886BorderStrokecXLIe8U(NotificationEndCardComposable$lambda$3(snapshotState4M4812animateDpAsStateAjpBEmI32), notificationEndCardStyle2.getColors().m21860getBorderColor0d7_KjU());
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-137706281, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.cards.compose.NotificationEndCardComposableKt.NotificationEndCardComposable.1
                private static final boolean invoke$lambda$1(SnapshotState<Boolean> snapshotState) {
                    return snapshotState.getValue().booleanValue();
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                /* compiled from: NotificationEndCardComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.cards.compose.NotificationEndCardComposableKt$NotificationEndCardComposable$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
                    final /* synthetic */ Function0<Unit> $animationComplete;
                    final /* synthetic */ CoroutineScope $coroutineScope;
                    final /* synthetic */ SnapshotState<Boolean> $hasAnimationEnded$delegate;
                    final /* synthetic */ boolean $isTopCard;
                    final /* synthetic */ NotificationEndCardStyle $notificationEndCardStyle;

                    AnonymousClass1(NotificationEndCardStyle notificationEndCardStyle, CoroutineScope coroutineScope, Function0<Unit> function0, boolean z, SnapshotState<Boolean> snapshotState) {
                        this.$notificationEndCardStyle = notificationEndCardStyle;
                        this.$coroutineScope = coroutineScope;
                        this.$animationComplete = function0;
                        this.$isTopCard = z;
                        this.$hasAnimationEnded$delegate = snapshotState;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                        invoke(animatedVisibilityScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(531421103, i, -1, "com.robinhood.shared.cards.compose.NotificationEndCardComposable.<anonymous>.<anonymous> (NotificationEndCardComposable.kt:94)");
                        }
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, this.$notificationEndCardStyle.getPadding().m21867getVerticalPaddingD9Ej5fM(), 1, null);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        NotificationEndCardStyle notificationEndCardStyle = this.$notificationEndCardStyle;
                        final CoroutineScope coroutineScope = this.$coroutineScope;
                        final Function0 function0 = this.$animationComplete;
                        boolean z = this.$isTopCard;
                        final SnapshotState snapshotState = this.$hasAnimationEnded$delegate;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer, 54);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        long jM21861getTextColor0d7_KjU = notificationEndCardStyle.getColors().m21861getTextColor0d7_KjU();
                        composer.startReplaceGroup(-1746271574);
                        boolean zChangedInstance = composer.changedInstance(coroutineScope) | composer.changed(function0);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.cards.compose.NotificationEndCardComposableKt$NotificationEndCardComposable$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return NotificationEndCardComposable.C373711.AnonymousClass1.invoke$lambda$2$lambda$1$lambda$0(coroutineScope, snapshotState, function0);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        NotificationEndCardAnimation.m24783NotificationEndCardAnimationdrOMvmE((Function0) objRememberedValue, null, Color.m6701boximpl(jM21861getTextColor0d7_KjU), z, composer, 0, 2);
                        TextStyle textStyle = notificationEndCardStyle.getTextStyle();
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37374R.string.card_stack_empty_message, composer, 0), null, Color.m6701boximpl(notificationEndCardStyle.getColors().m21861getTextColor0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textStyle, composer, 24576, 0, 8170);
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1$lambda$0(CoroutineScope coroutineScope, SnapshotState snapshotState, Function0 function0) {
                        C373711.invoke$lambda$2(snapshotState, true);
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new NotificationEndCardComposable2(function0, null), 3, null);
                        return Unit.INSTANCE;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void invoke$lambda$2(SnapshotState<Boolean> snapshotState, boolean z2) {
                    snapshotState.setValue(Boolean.valueOf(z2));
                }

                public final void invoke(Composer composer2, int i62) {
                    if ((i62 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-137706281, i62, -1, "com.robinhood.shared.cards.compose.NotificationEndCardComposable.<anonymous> (NotificationEndCardComposable.kt:92)");
                    }
                    composer2.startReplaceGroup(1849434622);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceGroup();
                    AnimatedVisibilityKt.AnimatedVisibility(!invoke$lambda$1(r12), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(531421103, true, new AnonymousClass1(notificationEndCardStyle2, coroutineScope2, animationComplete, z, (SnapshotState) objRememberedValue3), composer2, 54), composer2, 196608, 30);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            Modifier modifier52 = modifier4;
            SurfaceKt.m5967SurfaceT9BRK9s(modifierM5144paddingVpY3zN4$default2, roundedCornerShapeM5327RoundedCornerShape0680j_42, jNotificationEndCardComposable$lambda$02, jM21861getTextColor0d7_KjU2, 0.0f, fNotificationEndCardComposable$lambda$42, borderStrokeM4886BorderStrokecXLIe8U2, composableLambdaRememberComposableLambda2, composerStartRestartGroup, 12582912, 16);
            composerStartRestartGroup = composerStartRestartGroup;
            current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            Boolean boolValueOf2 = Boolean.valueOf(z);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            int i62 = i52 & 14;
            zChangedInstance = (i62 != 4) | composerStartRestartGroup.changedInstance(current);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue2 = new NotificationEndCardComposable3(z, current, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i62);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final long NotificationEndCardComposable$lambda$0(SnapshotState4<Color> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    private static final float NotificationEndCardComposable$lambda$1(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    private static final float NotificationEndCardComposable$lambda$2(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    private static final float NotificationEndCardComposable$lambda$3(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    private static final float NotificationEndCardComposable$lambda$4(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }
}
