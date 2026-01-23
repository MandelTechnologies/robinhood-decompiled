package com.robinhood.compose.bento.component.cards;

import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.style.CommunicationCardStyle;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoCommunicationCard.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/cards/BentoCommunicationCards;", "", "<init>", "()V", ResourceTypes.STYLE, "Lcom/robinhood/compose/theme/style/CommunicationCardStyle;", "getStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/CommunicationCardStyle;", "Type", "DismissIconType", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.cards.BentoCommunicationCards, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoCommunicationCard7 {
    public static final int $stable = 0;
    public static final BentoCommunicationCard7 INSTANCE = new BentoCommunicationCard7();

    private BentoCommunicationCard7() {
    }

    @JvmName
    public final CommunicationCardStyle getStyle(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(390465812, i, -1, "com.robinhood.compose.bento.component.cards.BentoCommunicationCards.<get-style> (BentoCommunicationCard.kt:173)");
        }
        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        DefaultConstructorMarker defaultConstructorMarker = null;
        CommunicationCardStyle communicationCardStyle = new CommunicationCardStyle(BorderStroke2.m4886BorderStrokecXLIe8U(fM7995constructorimpl, bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU()), new CommunicationCardStyle.Colors(bentoTheme.getColors(composer, 6).m21371getBg0d7_KjU(), Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer, 6).getJet(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer, 6).getNova(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8)), new CommunicationCardStyle.Sizing(C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE), C2002Dp.m7995constructorimpl(40), defaultConstructorMarker), new CommunicationCardStyle.Spacing(bentoTheme.getSpacing(composer, 6).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, 6).m21593getSmallD9Ej5fM(), defaultConstructorMarker), new CommunicationCardStyle.Typography(bentoTheme.getTypography(composer, 6).getTextL(), bentoTheme.getTypography(composer, 6).getDisplayNibSmall(), 4));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return communicationCardStyle;
    }

    /* compiled from: BentoCommunicationCard.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/cards/BentoCommunicationCards$Type;", "", "<init>", "()V", "Standard", "BrandMoment", "Lcom/robinhood/compose/bento/component/cards/BentoCommunicationCards$Type$BrandMoment;", "Lcom/robinhood/compose/bento/component/cards/BentoCommunicationCards$Type$Standard;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.cards.BentoCommunicationCards$Type */
    public static abstract class Type {
        public static final int $stable = 0;

        public /* synthetic */ Type(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Type() {
        }

        /* compiled from: BentoCommunicationCard.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/cards/BentoCommunicationCards$Type$Standard;", "Lcom/robinhood/compose/bento/component/cards/BentoCommunicationCards$Type;", "<init>", "()V", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.compose.bento.component.cards.BentoCommunicationCards$Type$Standard */
        public static final class Standard extends Type {
            public static final int $stable = 0;
            public static final Standard INSTANCE = new Standard();

            private Standard() {
                super(null);
            }
        }

        /* compiled from: BentoCommunicationCard.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/cards/BentoCommunicationCards$Type$BrandMoment;", "Lcom/robinhood/compose/bento/component/cards/BentoCommunicationCards$Type;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "textColor", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackgroundColor-0d7_KjU", "()J", "J", "getTextColor-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "copy", "copy--OWjLjI", "(JJ)Lcom/robinhood/compose/bento/component/cards/BentoCommunicationCards$Type$BrandMoment;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.compose.bento.component.cards.BentoCommunicationCards$Type$BrandMoment, reason: from toString */
        public static final /* data */ class BrandMoment extends Type {
            public static final int $stable = 0;
            private final long backgroundColor;
            private final long textColor;

            public /* synthetic */ BrandMoment(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
                this(j, j2);
            }

            /* renamed from: copy--OWjLjI$default, reason: not valid java name */
            public static /* synthetic */ BrandMoment m20874copyOWjLjI$default(BrandMoment brandMoment, long j, long j2, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = brandMoment.backgroundColor;
                }
                if ((i & 2) != 0) {
                    j2 = brandMoment.textColor;
                }
                return brandMoment.m20877copyOWjLjI(j, j2);
            }

            /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
            public final long getBackgroundColor() {
                return this.backgroundColor;
            }

            /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
            public final long getTextColor() {
                return this.textColor;
            }

            /* renamed from: copy--OWjLjI, reason: not valid java name */
            public final BrandMoment m20877copyOWjLjI(long backgroundColor, long textColor) {
                return new BrandMoment(backgroundColor, textColor, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BrandMoment)) {
                    return false;
                }
                BrandMoment brandMoment = (BrandMoment) other;
                return Color.m6707equalsimpl0(this.backgroundColor, brandMoment.backgroundColor) && Color.m6707equalsimpl0(this.textColor, brandMoment.textColor);
            }

            public int hashCode() {
                return (Color.m6713hashCodeimpl(this.backgroundColor) * 31) + Color.m6713hashCodeimpl(this.textColor);
            }

            public String toString() {
                return "BrandMoment(backgroundColor=" + Color.m6714toStringimpl(this.backgroundColor) + ", textColor=" + Color.m6714toStringimpl(this.textColor) + ")";
            }

            /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
            public final long m20878getBackgroundColor0d7_KjU() {
                return this.backgroundColor;
            }

            /* renamed from: getTextColor-0d7_KjU, reason: not valid java name */
            public final long m20879getTextColor0d7_KjU() {
                return this.textColor;
            }

            private BrandMoment(long j, long j2) {
                super(null);
                this.backgroundColor = j;
                this.textColor = j2;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BentoCommunicationCard.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/cards/BentoCommunicationCards$DismissIconType;", "", "<init>", "(Ljava/lang/String;I)V", "Dark", "Light", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.cards.BentoCommunicationCards$DismissIconType */
    public static final class DismissIconType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DismissIconType[] $VALUES;
        public static final DismissIconType Dark = new DismissIconType("Dark", 0);
        public static final DismissIconType Light = new DismissIconType("Light", 1);

        private static final /* synthetic */ DismissIconType[] $values() {
            return new DismissIconType[]{Dark, Light};
        }

        public static EnumEntries<DismissIconType> getEntries() {
            return $ENTRIES;
        }

        private DismissIconType(String str, int i) {
        }

        static {
            DismissIconType[] dismissIconTypeArr$values = $values();
            $VALUES = dismissIconTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(dismissIconTypeArr$values);
        }

        public static DismissIconType valueOf(String str) {
            return (DismissIconType) Enum.valueOf(DismissIconType.class, str);
        }

        public static DismissIconType[] values() {
            return (DismissIconType[]) $VALUES.clone();
        }
    }
}
