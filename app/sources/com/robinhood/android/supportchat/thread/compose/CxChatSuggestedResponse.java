package com.robinhood.android.supportchat.thread.compose;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CxChatSuggestedResponse.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/ChatbotChip;", "", "<init>", "()V", "Colors", "StatefulColors", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.supportchat.thread.compose.ChatbotChip, reason: use source file name */
/* loaded from: classes9.dex */
final class CxChatSuggestedResponse {
    public static final CxChatSuggestedResponse INSTANCE = new CxChatSuggestedResponse();

    private CxChatSuggestedResponse() {
    }

    /* compiled from: CxChatSuggestedResponse.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000bJ\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u000bJ\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u000bJB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0007\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000b¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/ChatbotChip$Colors;", "", "foreground", "Landroidx/compose/ui/graphics/Color;", "outline", "background", "countBackground", "countOutline", "<init>", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getForeground-0d7_KjU", "()J", "J", "getOutline-0d7_KjU", "getBackground-0d7_KjU", "getCountBackground-0d7_KjU", "getCountOutline-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "component5", "component5-0d7_KjU", "copy", "copy-t635Npw", "(JJJJJ)Lcom/robinhood/android/supportchat/thread/compose/ChatbotChip$Colors;", "equals", "", "other", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.supportchat.thread.compose.ChatbotChip$Colors, reason: from toString */
    public static final /* data */ class Colors {
        public static final int $stable = 0;
        private final long background;
        private final long countBackground;
        private final long countOutline;
        private final long foreground;
        private final long outline;

        public /* synthetic */ Colors(long j, long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, j3, j4, j5);
        }

