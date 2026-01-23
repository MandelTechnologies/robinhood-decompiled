package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BracketMatchOverviewCard.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001+B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003JG\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u001b\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/ui/BracketGameSeedData;", "", "displayId", "", "name", "percentageDisplay", "lightThemeColor", "darkThemeColor", "score", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayId", "()Ljava/lang/String;", "getName", "getPercentageDisplay", "getLightThemeColor", "getDarkThemeColor", "getScore", "lightColor", "Landroidx/compose/ui/graphics/Color;", "getLightColor-0d7_KjU", "()J", "lightColor$delegate", "Lkotlin/Lazy;", "darkColor", "getDarkColor-0d7_KjU", "darkColor$delegate", "colorInBorder", "getColorInBorder", "(Landroidx/compose/runtime/Composer;I)J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BracketGameSeedData {
    public static final int $stable = 0;
    private static final float GRADIENT_BORDER_ALPHA = 0.8f;

    /* renamed from: darkColor$delegate, reason: from kotlin metadata */
    private final Lazy darkColor;
    private final String darkThemeColor;
    private final String displayId;

    /* renamed from: lightColor$delegate, reason: from kotlin metadata */
    private final Lazy lightColor;
    private final String lightThemeColor;
    private final String name;
    private final String percentageDisplay;
    private final String score;

    public static /* synthetic */ BracketGameSeedData copy$default(BracketGameSeedData bracketGameSeedData, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bracketGameSeedData.displayId;
        }
        if ((i & 2) != 0) {
            str2 = bracketGameSeedData.name;
        }
        if ((i & 4) != 0) {
            str3 = bracketGameSeedData.percentageDisplay;
        }
        if ((i & 8) != 0) {
            str4 = bracketGameSeedData.lightThemeColor;
        }
        if ((i & 16) != 0) {
            str5 = bracketGameSeedData.darkThemeColor;
        }
        if ((i & 32) != 0) {
            str6 = bracketGameSeedData.score;
        }
        String str7 = str5;
        String str8 = str6;
        return bracketGameSeedData.copy(str, str2, str3, str4, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDisplayId() {
        return this.displayId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPercentageDisplay() {
        return this.percentageDisplay;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLightThemeColor() {
        return this.lightThemeColor;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDarkThemeColor() {
        return this.darkThemeColor;
    }

    /* renamed from: component6, reason: from getter */
    public final String getScore() {
        return this.score;
    }

    public final BracketGameSeedData copy(String displayId, String name, String percentageDisplay, String lightThemeColor, String darkThemeColor, String score) {
        Intrinsics.checkNotNullParameter(displayId, "displayId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(percentageDisplay, "percentageDisplay");
        Intrinsics.checkNotNullParameter(lightThemeColor, "lightThemeColor");
        Intrinsics.checkNotNullParameter(darkThemeColor, "darkThemeColor");
        return new BracketGameSeedData(displayId, name, percentageDisplay, lightThemeColor, darkThemeColor, score);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BracketGameSeedData)) {
            return false;
        }
        BracketGameSeedData bracketGameSeedData = (BracketGameSeedData) other;
        return Intrinsics.areEqual(this.displayId, bracketGameSeedData.displayId) && Intrinsics.areEqual(this.name, bracketGameSeedData.name) && Intrinsics.areEqual(this.percentageDisplay, bracketGameSeedData.percentageDisplay) && Intrinsics.areEqual(this.lightThemeColor, bracketGameSeedData.lightThemeColor) && Intrinsics.areEqual(this.darkThemeColor, bracketGameSeedData.darkThemeColor) && Intrinsics.areEqual(this.score, bracketGameSeedData.score);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.displayId.hashCode() * 31) + this.name.hashCode()) * 31) + this.percentageDisplay.hashCode()) * 31) + this.lightThemeColor.hashCode()) * 31) + this.darkThemeColor.hashCode()) * 31;
        String str = this.score;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BracketGameSeedData(displayId=" + this.displayId + ", name=" + this.name + ", percentageDisplay=" + this.percentageDisplay + ", lightThemeColor=" + this.lightThemeColor + ", darkThemeColor=" + this.darkThemeColor + ", score=" + this.score + ")";
    }

    public BracketGameSeedData(String displayId, String name, String percentageDisplay, String lightThemeColor, String darkThemeColor, String str) {
        Intrinsics.checkNotNullParameter(displayId, "displayId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(percentageDisplay, "percentageDisplay");
        Intrinsics.checkNotNullParameter(lightThemeColor, "lightThemeColor");
        Intrinsics.checkNotNullParameter(darkThemeColor, "darkThemeColor");
        this.displayId = displayId;
        this.name = name;
        this.percentageDisplay = percentageDisplay;
        this.lightThemeColor = lightThemeColor;
        this.darkThemeColor = darkThemeColor;
        this.score = str;
        this.lightColor = LazyKt.lazy(new Function0<Color>() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketGameSeedData$lightColor$2
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Color invoke() {
                return Color.m6701boximpl(m14625invoke0d7_KjU());
            }

            /* renamed from: invoke-0d7_KjU, reason: not valid java name */
            public final long m14625invoke0d7_KjU() {
                return Color2.Color(android.graphics.Color.parseColor(this.this$0.getLightThemeColor()));
            }
        });
        this.darkColor = LazyKt.lazy(new Function0<Color>() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketGameSeedData$darkColor$2
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Color invoke() {
                return Color.m6701boximpl(m14624invoke0d7_KjU());
            }

            /* renamed from: invoke-0d7_KjU, reason: not valid java name */
            public final long m14624invoke0d7_KjU() {
                return Color2.Color(android.graphics.Color.parseColor(this.this$0.getDarkThemeColor()));
            }
        });
    }

    public /* synthetic */ BracketGameSeedData(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : str6);
    }

    public final String getDisplayId() {
        return this.displayId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPercentageDisplay() {
        return this.percentageDisplay;
    }

    public final String getLightThemeColor() {
        return this.lightThemeColor;
    }

    public final String getDarkThemeColor() {
        return this.darkThemeColor;
    }

    public final String getScore() {
        return this.score;
    }

    /* renamed from: getLightColor-0d7_KjU, reason: not valid java name */
    private final long m14623getLightColor0d7_KjU() {
        return ((Color) this.lightColor.getValue()).getValue();
    }

    /* renamed from: getDarkColor-0d7_KjU, reason: not valid java name */
    private final long m14622getDarkColor0d7_KjU() {
        return ((Color) this.darkColor.getValue()).getValue();
    }

    @JvmName
    public final long getColorInBorder(Composer composer, int i) {
        long jM6705copywmQWz5c$default;
        composer.startReplaceGroup(-804841690);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-804841690, i, -1, "com.robinhood.android.futures.eventbrackets.ui.BracketGameSeedData.<get-colorInBorder> (BracketMatchOverviewCard.kt:149)");
        }
        if (BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getIsDay()) {
            jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(m14623getLightColor0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(m14622getDarkColor0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM6705copywmQWz5c$default;
    }
}
