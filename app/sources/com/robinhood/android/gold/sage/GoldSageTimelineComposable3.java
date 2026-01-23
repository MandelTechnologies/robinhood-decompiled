package com.robinhood.android.gold.sage;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.RectangleShape2;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.gold.lib.sage.GoldSageBottomBar3;
import com.robinhood.android.gold.lib.sage.GoldSageScaffold3;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import gold.proto.p464v1.GoldSageTimeline;
import gold.proto.p464v1.GoldSageTimelineItem;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: GoldSageTimelineComposable.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001aC\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0002\u0010\f\u001a+\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0003¢\u0006\u0002\u0010\u0014\u001a'\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0019\u001a\u001f\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010#\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010$\"\u0010\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001e\"\u0010\u0010\u001f\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001e\"\u0010\u0010 \u001a\u00020\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001e\"\u0010\u0010!\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001e\"\u0010\u0010\"\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001e¨\u0006%"}, m3636d2 = {"GoldSageTimelineComposable", "", "content", "Lgold/proto/v1/GoldSageTimeline;", "onClickCta", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "(Lgold/proto/v1/GoldSageTimeline;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;Landroidx/compose/runtime/Composer;II)V", "Content", "title", "", "descriptionMarkdown", "timeline", "Lkotlinx/collections/immutable/ImmutableList;", "Lgold/proto/v1/GoldSageTimelineItem;", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/runtime/Composer;I)V", "TimelineItemRow", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "positionType", "Lcom/robinhood/android/gold/sage/TimelinePositionType;", "(Lgold/proto/v1/GoldSageTimelineItem;Lcom/robinhood/android/gold/sage/TimelinePositionType;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Timeline", "(Lcom/robinhood/android/gold/sage/TimelinePositionType;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "columnWidth", "Landroidx/compose/ui/unit/Dp;", "F", "incompleteDotSize", "completeOuterDotSize", "completeInnerDotSize", "connectorWidth", "ContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-gold-sage_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.sage.GoldSageTimelineComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldSageTimelineComposable3 {
    private static final float columnWidth = C2002Dp.m7995constructorimpl(24);
    private static final float incompleteDotSize = C2002Dp.m7995constructorimpl(12);
    private static final float completeOuterDotSize = C2002Dp.m7995constructorimpl(20);
    private static final float completeInnerDotSize = C2002Dp.m7995constructorimpl((float) 4.5d);
    private static final float connectorWidth = C2002Dp.m7995constructorimpl(2);

    /* compiled from: GoldSageTimelineComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.gold.sage.GoldSageTimelineComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GoldSageTimelineComposable5.values().length];
            try {
                iArr[GoldSageTimelineComposable5.TOP_COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GoldSageTimelineComposable5.SECOND_INCOMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GoldSageTimelineComposable5.BETWEEN_INCOMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GoldSageTimelineComposable5.BOTTOM_INCOMPLETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$3(String str, String str2, ImmutableList immutableList, int i, Composer composer, int i2) {
        Content(str, str2, immutableList, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContentPreview$lambda$9(int i, Composer composer, int i2) {
        ContentPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldSageTimelineComposable$lambda$0(GoldSageTimeline goldSageTimeline, Function0 function0, Modifier modifier, Screen screen, Context context, int i, int i2, Composer composer, int i3) {
        GoldSageTimelineComposable(goldSageTimeline, function0, modifier, screen, context, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Timeline$lambda$8(GoldSageTimelineComposable5 goldSageTimelineComposable5, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Timeline(goldSageTimelineComposable5, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimelineItemRow$lambda$5(GoldSageTimelineItem goldSageTimelineItem, GoldSageTimelineComposable5 goldSageTimelineComposable5, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TimelineItemRow(goldSageTimelineItem, goldSageTimelineComposable5, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldSageTimelineComposable(final GoldSageTimeline content, final Function0<Unit> onClickCta, Modifier modifier, Screen screen, Context context, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Screen screen2;
        int i4;
        Context context2;
        final Modifier modifier3;
        Context context3;
        Screen screen3;
        final Screen screen4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(onClickCta, "onClickCta");
        Composer composerStartRestartGroup = composer.startRestartGroup(1898806633);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickCta) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    screen2 = screen;
                    int i6 = composerStartRestartGroup.changedInstance(screen2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    screen2 = screen;
                }
                i3 |= i6;
            } else {
                screen2 = screen;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    context2 = context;
                    i3 |= composerStartRestartGroup.changedInstance(context2) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            screen2 = new Screen(Screen.Name.GOLD_SAGE_TIMELINE, null, null, null, 14, null);
                        }
                        if (i4 == 0) {
                            context3 = null;
                            screen3 = screen2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1898806633, i3, -1, "com.robinhood.android.gold.sage.GoldSageTimelineComposable (GoldSageTimelineComposable.kt:52)");
                        }
                        AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen3, null, context3, null, null, 53, null), ComposableLambda3.rememberComposableLambda(-1053890924, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageTimelineComposableKt.GoldSageTimelineComposable.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i7) {
                                if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1053890924, i7, -1, "com.robinhood.android.gold.sage.GoldSageTimelineComposable.<anonymous> (GoldSageTimelineComposable.kt:59)");
                                }
                                final Modifier modifier4 = modifier3;
                                final GoldSageTimeline goldSageTimeline = content;
                                final Function0<Unit> function0 = onClickCta;
                                GoldSageScaffold3.GoldSageScaffold(null, ComposableLambda3.rememberComposableLambda(-97841183, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageTimelineComposableKt.GoldSageTimelineComposable.1.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                        invoke(paddingValues, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i8) {
                                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                        if ((i8 & 6) == 0) {
                                            i8 |= composer3.changed(paddingValues) ? 4 : 2;
                                        }
                                        if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-97841183, i8, -1, "com.robinhood.android.gold.sage.GoldSageTimelineComposable.<anonymous>.<anonymous> (GoldSageTimelineComposable.kt:60)");
                                        }
                                        Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(PaddingKt.padding(modifier4, paddingValues), null, 1, null);
                                        final GoldSageTimeline goldSageTimeline2 = goldSageTimeline;
                                        final Function0<Unit> function02 = function0;
                                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(637334860, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageTimelineComposableKt.GoldSageTimelineComposable.1.1.1
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer4, Integer num) {
                                                invoke(bentoButtonBar3, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer4, int i9) {
                                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                                if ((i9 & 17) == 16 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(637334860, i9, -1, "com.robinhood.android.gold.sage.GoldSageTimelineComposable.<anonymous>.<anonymous>.<anonymous> (GoldSageTimelineComposable.kt:62)");
                                                }
                                                GoldSageBottomBar3.GoldSageBottomBar(goldSageTimeline2.getCta_text(), function02, null, null, goldSageTimeline2.getCta_disclosure(), null, null, false, composer4, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer3, 54);
                                        final GoldSageTimeline goldSageTimeline3 = goldSageTimeline;
                                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierLogScreenTransitions$default, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(440350201, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageTimelineComposableKt.GoldSageTimelineComposable.1.1.2
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                                                invoke(boxScope, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer4, int i9) {
                                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                                if ((i9 & 17) == 16 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(440350201, i9, -1, "com.robinhood.android.gold.sage.GoldSageTimelineComposable.<anonymous>.<anonymous>.<anonymous> (GoldSageTimelineComposable.kt:71)");
                                                }
                                                GoldSageTimelineComposable3.Content(goldSageTimeline3.getTitle(), goldSageTimeline3.getDescription_markdown(), extensions2.toPersistentList(goldSageTimeline3.getTimeline()), composer4, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer3, 54), composer3, 3504, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, 48, 1);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        screen4 = screen3;
                        context2 = context3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        modifier3 = modifier2;
                    }
                    screen3 = screen2;
                    context3 = context2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen3, null, context3, null, null, 53, null), ComposableLambda3.rememberComposableLambda(-1053890924, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageTimelineComposableKt.GoldSageTimelineComposable.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i7) {
                            if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1053890924, i7, -1, "com.robinhood.android.gold.sage.GoldSageTimelineComposable.<anonymous> (GoldSageTimelineComposable.kt:59)");
                            }
                            final Modifier modifier4 = modifier3;
                            final GoldSageTimeline goldSageTimeline = content;
                            final Function0<Unit> function0 = onClickCta;
                            GoldSageScaffold3.GoldSageScaffold(null, ComposableLambda3.rememberComposableLambda(-97841183, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageTimelineComposableKt.GoldSageTimelineComposable.1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                    invoke(paddingValues, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PaddingValues paddingValues, Composer composer3, int i8) {
                                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                    if ((i8 & 6) == 0) {
                                        i8 |= composer3.changed(paddingValues) ? 4 : 2;
                                    }
                                    if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-97841183, i8, -1, "com.robinhood.android.gold.sage.GoldSageTimelineComposable.<anonymous>.<anonymous> (GoldSageTimelineComposable.kt:60)");
                                    }
                                    Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(PaddingKt.padding(modifier4, paddingValues), null, 1, null);
                                    final GoldSageTimeline goldSageTimeline2 = goldSageTimeline;
                                    final Function0<Unit> function02 = function0;
                                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(637334860, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageTimelineComposableKt.GoldSageTimelineComposable.1.1.1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer4, Integer num) {
                                            invoke(bentoButtonBar3, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer4, int i9) {
                                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                            if ((i9 & 17) == 16 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(637334860, i9, -1, "com.robinhood.android.gold.sage.GoldSageTimelineComposable.<anonymous>.<anonymous>.<anonymous> (GoldSageTimelineComposable.kt:62)");
                                            }
                                            GoldSageBottomBar3.GoldSageBottomBar(goldSageTimeline2.getCta_text(), function02, null, null, goldSageTimeline2.getCta_disclosure(), null, null, false, composer4, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54);
                                    final GoldSageTimeline goldSageTimeline3 = goldSageTimeline;
                                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierLogScreenTransitions$default, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(440350201, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageTimelineComposableKt.GoldSageTimelineComposable.1.1.2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                                            invoke(boxScope, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer4, int i9) {
                                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                            if ((i9 & 17) == 16 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(440350201, i9, -1, "com.robinhood.android.gold.sage.GoldSageTimelineComposable.<anonymous>.<anonymous>.<anonymous> (GoldSageTimelineComposable.kt:71)");
                                            }
                                            GoldSageTimelineComposable3.Content(goldSageTimeline3.getTitle(), goldSageTimeline3.getDescription_markdown(), extensions2.toPersistentList(goldSageTimeline3.getTimeline()), composer4, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), composer3, 3504, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 48, 1);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    screen4 = screen3;
                    context2 = context3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    screen4 = screen2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier4 = modifier3;
                    final Context context4 = context2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.sage.GoldSageTimelineComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return GoldSageTimelineComposable3.GoldSageTimelineComposable$lambda$0(content, onClickCta, modifier4, screen4, context4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            context2 = context;
            if ((i3 & 9363) != 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i5 == 0) {
                    }
                    if ((i2 & 8) != 0) {
                    }
                    if (i4 == 0) {
                        screen3 = screen2;
                        context3 = context2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen3, null, context3, null, null, 53, null), ComposableLambda3.rememberComposableLambda(-1053890924, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageTimelineComposableKt.GoldSageTimelineComposable.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i7) {
                            if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1053890924, i7, -1, "com.robinhood.android.gold.sage.GoldSageTimelineComposable.<anonymous> (GoldSageTimelineComposable.kt:59)");
                            }
                            final Modifier modifier42 = modifier3;
                            final GoldSageTimeline goldSageTimeline = content;
                            final Function0<Unit> function0 = onClickCta;
                            GoldSageScaffold3.GoldSageScaffold(null, ComposableLambda3.rememberComposableLambda(-97841183, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageTimelineComposableKt.GoldSageTimelineComposable.1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                    invoke(paddingValues, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PaddingValues paddingValues, Composer composer3, int i8) {
                                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                    if ((i8 & 6) == 0) {
                                        i8 |= composer3.changed(paddingValues) ? 4 : 2;
                                    }
                                    if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-97841183, i8, -1, "com.robinhood.android.gold.sage.GoldSageTimelineComposable.<anonymous>.<anonymous> (GoldSageTimelineComposable.kt:60)");
                                    }
                                    Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(PaddingKt.padding(modifier42, paddingValues), null, 1, null);
                                    final GoldSageTimeline goldSageTimeline2 = goldSageTimeline;
                                    final Function0<Unit> function02 = function0;
                                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(637334860, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageTimelineComposableKt.GoldSageTimelineComposable.1.1.1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer4, Integer num) {
                                            invoke(bentoButtonBar3, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer4, int i9) {
                                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                            if ((i9 & 17) == 16 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(637334860, i9, -1, "com.robinhood.android.gold.sage.GoldSageTimelineComposable.<anonymous>.<anonymous>.<anonymous> (GoldSageTimelineComposable.kt:62)");
                                            }
                                            GoldSageBottomBar3.GoldSageBottomBar(goldSageTimeline2.getCta_text(), function02, null, null, goldSageTimeline2.getCta_disclosure(), null, null, false, composer4, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54);
                                    final GoldSageTimeline goldSageTimeline3 = goldSageTimeline;
                                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierLogScreenTransitions$default, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(440350201, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageTimelineComposableKt.GoldSageTimelineComposable.1.1.2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                                            invoke(boxScope, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer4, int i9) {
                                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                            if ((i9 & 17) == 16 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(440350201, i9, -1, "com.robinhood.android.gold.sage.GoldSageTimelineComposable.<anonymous>.<anonymous>.<anonymous> (GoldSageTimelineComposable.kt:71)");
                                            }
                                            GoldSageTimelineComposable3.Content(goldSageTimeline3.getTitle(), goldSageTimeline3.getDescription_markdown(), extensions2.toPersistentList(goldSageTimeline3.getTimeline()), composer4, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), composer3, 3504, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 48, 1);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    screen4 = screen3;
                    context2 = context3;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        context2 = context;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Content(String str, String str2, final ImmutableList<GoldSageTimelineItem> immutableList, Composer composer, final int i) {
        final String str3;
        final String str4;
        GoldSageTimelineComposable5 goldSageTimelineComposable5;
        GoldSageTimelineComposable5 goldSageTimelineComposable52;
        Composer composerStartRestartGroup = composer.startRestartGroup(1033632699);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changed(str) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(immutableList) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1033632699, i2, -1, "com.robinhood.android.gold.sage.Content (GoldSageTimelineComposable.kt:86)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifierVerticalScroll$default, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), composerStartRestartGroup, 0, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
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
            BentoText2.m20747BentoText38GnDrw(str, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium(), composerStartRestartGroup, i2 & 14, 0, 8190);
            str3 = str;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
            str4 = str2;
            BentoMarkdownText2.BentoMarkdownText(str4, (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, (i2 >> 3) & 14, 30);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-468353869);
            int i4 = 0;
            for (GoldSageTimelineItem goldSageTimelineItem : immutableList) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                GoldSageTimelineItem goldSageTimelineItem2 = goldSageTimelineItem;
                if (i4 == 0) {
                    goldSageTimelineComposable52 = GoldSageTimelineComposable5.TOP_COMPLETE;
                } else {
                    if (i4 == 1) {
                        goldSageTimelineComposable5 = GoldSageTimelineComposable5.SECOND_INCOMPLETE;
                    } else {
                        goldSageTimelineComposable5 = i4 == CollectionsKt.getLastIndex(immutableList) ? GoldSageTimelineComposable5.BOTTOM_INCOMPLETE : GoldSageTimelineComposable5.BETWEEN_INCOMPLETE;
                    }
                    goldSageTimelineComposable52 = goldSageTimelineComposable5;
                }
                TimelineItemRow(goldSageTimelineItem2, goldSageTimelineComposable52, null, composerStartRestartGroup, 0, 4);
                i4 = i5;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            str3 = str;
            str4 = str2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.sage.GoldSageTimelineComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldSageTimelineComposable3.Content$lambda$3(str3, str4, immutableList, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void TimelineItemRow(final GoldSageTimelineItem goldSageTimelineItem, final GoldSageTimelineComposable5 goldSageTimelineComposable5, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        float fM21590getDefaultD9Ej5fM;
        float value;
        boolean zChanged;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-559450501);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(goldSageTimelineItem) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(goldSageTimelineComposable5.ordinal()) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-559450501, i3, -1, "com.robinhood.android.gold.sage.TimelineItemRow (GoldSageTimelineComposable.kt:122)");
                }
                fM21590getDefaultD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM();
                value = ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = composerStartRestartGroup.changed(fM21590getDefaultD9Ej5fM) | composerStartRestartGroup.changed(value);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new GoldSageTimelineComposable4(fM21590getDefaultD9Ej5fM, value);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoBaseRowLayout.BentoBaseRowLayout(modifier4, null, ComposableLambda3.rememberComposableLambda(-629081281, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageTimelineComposableKt.TimelineItemRow.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-629081281, i5, -1, "com.robinhood.android.gold.sage.TimelineItemRow.<anonymous> (GoldSageTimelineComposable.kt:127)");
                        }
                        GoldSageTimelineComposable3.Timeline(goldSageTimelineComposable5, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), composer3, 48, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1313311586, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageTimelineComposableKt.TimelineItemRow.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1313311586, i5, -1, "com.robinhood.android.gold.sage.TimelineItemRow.<anonymous> (GoldSageTimelineComposable.kt:133)");
                        }
                        BentoText2.m20747BentoText38GnDrw(goldSageTimelineItem.getTitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1997541891, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageTimelineComposableKt.TimelineItemRow.4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1997541891, i5, -1, "com.robinhood.android.gold.sage.TimelineItemRow.<anonymous> (GoldSageTimelineComposable.kt:136)");
                        }
                        String description_markdown = goldSageTimelineItem.getDescription_markdown();
                        BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        BentoMarkdownText2.BentoMarkdownText(description_markdown, (Modifier) null, bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer3, i6).getTextS(), 0, bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU(), bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU(), false, composer3, BentoMarkdownText.$stable << 15, 18), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 26);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, false, true, true, (MeasurePolicy) objRememberedValue, composer2, ((i3 >> 6) & 14) | 918580608, 0, 98);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.sage.GoldSageTimelineComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldSageTimelineComposable3.TimelineItemRow$lambda$5(goldSageTimelineItem, goldSageTimelineComposable5, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            fM21590getDefaultD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM();
            value = ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChanged = composerStartRestartGroup.changed(fM21590getDefaultD9Ej5fM) | composerStartRestartGroup.changed(value);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = new GoldSageTimelineComposable4(fM21590getDefaultD9Ej5fM, value);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoBaseRowLayout.BentoBaseRowLayout(modifier4, null, ComposableLambda3.rememberComposableLambda(-629081281, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageTimelineComposableKt.TimelineItemRow.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-629081281, i5, -1, "com.robinhood.android.gold.sage.TimelineItemRow.<anonymous> (GoldSageTimelineComposable.kt:127)");
                        }
                        GoldSageTimelineComposable3.Timeline(goldSageTimelineComposable5, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), composer3, 48, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1313311586, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageTimelineComposableKt.TimelineItemRow.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1313311586, i5, -1, "com.robinhood.android.gold.sage.TimelineItemRow.<anonymous> (GoldSageTimelineComposable.kt:133)");
                        }
                        BentoText2.m20747BentoText38GnDrw(goldSageTimelineItem.getTitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1997541891, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageTimelineComposableKt.TimelineItemRow.4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1997541891, i5, -1, "com.robinhood.android.gold.sage.TimelineItemRow.<anonymous> (GoldSageTimelineComposable.kt:136)");
                        }
                        String description_markdown = goldSageTimelineItem.getDescription_markdown();
                        BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        BentoMarkdownText2.BentoMarkdownText(description_markdown, (Modifier) null, bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer3, i6).getTextS(), 0, bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU(), bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU(), false, composer3, BentoMarkdownText.$stable << 15, 18), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 26);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, false, true, true, (MeasurePolicy) objRememberedValue, composer2, ((i3 >> 6) & 14) | 918580608, 0, 98);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0176  */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.ui.graphics.Brush] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Timeline(final GoldSageTimelineComposable5 goldSageTimelineComposable5, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        SolidColor solidColor;
        int i5;
        int i6;
        long j;
        int i7;
        float f;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(957413758);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(goldSageTimelineComposable5.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                Modifier modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(957413758, i3, -1, "com.robinhood.android.gold.sage.Timeline (GoldSageTimelineComposable.kt:179)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i9 = BentoTheme.$stable;
                long solLight = bentoTheme.getColors(composerStartRestartGroup, i9).getSolLight();
                long jM21373getBg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i9).m21373getBg30d7_KjU();
                SolidColor solidColor2 = new SolidColor(Color.INSTANCE.m6725getTransparent0d7_KjU(), null);
                SolidColor solidColor3 = new SolidColor(solLight, null);
                ?? M6682verticalGradient8A3gB4$default = Brush.Companion.m6682verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(solLight), Color.m6701boximpl(jM21373getBg30d7_KjU)}), 0.0f, 0.0f, 0, 14, (Object) null);
                SolidColor solidColor4 = new SolidColor(jM21373getBg30d7_KjU, null);
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                i4 = iArr[goldSageTimelineComposable5.ordinal()];
                SolidColor solidColor5 = solidColor4;
                if (i4 != 1) {
                    solidColor = solidColor2;
                } else if (i4 == 2) {
                    solidColor = M6682verticalGradient8A3gB4$default;
                } else {
                    if (i4 != 3 && i4 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    solidColor = solidColor5;
                }
                i5 = iArr[goldSageTimelineComposable5.ordinal()];
                SolidColor solidColor6 = solidColor;
                if (i5 != 1) {
                    solidColor5 = solidColor3;
                } else if (i5 != 2 && i5 != 3) {
                    if (i5 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    solidColor5 = solidColor2;
                }
                i6 = iArr[goldSageTimelineComposable5.ordinal()];
                if (i6 != 1) {
                    j = solLight;
                } else {
                    if (i6 != 2 && i6 != 3 && i6 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j = jM21373getBg30d7_KjU;
                }
                i7 = iArr[goldSageTimelineComposable5.ordinal()];
                if (i7 != 1) {
                    f = completeOuterDotSize;
                } else {
                    if (i7 != 2 && i7 != 3 && i7 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f = incompleteDotSize;
                }
                float f2 = f;
                Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(modifier3, columnWidth);
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5174width3ABfNKs);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifier4 = modifier3;
                Modifier modifierBackground$default = Background3.background$default(companion3, solidColor6, RectangleShape2.getRectangleShape(), 0.0f, 4, null);
                float f3 = connectorWidth;
                BoxKt.Box(Column5.weight$default(column6, SizeKt.m5174width3ABfNKs(modifierBackground$default, f3), 1.0f, false, 2, null), composerStartRestartGroup, 0);
                Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(Background3.m4871backgroundbw27NRU(companion3, j, RoundedCornerShape2.getCircleShape()), f2);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5169size3ABfNKs);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(1550219822);
                if (goldSageTimelineComposable5 == GoldSageTimelineComposable5.TOP_COMPLETE) {
                    BoxKt.Box(SizeKt.m5169size3ABfNKs(Background3.m4871backgroundbw27NRU(companion3, bentoTheme.getColors(composerStartRestartGroup, i9).getNova(), RoundedCornerShape2.getCircleShape()), completeInnerDotSize), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                BoxKt.Box(Column5.weight$default(column6, SizeKt.m5174width3ABfNKs(Background3.background$default(companion3, solidColor5, RectangleShape2.getRectangleShape(), 0.0f, 4, null), f3), 1.0f, false, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.sage.GoldSageTimelineComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldSageTimelineComposable3.Timeline$lambda$8(goldSageTimelineComposable5, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            if (i8 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i92 = BentoTheme.$stable;
            long solLight2 = bentoTheme2.getColors(composerStartRestartGroup, i92).getSolLight();
            long jM21373getBg30d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i92).m21373getBg30d7_KjU();
            SolidColor solidColor22 = new SolidColor(Color.INSTANCE.m6725getTransparent0d7_KjU(), null);
            SolidColor solidColor32 = new SolidColor(solLight2, null);
            ?? M6682verticalGradient8A3gB4$default2 = Brush.Companion.m6682verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(solLight2), Color.m6701boximpl(jM21373getBg30d7_KjU2)}), 0.0f, 0.0f, 0, 14, (Object) null);
            SolidColor solidColor42 = new SolidColor(jM21373getBg30d7_KjU2, null);
            int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
            i4 = iArr2[goldSageTimelineComposable5.ordinal()];
            SolidColor solidColor52 = solidColor42;
            if (i4 != 1) {
            }
            i5 = iArr2[goldSageTimelineComposable5.ordinal()];
            SolidColor solidColor62 = solidColor;
            if (i5 != 1) {
            }
            i6 = iArr2[goldSageTimelineComposable5.ordinal()];
            if (i6 != 1) {
            }
            i7 = iArr2[goldSageTimelineComposable5.ordinal()];
            if (i7 != 1) {
            }
            float f22 = f;
            Modifier modifierM5174width3ABfNKs2 = SizeKt.m5174width3ABfNKs(modifier3, columnWidth);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion4.getCenterHorizontally(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5174width3ABfNKs2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifier42 = modifier3;
                Modifier modifierBackground$default2 = Background3.background$default(companion32, solidColor62, RectangleShape2.getRectangleShape(), 0.0f, 4, null);
                float f32 = connectorWidth;
                BoxKt.Box(Column5.weight$default(column62, SizeKt.m5174width3ABfNKs(modifierBackground$default2, f32), 1.0f, false, 2, null), composerStartRestartGroup, 0);
                Modifier modifierM5169size3ABfNKs2 = SizeKt.m5169size3ABfNKs(Background3.m4871backgroundbw27NRU(companion32, j, RoundedCornerShape2.getCircleShape()), f22);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5169size3ABfNKs2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1550219822);
                    if (goldSageTimelineComposable5 == GoldSageTimelineComposable5.TOP_COMPLETE) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    BoxKt.Box(Column5.weight$default(column62, SizeKt.m5174width3ABfNKs(Background3.background$default(companion32, solidColor52, RectangleShape2.getRectangleShape(), 0.0f, 4, null), f32), 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier42;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void ContentPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1321107555);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1321107555, i, -1, "com.robinhood.android.gold.sage.ContentPreview (GoldSageTimelineComposable.kt:275)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, GoldSageTimelineComposable.INSTANCE.getLambda$142836251$feature_gold_sage_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.sage.GoldSageTimelineComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldSageTimelineComposable3.ContentPreview$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