        /* renamed from: copy-t635Npw$default, reason: not valid java name */
        public static /* synthetic */ Colors m19142copyt635Npw$default(Colors colors, long j, long j2, long j3, long j4, long j5, int i, Object obj) {
            if ((i & 1) != 0) {
                j = colors.foreground;
            }
            long j6 = j;
            if ((i & 2) != 0) {
                j2 = colors.outline;
            }
            return colors.m19148copyt635Npw(j6, j2, (i & 4) != 0 ? colors.background : j3, (i & 8) != 0 ? colors.countBackground : j4, (i & 16) != 0 ? colors.countOutline : j5);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getForeground() {
            return this.foreground;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getOutline() {
            return this.outline;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getBackground() {
            return this.background;
        }

        /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
        public final long getCountBackground() {
            return this.countBackground;
        }

        /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
        public final long getCountOutline() {
            return this.countOutline;
        }

        /* renamed from: copy-t635Npw, reason: not valid java name */
        public final Colors m19148copyt635Npw(long foreground, long outline, long background, long countBackground, long countOutline) {
            return new Colors(foreground, outline, background, countBackground, countOutline, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Colors)) {
                return false;
            }
            Colors colors = (Colors) other;
            return Color.m6707equalsimpl0(this.foreground, colors.foreground) && Color.m6707equalsimpl0(this.outline, colors.outline) && Color.m6707equalsimpl0(this.background, colors.background) && Color.m6707equalsimpl0(this.countBackground, colors.countBackground) && Color.m6707equalsimpl0(this.countOutline, colors.countOutline);
        }

        public int hashCode() {
            return (((((((Color.m6713hashCodeimpl(this.foreground) * 31) + Color.m6713hashCodeimpl(this.outline)) * 31) + Color.m6713hashCodeimpl(this.background)) * 31) + Color.m6713hashCodeimpl(this.countBackground)) * 31) + Color.m6713hashCodeimpl(this.countOutline);
        }

        public String toString() {
            return "Colors(foreground=" + Color.m6714toStringimpl(this.foreground) + ", outline=" + Color.m6714toStringimpl(this.outline) + ", background=" + Color.m6714toStringimpl(this.background) + ", countBackground=" + Color.m6714toStringimpl(this.countBackground) + ", countOutline=" + Color.m6714toStringimpl(this.countOutline) + ")";
        }

        private Colors(long j, long j2, long j3, long j4, long j5) {
            this.foreground = j;
            this.outline = j2;
            this.background = j3;
            this.countBackground = j4;
            this.countOutline = j5;
        }

        /* renamed from: getForeground-0d7_KjU, reason: not valid java name */
        public final long m19152getForeground0d7_KjU() {
            return this.foreground;
        }

        /* renamed from: getOutline-0d7_KjU, reason: not valid java name */
        public final long m19153getOutline0d7_KjU() {
            return this.outline;
        }

        /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
        public final long m19149getBackground0d7_KjU() {
            return this.background;
        }

        /* renamed from: getCountBackground-0d7_KjU, reason: not valid java name */
        public final long m19150getCountBackground0d7_KjU() {
            return this.countBackground;
        }

        /* renamed from: getCountOutline-0d7_KjU, reason: not valid java name */
        public final long m19151getCountOutline0d7_KjU() {
            return this.countOutline;
        }
    }

    /* compiled from: CxChatSuggestedResponse.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u001b\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/compose/ChatbotChip$StatefulColors;", "", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "Lcom/robinhood/android/supportchat/thread/compose/ChatbotChip$Colors;", "pressed", "disabled", "<init>", "(Lcom/robinhood/android/supportchat/thread/compose/ChatbotChip$Colors;Lcom/robinhood/android/supportchat/thread/compose/ChatbotChip$Colors;Lcom/robinhood/android/supportchat/thread/compose/ChatbotChip$Colors;)V", "getDefault", "()Lcom/robinhood/android/supportchat/thread/compose/ChatbotChip$Colors;", "getPressed", "getDisabled", "outlineColor", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "state", "Lcom/robinhood/android/supportchat/thread/compose/State;", "(Lcom/robinhood/android/supportchat/thread/compose/State;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "backgroundColor", "foregroundColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.supportchat.thread.compose.ChatbotChip$StatefulColors, reason: from toString */
    public static final /* data */ class StatefulColors {
        public static final int $stable = 0;
        private final Colors default;
        private final Colors disabled;
        private final Colors pressed;

        /* compiled from: CxChatSuggestedResponse.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.supportchat.thread.compose.ChatbotChip$StatefulColors$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CxChatSuggestedResponse4.values().length];
                try {
                    iArr[CxChatSuggestedResponse4.Default.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CxChatSuggestedResponse4.Pressed.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CxChatSuggestedResponse4.Disabled.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ StatefulColors copy$default(StatefulColors statefulColors, Colors colors, Colors colors2, Colors colors3, int i, Object obj) {
            if ((i & 1) != 0) {
                colors = statefulColors.default;
            }
            if ((i & 2) != 0) {
                colors2 = statefulColors.pressed;
            }
            if ((i & 4) != 0) {
                colors3 = statefulColors.disabled;
            }
            return statefulColors.copy(colors, colors2, colors3);
        }

        /* renamed from: component1, reason: from getter */
        public final Colors getDefault() {
            return this.default;
        }

        /* renamed from: component2, reason: from getter */
        public final Colors getPressed() {
            return this.pressed;
        }

        /* renamed from: component3, reason: from getter */
        public final Colors getDisabled() {
            return this.disabled;
        }

        public final StatefulColors copy(Colors colors, Colors pressed, Colors disabled) {
            Intrinsics.checkNotNullParameter(colors, "default");
            Intrinsics.checkNotNullParameter(pressed, "pressed");
            Intrinsics.checkNotNullParameter(disabled, "disabled");
            return new StatefulColors(colors, pressed, disabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StatefulColors)) {
                return false;
            }
            StatefulColors statefulColors = (StatefulColors) other;
            return Intrinsics.areEqual(this.default, statefulColors.default) && Intrinsics.areEqual(this.pressed, statefulColors.pressed) && Intrinsics.areEqual(this.disabled, statefulColors.disabled);
        }

        public int hashCode() {
            return (((this.default.hashCode() * 31) + this.pressed.hashCode()) * 31) + this.disabled.hashCode();
        }

        public String toString() {
            return "StatefulColors(default=" + this.default + ", pressed=" + this.pressed + ", disabled=" + this.disabled + ")";
        }

        public StatefulColors(Colors colors, Colors pressed, Colors disabled) {
            Intrinsics.checkNotNullParameter(colors, "default");
            Intrinsics.checkNotNullParameter(pressed, "pressed");
            Intrinsics.checkNotNullParameter(disabled, "disabled");
            this.default = colors;
            this.pressed = pressed;
            this.disabled = disabled;
        }

        public final Colors getDefault() {
            return this.default;
        }

        public final Colors getPressed() {
            return this.pressed;
        }

        public final Colors getDisabled() {
            return this.disabled;
        }

        public final SnapshotState4<Color> outlineColor(CxChatSuggestedResponse4 state, Composer composer, int i) {
            long jM19153getOutline0d7_KjU;
            Intrinsics.checkNotNullParameter(state, "state");
            composer.startReplaceGroup(-798843580);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-798843580, i, -1, "com.robinhood.android.supportchat.thread.compose.ChatbotChip.StatefulColors.outlineColor (CxChatSuggestedResponse.kt:171)");
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i2 == 1) {
                jM19153getOutline0d7_KjU = this.default.m19153getOutline0d7_KjU();
            } else if (i2 == 2) {
                jM19153getOutline0d7_KjU = this.pressed.m19153getOutline0d7_KjU();
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                jM19153getOutline0d7_KjU = this.disabled.m19153getOutline0d7_KjU();
            }
            SnapshotState4<Color> snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m6701boximpl(jM19153getOutline0d7_KjU), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return snapshotState4RememberUpdatedState;
        }

        public final SnapshotState4<Color> backgroundColor(CxChatSuggestedResponse4 state, Composer composer, int i) {
            long jM19149getBackground0d7_KjU;
            Intrinsics.checkNotNullParameter(state, "state");
            composer.startReplaceGroup(74169852);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(74169852, i, -1, "com.robinhood.android.supportchat.thread.compose.ChatbotChip.StatefulColors.backgroundColor (CxChatSuggestedResponse.kt:182)");
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i2 == 1) {
                jM19149getBackground0d7_KjU = this.default.m19149getBackground0d7_KjU();
            } else if (i2 == 2) {
                jM19149getBackground0d7_KjU = this.pressed.m19149getBackground0d7_KjU();
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                jM19149getBackground0d7_KjU = this.disabled.m19149getBackground0d7_KjU();
            }
            SnapshotState4<Color> snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m6701boximpl(jM19149getBackground0d7_KjU), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return snapshotState4RememberUpdatedState;
        }

        public final SnapshotState4<Color> foregroundColor(CxChatSuggestedResponse4 state, Composer composer, int i) {
            long jM19152getForeground0d7_KjU;
            Intrinsics.checkNotNullParameter(state, "state");
            composer.startReplaceGroup(193070087);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(193070087, i, -1, "com.robinhood.android.supportchat.thread.compose.ChatbotChip.StatefulColors.foregroundColor (CxChatSuggestedResponse.kt:193)");
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i2 == 1) {
                jM19152getForeground0d7_KjU = this.default.m19152getForeground0d7_KjU();
            } else if (i2 == 2) {
                jM19152getForeground0d7_KjU = this.pressed.m19152getForeground0d7_KjU();
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                jM19152getForeground0d7_KjU = this.disabled.m19152getForeground0d7_KjU();
            }
            SnapshotState4<Color> snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m6701boximpl(jM19152getForeground0d7_KjU), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return snapshotState4RememberUpdatedState;
        }
    }
}
