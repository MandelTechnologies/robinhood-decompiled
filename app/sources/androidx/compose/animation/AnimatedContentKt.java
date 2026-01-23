package androidx.compose.animation;

import androidx.collection.ScatterMap6;
import androidx.collection.ScatterMap7;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VisibilityThresholds;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutModifier4;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.plaid.internal.EnumC7081g;
import defpackage.C0008xc140899a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: AnimatedContent.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a±\u0001\u0010\u0015\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001f\b\u0002\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2%\b\u0002\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00042,\u0010\u0014\u001a(\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aW\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u0018\u001a\u00020\u00172>\b\u0002\u0010\u001d\u001a8\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u001c0\u0011¢\u0006\u0004\b\u001f\u0010 \u001a\u001c\u0010$\u001a\u00020\u0006*\u00020!2\u0006\u0010#\u001a\u00020\"H\u0086\u0004¢\u0006\u0004\b$\u0010%\u001a©\u0001\u0010\u0015\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000&2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001f\b\u0002\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072\b\b\u0002\u0010\n\u001a\u00020\t2%\b\u0002\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00042,\u0010\u0014\u001a(\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\u0015\u0010'\"\u0014\u0010(\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, m3636d2 = {"S", "targetState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/ContentTransform;", "Lkotlin/ExtensionFunctionType;", "transitionSpec", "Landroidx/compose/ui/Alignment;", "contentAlignment", "", AnnotatedPrivateKey.LABEL, "Lkotlin/ParameterName;", "name", "", "contentKey", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "", "content", "AnimatedContent", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "", "clip", "Landroidx/compose/ui/unit/IntSize;", "initialSize", "targetSize", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "sizeAnimationSpec", "Landroidx/compose/animation/SizeTransform;", "SizeTransform", "(ZLkotlin/jvm/functions/Function2;)Landroidx/compose/animation/SizeTransform;", "Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/animation/ExitTransition;", "exit", "togetherWith", "(Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;)Landroidx/compose/animation/ContentTransform;", "Landroidx/compose/animation/core/Transition;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "UnspecifiedSize", "J", "animation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class AnimatedContentKt {
    private static final long UnspecifiedSize;

    static {
        long j = Integer.MIN_VALUE;
        UnspecifiedSize = IntSize.m8056constructorimpl((j & 4294967295L) | (j << 32));
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S> void AnimatedContent(final S s, Modifier modifier, Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function1, Alignment alignment, String str, Function1<? super S, ? extends Object> function12, final Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function13;
        int i5;
        Alignment alignment2;
        int i6;
        int i7;
        Function1<? super S, ? extends Object> function14;
        Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> function42;
        final Modifier modifier2;
        final String str2;
        final Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function15;
        final Alignment alignment3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i8;
        Modifier modifier3;
        int i9;
        Alignment topStart;
        Composer composerStartRestartGroup = composer.startRestartGroup(2132720749);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(s) : composerStartRestartGroup.changedInstance(s) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    function13 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function13) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        alignment2 = alignment;
                        i3 |= composerStartRestartGroup.changed(alignment2) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            i3 |= composerStartRestartGroup.changed(str) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                        } else {
                            if ((196608 & i) == 0) {
                                function14 = function12;
                                i3 |= composerStartRestartGroup.changedInstance(function14) ? 131072 : 65536;
                            }
                            if ((i2 & 64) != 0) {
                                if ((i & 1572864) == 0) {
                                    function42 = function4;
                                    i3 |= composerStartRestartGroup.changedInstance(function42) ? 1048576 : 524288;
                                }
                                if (composerStartRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                                    if (i10 != 0) {
                                        modifier3 = Modifier.INSTANCE;
                                        i8 = i6;
                                    } else {
                                        i8 = i6;
                                        modifier3 = modifier;
                                    }
                                    Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function16 = i4 != 0 ? new Function1<AnimatedContentTransitionScope<S>, ContentTransform>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final ContentTransform invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 90, null, 4, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m4780scaleInL8ZKhE$default(AnimationSpecKt.tween$default(EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(90, 0, null, 6, null), 0.0f, 2, null));
                                        }
                                    } : function13;
                                    if (i5 != 0) {
                                        topStart = Alignment.INSTANCE.getTopStart();
                                        i9 = i7;
                                    } else {
                                        i9 = i7;
                                        topStart = alignment2;
                                    }
                                    String str3 = i8 != 0 ? "AnimatedContent" : str;
                                    if (i9 != 0) {
                                        function14 = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final S invoke(S s2) {
                                                return s2;
                                            }
                                        };
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2132720749, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                                    }
                                    Transition transitionUpdateTransition = TransitionKt.updateTransition(s, str3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0);
                                    int i11 = i3 & 8176;
                                    int i12 = i3 >> 3;
                                    AnimatedContent(transitionUpdateTransition, modifier3, function16, topStart, function14, function42, composerStartRestartGroup, i11 | (57344 & i12) | (i12 & 458752), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    str2 = str3;
                                    modifier2 = modifier3;
                                    function15 = function16;
                                    alignment3 = topStart;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    modifier2 = modifier;
                                    str2 = str;
                                    function15 = function13;
                                    alignment3 = alignment2;
                                }
                                final Function1<? super S, ? extends Object> function17 = function14;
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.3
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

                                        public final void invoke(Composer composer2, int i13) {
                                            AnimatedContentKt.AnimatedContent(s, modifier2, function15, alignment3, str2, function17, function4, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i3 |= 1572864;
                            function42 = function4;
                            if (composerStartRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                            }
                            final Function1<? super S, ? extends Object> function172 = function14;
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        function14 = function12;
                        if ((i2 & 64) != 0) {
                        }
                        function42 = function4;
                        if (composerStartRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                        }
                        final Function1<? super S, ? extends Object> function1722 = function14;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    function14 = function12;
                    if ((i2 & 64) != 0) {
                    }
                    function42 = function4;
                    if (composerStartRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                    }
                    final Function1<? super S, ? extends Object> function17222 = function14;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                alignment2 = alignment;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                function14 = function12;
                if ((i2 & 64) != 0) {
                }
                function42 = function4;
                if (composerStartRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                }
                final Function1<? super S, ? extends Object> function172222 = function14;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function13 = function1;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            alignment2 = alignment;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            function14 = function12;
            if ((i2 & 64) != 0) {
            }
            function42 = function4;
            if (composerStartRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            }
            final Function1<? super S, ? extends Object> function1722222 = function14;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function13 = function1;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        alignment2 = alignment;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        function14 = function12;
        if ((i2 & 64) != 0) {
        }
        function42 = function4;
        if (composerStartRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
        }
        final Function1<? super S, ? extends Object> function17222222 = function14;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static /* synthetic */ SizeTransform SizeTransform$default(boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            function2 = new Function2<IntSize, IntSize, SpringSpec<IntSize>>() { // from class: androidx.compose.animation.AnimatedContentKt.SizeTransform.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ SpringSpec<IntSize> invoke(IntSize intSize, IntSize intSize2) {
                    return m4747invokeTemP2vQ(intSize.getPackedValue(), intSize2.getPackedValue());
                }

                /* renamed from: invoke-TemP2vQ, reason: not valid java name */
                public final SpringSpec<IntSize> m4747invokeTemP2vQ(long j, long j2) {
                    return AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m8055boximpl(VisibilityThresholds.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
                }
            };
        }
        return SizeTransform(z, function2);
    }

    public static final SizeTransform SizeTransform(boolean z, Function2<? super IntSize, ? super IntSize, ? extends FiniteAnimationSpec<IntSize>> function2) {
        return new SizeTransformImpl(z, function2);
    }

    public static final ContentTransform togetherWith(EnterTransition enterTransition, ExitTransition exitTransition) {
        return new ContentTransform(enterTransition, exitTransition, 0.0f, null, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S> void AnimatedContent(final Transition<S> transition, Modifier modifier, Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function1, Alignment alignment, Function1<? super S, ? extends Object> function12, final Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function13;
        int i5;
        Alignment topStart;
        int i6;
        Function1<? super S, ? extends Object> function14;
        Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> function42;
        final Modifier modifier3;
        final Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function15;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl;
        SnapshotStateList snapshotStateList;
        int i7;
        final Transition<S> transition2 = transition;
        Composer composerStartRestartGroup = composer.startRestartGroup(-114689412);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(transition2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 2;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    function13 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function13) ? 256 : 128;
                }
                i5 = i2 & 4;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        topStart = alignment;
                        i3 |= composerStartRestartGroup.changed(topStart) ? 2048 : 1024;
                    }
                    i6 = i2 & 8;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            function14 = function12;
                            i3 |= composerStartRestartGroup.changedInstance(function14) ? 16384 : 8192;
                        }
                        if ((i2 & 16) == 0) {
                            if ((i & 196608) == 0) {
                                function42 = function4;
                                i3 |= composerStartRestartGroup.changedInstance(function42) ? 131072 : 65536;
                            }
                            if (composerStartRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                function15 = function13;
                            } else {
                                Modifier modifier4 = i8 != 0 ? Modifier.INSTANCE : modifier2;
                                function15 = i4 != 0 ? new Function1<AnimatedContentTransitionScope<S>, ContentTransform>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final ContentTransform invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 90, null, 4, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m4780scaleInL8ZKhE$default(AnimationSpecKt.tween$default(EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(90, 0, null, 6, null), 0.0f, 2, null));
                                    }
                                } : function13;
                                if (i5 != 0) {
                                    topStart = Alignment.INSTANCE.getTopStart();
                                }
                                if (i6 != 0) {
                                    function14 = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.5
                                        @Override // kotlin.jvm.functions.Function1
                                        public final S invoke(S s) {
                                            return s;
                                        }
                                    };
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-114689412, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:772)");
                                }
                                LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                int i9 = i3 & 14;
                                boolean z = i9 == 4;
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new AnimatedContentTransitionScopeImpl(transition2, topStart, layoutDirection);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = (AnimatedContentTransitionScopeImpl) objRememberedValue;
                                boolean z2 = i9 == 4;
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = SnapshotStateKt.mutableStateListOf(transition2.getCurrentState());
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                SnapshotStateList snapshotStateList2 = (SnapshotStateList) objRememberedValue2;
                                boolean z3 = i9 == 4;
                                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = ScatterMap7.mutableScatterMapOf();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                ScatterMap6 scatterMap6 = (ScatterMap6) objRememberedValue3;
                                if (!snapshotStateList2.contains(transition2.getCurrentState())) {
                                    snapshotStateList2.clear();
                                    snapshotStateList2.add(transition2.getCurrentState());
                                }
                                if (Intrinsics.areEqual(transition2.getCurrentState(), transition2.getTargetState())) {
                                    if (snapshotStateList2.size() != 1 || !Intrinsics.areEqual(snapshotStateList2.get(0), transition2.getCurrentState())) {
                                        snapshotStateList2.clear();
                                        snapshotStateList2.add(transition2.getCurrentState());
                                    }
                                    if (scatterMap6.get_size() != 1 || scatterMap6.containsKey(transition2.getCurrentState())) {
                                        scatterMap6.clear();
                                    }
                                    animatedContentTransitionScopeImpl2.setContentAlignment(topStart);
                                    animatedContentTransitionScopeImpl2.setLayoutDirection$animation_release(layoutDirection);
                                }
                                if (!Intrinsics.areEqual(transition2.getCurrentState(), transition2.getTargetState()) && !snapshotStateList2.contains(transition2.getTargetState())) {
                                    Iterator<T> it = snapshotStateList2.iterator();
                                    int i10 = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            i10 = -1;
                                            break;
                                        } else if (Intrinsics.areEqual(function14.invoke((Object) it.next()), function14.invoke(transition2.getTargetState()))) {
                                            break;
                                        } else {
                                            i10++;
                                        }
                                    }
                                    if (i10 == -1) {
                                        snapshotStateList2.add(transition2.getTargetState());
                                    } else {
                                        snapshotStateList2.set(i10, transition2.getTargetState());
                                    }
                                }
                                if (scatterMap6.containsKey(transition2.getTargetState()) && scatterMap6.containsKey(transition2.getCurrentState())) {
                                    composerStartRestartGroup.startReplaceGroup(919489879);
                                    composerStartRestartGroup.endReplaceGroup();
                                    animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl2;
                                    snapshotStateList = snapshotStateList2;
                                    i7 = 0;
                                } else {
                                    composerStartRestartGroup.startReplaceGroup(916905750);
                                    scatterMap6.clear();
                                    int size = snapshotStateList2.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        int i12 = i11;
                                        final T t = snapshotStateList2.get(i12);
                                        final SnapshotStateList snapshotStateList3 = snapshotStateList2;
                                        final AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl3 = animatedContentTransitionScopeImpl2;
                                        final Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> function43 = function42;
                                        scatterMap6.set(t, ComposableLambda3.rememberComposableLambda(885640742, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
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

                                            /* JADX WARN: Multi-variable type inference failed */
                                            public final void invoke(Composer composer2, int i13) {
                                                if (!composer2.shouldExecute((i13 & 3) != 2, i13 & 1)) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(885640742, i13, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:817)");
                                                }
                                                Function1<AnimatedContentTransitionScope<S>, ContentTransform> function16 = function15;
                                                Object obj = animatedContentTransitionScopeImpl3;
                                                ContentTransform contentTransformRememberedValue = composer2.rememberedValue();
                                                Composer.Companion companion = Composer.INSTANCE;
                                                if (contentTransformRememberedValue == companion.getEmpty()) {
                                                    contentTransformRememberedValue = function16.invoke(obj);
                                                    composer2.updateRememberedValue(contentTransformRememberedValue);
                                                }
                                                final ContentTransform contentTransform = (ContentTransform) contentTransformRememberedValue;
                                                boolean zChanged = composer2.changed(Intrinsics.areEqual(transition2.getSegment().getTargetState(), t));
                                                Transition<S> transition3 = transition2;
                                                S s = t;
                                                Function1<AnimatedContentTransitionScope<S>, ContentTransform> function17 = function15;
                                                Object obj2 = animatedContentTransitionScopeImpl3;
                                                Object objRememberedValue4 = composer2.rememberedValue();
                                                if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                                                    objRememberedValue4 = Intrinsics.areEqual(transition3.getSegment().getTargetState(), s) ? ExitTransition.INSTANCE.getNone() : function17.invoke(obj2).getInitialContentExit();
                                                    composer2.updateRememberedValue(objRememberedValue4);
                                                }
                                                final ExitTransition exitTransition = (ExitTransition) objRememberedValue4;
                                                S s2 = t;
                                                Transition<S> transition4 = transition2;
                                                Object objRememberedValue5 = composer2.rememberedValue();
                                                if (objRememberedValue5 == companion.getEmpty()) {
                                                    objRememberedValue5 = new AnimatedContentTransitionScopeImpl.ChildData(Intrinsics.areEqual(s2, transition4.getTargetState()));
                                                    composer2.updateRememberedValue(objRememberedValue5);
                                                }
                                                AnimatedContentTransitionScopeImpl.ChildData childData = (AnimatedContentTransitionScopeImpl.ChildData) objRememberedValue5;
                                                EnterTransition targetContentEnter = contentTransform.getTargetContentEnter();
                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                boolean zChangedInstance = composer2.changedInstance(contentTransform);
                                                Object objRememberedValue6 = composer2.rememberedValue();
                                                if (zChangedInstance || objRememberedValue6 == companion.getEmpty()) {
                                                    objRememberedValue6 = new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                                        {
                                                            super(3);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                                                            return m4746invoke3p2s80s(measureScope, measurable, constraints.getValue());
                                                        }

                                                        /* renamed from: invoke-3p2s80s, reason: not valid java name */
                                                        public final MeasureResult m4746invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                                                            final Placeable placeableMo7239measureBRTryo0 = measurable.mo7239measureBRTryo0(j);
                                                            int width = placeableMo7239measureBRTryo0.getWidth();
                                                            int height = placeableMo7239measureBRTryo0.getHeight();
                                                            final ContentTransform contentTransform2 = contentTransform;
                                                            return MeasureScope.layout$default(measureScope, width, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                    invoke2(placementScope);
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                public final void invoke2(Placeable.PlacementScope placementScope) {
                                                                    placementScope.place(placeableMo7239measureBRTryo0, 0, 0, contentTransform2.getTargetContentZIndex());
                                                                }
                                                            }, 4, null);
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(objRememberedValue6);
                                                }
                                                Modifier modifierLayout = LayoutModifier4.layout(companion2, (Function3) objRememberedValue6);
                                                childData.setTarget(Intrinsics.areEqual(t, transition2.getTargetState()));
                                                Modifier modifierThen = modifierLayout.then(childData);
                                                Transition<S> transition5 = transition2;
                                                boolean zChangedInstance2 = composer2.changedInstance(t);
                                                final S s3 = t;
                                                Object objRememberedValue7 = composer2.rememberedValue();
                                                if (zChangedInstance2 || objRememberedValue7 == companion.getEmpty()) {
                                                    objRememberedValue7 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Boolean invoke(S s4) {
                                                            return Boolean.valueOf(Intrinsics.areEqual(s4, s3));
                                                        }

                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Boolean invoke(Object obj3) {
                                                            return invoke((AnimatedContentKt$AnimatedContent$6$1$3$1<S>) obj3);
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(objRememberedValue7);
                                                }
                                                Function1 function18 = (Function1) objRememberedValue7;
                                                boolean zChanged2 = composer2.changed(exitTransition);
                                                Object objRememberedValue8 = composer2.rememberedValue();
                                                if (zChanged2 || objRememberedValue8 == companion.getEmpty()) {
                                                    objRememberedValue8 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                                            EnterExitState enterExitState3 = EnterExitState.PostExit;
                                                            return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !exitTransition.getData().getHold());
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(objRememberedValue8);
                                                }
                                                Function2 function2 = (Function2) objRememberedValue8;
                                                final SnapshotStateList<S> snapshotStateList4 = snapshotStateList3;
                                                final S s4 = t;
                                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl4 = animatedContentTransitionScopeImpl3;
                                                final Function4<AnimatedContentScope, S, Composer, Integer, Unit> function44 = function43;
                                                AnimatedVisibilityKt.AnimatedEnterExitImpl(transition5, function18, modifierThen, targetContentEnter, exitTransition, function2, null, ComposableLambda3.rememberComposableLambda(-616195562, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                                        invoke(animatedVisibilityScope, composer3, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, int i14) {
                                                        if ((i14 & 6) == 0) {
                                                            i14 |= (i14 & 8) == 0 ? composer3.changed(animatedVisibilityScope) : composer3.changedInstance(animatedVisibilityScope) ? 4 : 2;
                                                        }
                                                        if (!composer3.shouldExecute((i14 & 19) != 18, i14 & 1)) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-616195562, i14, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:853)");
                                                        }
                                                        boolean zChanged3 = composer3.changed(snapshotStateList4) | composer3.changedInstance(s4) | composer3.changedInstance(animatedContentTransitionScopeImpl4);
                                                        final SnapshotStateList<S> snapshotStateList5 = snapshotStateList4;
                                                        final S s5 = s4;
                                                        final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl5 = animatedContentTransitionScopeImpl4;
                                                        Object objRememberedValue9 = composer3.rememberedValue();
                                                        if (zChanged3 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue9 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                                    final SnapshotStateList<S> snapshotStateList6 = snapshotStateList5;
                                                                    final S s6 = s5;
                                                                    final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl6 = animatedContentTransitionScopeImpl5;
                                                                    return new DisposableEffectResult() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1$invoke$$inlined$onDispose$1
                                                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                                                        public void dispose() {
                                                                            snapshotStateList6.remove(s6);
                                                                            animatedContentTransitionScopeImpl6.getTargetSizeMap$animation_release().remove(s6);
                                                                        }
                                                                    };
                                                                }
                                                            };
                                                            composer3.updateRememberedValue(objRememberedValue9);
                                                        }
                                                        EffectsKt.DisposableEffect(animatedVisibilityScope, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue9, composer3, i14 & 14);
                                                        ScatterMap6 targetSizeMap$animation_release = animatedContentTransitionScopeImpl4.getTargetSizeMap$animation_release();
                                                        S s6 = s4;
                                                        Intrinsics.checkNotNull(animatedVisibilityScope, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                                        targetSizeMap$animation_release.set(s6, ((AnimatedVisibilityScopeImpl) animatedVisibilityScope).getTargetSize$animation_release());
                                                        Object objRememberedValue10 = composer3.rememberedValue();
                                                        if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue10 = new AnimatedContentScopeImpl(animatedVisibilityScope);
                                                            composer3.updateRememberedValue(objRememberedValue10);
                                                        }
                                                        function44.invoke((AnimatedContentScopeImpl) objRememberedValue10, s4, composer3, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer2, 54), composer2, 12582912, 64);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composerStartRestartGroup, 54));
                                        i11 = i12 + 1;
                                        transition2 = transition;
                                        function42 = function4;
                                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl3;
                                        size = size;
                                        snapshotStateList2 = snapshotStateList3;
                                    }
                                    animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl2;
                                    snapshotStateList = snapshotStateList2;
                                    i7 = 0;
                                    composerStartRestartGroup.endReplaceGroup();
                                }
                                boolean zChanged = composerStartRestartGroup.changed(transition.getSegment()) | composerStartRestartGroup.changed(animatedContentTransitionScopeImpl);
                                ContentTransform contentTransformRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged || contentTransformRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    contentTransformRememberedValue = function15.invoke(animatedContentTransitionScopeImpl);
                                    composerStartRestartGroup.updateRememberedValue(contentTransformRememberedValue);
                                }
                                Modifier modifierThen = modifier4.then(animatedContentTransitionScopeImpl.createSizeAnimationModifier$animation_release((ContentTransform) contentTransformRememberedValue, composerStartRestartGroup, i7));
                                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new AnimatedContentMeasurePolicy(animatedContentTransitionScopeImpl);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                AnimatedContentMeasurePolicy animatedContentMeasurePolicy = (AnimatedContentMeasurePolicy) objRememberedValue4;
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i7);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen);
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, animatedContentMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                composerStartRestartGroup.startReplaceGroup(-1490874326);
                                int size2 = snapshotStateList.size();
                                for (int i13 = i7; i13 < size2; i13++) {
                                    C0008xc140899a c0008xc140899a = (Object) snapshotStateList.get(i13);
                                    composerStartRestartGroup.startMovableGroup(1908442329, function14.invoke(c0008xc140899a));
                                    Function2 function2 = (Function2) scatterMap6.get(c0008xc140899a);
                                    if (function2 == null) {
                                        composerStartRestartGroup.startReplaceGroup(-967793488);
                                    } else {
                                        composerStartRestartGroup.startReplaceGroup(1908443505);
                                        function2.invoke(composerStartRestartGroup, Integer.valueOf(i7));
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.endMovableGroup();
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                            }
                            final Alignment alignment2 = topStart;
                            final Function1<? super S, ? extends Object> function16 = function14;
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.9
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

                                    public final void invoke(Composer composer2, int i14) {
                                        AnimatedContentKt.AnimatedContent(transition, modifier3, function15, alignment2, function16, function4, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 196608;
                        function42 = function4;
                        if (composerStartRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        }
                        final Alignment alignment22 = topStart;
                        final Function1<? super S, ? extends Object> function162 = function14;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    function14 = function12;
                    if ((i2 & 16) == 0) {
                    }
                    function42 = function4;
                    if (composerStartRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                    }
                    final Alignment alignment222 = topStart;
                    final Function1<? super S, ? extends Object> function1622 = function14;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                topStart = alignment;
                i6 = i2 & 8;
                if (i6 == 0) {
                }
                function14 = function12;
                if ((i2 & 16) == 0) {
                }
                function42 = function4;
                if (composerStartRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                final Alignment alignment2222 = topStart;
                final Function1<? super S, ? extends Object> function16222 = function14;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function13 = function1;
            i5 = i2 & 4;
            if (i5 != 0) {
            }
            topStart = alignment;
            i6 = i2 & 8;
            if (i6 == 0) {
            }
            function14 = function12;
            if ((i2 & 16) == 0) {
            }
            function42 = function4;
            if (composerStartRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            final Alignment alignment22222 = topStart;
            final Function1<? super S, ? extends Object> function162222 = function14;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 2;
        if (i4 == 0) {
        }
        function13 = function1;
        i5 = i2 & 4;
        if (i5 != 0) {
        }
        topStart = alignment;
        i6 = i2 & 8;
        if (i6 == 0) {
        }
        function14 = function12;
        if ((i2 & 16) == 0) {
        }
        function42 = function4;
        if (composerStartRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        final Alignment alignment222222 = topStart;
        final Function1<? super S, ? extends Object> function1622222 = function14;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
