package com.robinhood.rhc.referral.p367ui;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.painter.Painter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.compose.bento.component.BentoIcon4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardCardComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010\u0016J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003JT\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u00020\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006,"}, m3636d2 = {"Lcom/robinhood/rhc/referral/ui/RewardCardComposableState;", "", "title", "", "subtitle", PlaceTypes.PAINTER, "Landroidx/compose/ui/graphics/painter/Painter;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "onClick", "Lkotlin/Function0;", "", "enabled", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/painter/Painter;JLkotlin/jvm/functions/Function0;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "getBackgroundColor-0d7_KjU", "()J", "J", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "getEnabled", "()Z", "component1", "component2", "component3", "component4", "component4-0d7_KjU", "component5", "component6", "copy", "copy-Bx497Mc", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/painter/Painter;JLkotlin/jvm/functions/Function0;Z)Lcom/robinhood/rhc/referral/ui/RewardCardComposableState;", "equals", "other", "hashCode", "", "toString", "Action", "lib-referral-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class RewardCardComposableState {
    public static final int $stable = 8;
    private final long backgroundColor;
    private final boolean enabled;
    private final Function0<Unit> onClick;
    private final Painter painter;
    private final String subtitle;
    private final String title;

    public /* synthetic */ RewardCardComposableState(String str, String str2, Painter painter, long j, Function0 function0, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, painter, j, function0, z);
    }

    /* renamed from: copy-Bx497Mc$default, reason: not valid java name */
    public static /* synthetic */ RewardCardComposableState m23875copyBx497Mc$default(RewardCardComposableState rewardCardComposableState, String str, String str2, Painter painter, long j, Function0 function0, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardCardComposableState.title;
        }
        if ((i & 2) != 0) {
            str2 = rewardCardComposableState.subtitle;
        }
        if ((i & 4) != 0) {
            painter = rewardCardComposableState.painter;
        }
        if ((i & 8) != 0) {
            j = rewardCardComposableState.backgroundColor;
        }
        if ((i & 16) != 0) {
            function0 = rewardCardComposableState.onClick;
        }
        if ((i & 32) != 0) {
            z = rewardCardComposableState.enabled;
        }
        long j2 = j;
        Painter painter2 = painter;
        return rewardCardComposableState.m23877copyBx497Mc(str, str2, painter2, j2, function0, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final Painter getPainter() {
        return this.painter;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Function0<Unit> component5() {
        return this.onClick;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: copy-Bx497Mc, reason: not valid java name */
    public final RewardCardComposableState m23877copyBx497Mc(String title, String subtitle, Painter painter, long backgroundColor, Function0<Unit> onClick, boolean enabled) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(painter, "painter");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return new RewardCardComposableState(title, subtitle, painter, backgroundColor, onClick, enabled, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardCardComposableState)) {
            return false;
        }
        RewardCardComposableState rewardCardComposableState = (RewardCardComposableState) other;
        return Intrinsics.areEqual(this.title, rewardCardComposableState.title) && Intrinsics.areEqual(this.subtitle, rewardCardComposableState.subtitle) && Intrinsics.areEqual(this.painter, rewardCardComposableState.painter) && Color.m6707equalsimpl0(this.backgroundColor, rewardCardComposableState.backgroundColor) && Intrinsics.areEqual(this.onClick, rewardCardComposableState.onClick) && this.enabled == rewardCardComposableState.enabled;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.painter.hashCode()) * 31) + Color.m6713hashCodeimpl(this.backgroundColor)) * 31) + this.onClick.hashCode()) * 31) + Boolean.hashCode(this.enabled);
    }

    public String toString() {
        return "RewardCardComposableState(title=" + this.title + ", subtitle=" + this.subtitle + ", painter=" + this.painter + ", backgroundColor=" + Color.m6714toStringimpl(this.backgroundColor) + ", onClick=" + this.onClick + ", enabled=" + this.enabled + ")";
    }

    private RewardCardComposableState(String title, String str, Painter painter, long j, Function0<Unit> onClick, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(painter, "painter");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.title = title;
        this.subtitle = str;
        this.painter = painter;
        this.backgroundColor = j;
        this.onClick = onClick;
        this.enabled = z;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final Painter getPainter() {
        return this.painter;
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m23878getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    public /* synthetic */ RewardCardComposableState(String str, String str2, Painter painter, long j, Function0 function0, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, painter, j, (i & 16) != 0 ? new Function0() { // from class: com.robinhood.rhc.referral.ui.RewardCardComposableState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : function0, (i & 32) != 0 ? true : z, null);
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    /* compiled from: RewardCardComposable.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rhc/referral/ui/RewardCardComposableState$Action;", "", "Icon", "Cta", "Lcom/robinhood/rhc/referral/ui/RewardCardComposableState$Action$Cta;", "Lcom/robinhood/rhc/referral/ui/RewardCardComposableState$Action$Icon;", "lib-referral-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Action {

        /* compiled from: RewardCardComposable.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rhc/referral/ui/RewardCardComposableState$Action$Icon;", "Lcom/robinhood/rhc/referral/ui/RewardCardComposableState$Action;", "icon", "Lcom/robinhood/compose/bento/component/BentoIcons;", "<init>", "(Lcom/robinhood/compose/bento/component/BentoIcons;)V", "getIcon", "()Lcom/robinhood/compose/bento/component/BentoIcons;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-referral-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Icon implements Action {
            public static final int $stable = BentoIcon4.$stable;
            private final BentoIcon4 icon;

            public static /* synthetic */ Icon copy$default(Icon icon, BentoIcon4 bentoIcon4, int i, Object obj) {
                if ((i & 1) != 0) {
                    bentoIcon4 = icon.icon;
                }
                return icon.copy(bentoIcon4);
            }

            /* renamed from: component1, reason: from getter */
            public final BentoIcon4 getIcon() {
                return this.icon;
            }

            public final Icon copy(BentoIcon4 icon) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                return new Icon(icon);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Icon) && Intrinsics.areEqual(this.icon, ((Icon) other).icon);
            }

            public int hashCode() {
                return this.icon.hashCode();
            }

            public String toString() {
                return "Icon(icon=" + this.icon + ")";
            }

            public Icon(BentoIcon4 icon) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                this.icon = icon;
            }

            public final BentoIcon4 getIcon() {
                return this.icon;
            }
        }

        /* compiled from: RewardCardComposable.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rhc/referral/ui/RewardCardComposableState$Action$Cta;", "Lcom/robinhood/rhc/referral/ui/RewardCardComposableState$Action;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-referral-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Cta implements Action {
            public static final int $stable = 0;
            private final String text;

            public static /* synthetic */ Cta copy$default(Cta cta, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = cta.text;
                }
                return cta.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public final Cta copy(String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new Cta(text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Cta) && Intrinsics.areEqual(this.text, ((Cta) other).text);
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            public String toString() {
                return "Cta(text=" + this.text + ")";
            }

            public Cta(String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
            }

            public final String getText() {
                return this.text;
            }
        }
    }
}
