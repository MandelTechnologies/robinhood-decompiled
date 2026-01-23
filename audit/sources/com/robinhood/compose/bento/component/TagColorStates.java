package com.robinhood.compose.bento.component;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.account.p060ui.AccountNavigationViewState;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.compose.bento.theme.BentoColors;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InfoTags.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/TagColorStates;", "", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "Lcom/robinhood/compose/bento/component/TagColors;", "disabled", "<init>", "(Lcom/robinhood/compose/bento/component/TagColors;Lcom/robinhood/compose/bento/component/TagColors;)V", "getDefault", "()Lcom/robinhood/compose/bento/component/TagColors;", "getDisabled", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TagColorStates {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final TagColors default;
    private final TagColors disabled;

    public static /* synthetic */ TagColorStates copy$default(TagColorStates tagColorStates, TagColors tagColors, TagColors tagColors2, int i, Object obj) {
        if ((i & 1) != 0) {
            tagColors = tagColorStates.default;
        }
        if ((i & 2) != 0) {
            tagColors2 = tagColorStates.disabled;
        }
        return tagColorStates.copy(tagColors, tagColors2);
    }

    /* renamed from: component1, reason: from getter */
    public final TagColors getDefault() {
        return this.default;
    }

    /* renamed from: component2, reason: from getter */
    public final TagColors getDisabled() {
        return this.disabled;
    }

    public final TagColorStates copy(TagColors tagColors, TagColors disabled) {
        Intrinsics.checkNotNullParameter(tagColors, "default");
        Intrinsics.checkNotNullParameter(disabled, "disabled");
        return new TagColorStates(tagColors, disabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagColorStates)) {
            return false;
        }
        TagColorStates tagColorStates = (TagColorStates) other;
        return Intrinsics.areEqual(this.default, tagColorStates.default) && Intrinsics.areEqual(this.disabled, tagColorStates.disabled);
    }

    public int hashCode() {
        return (this.default.hashCode() * 31) + this.disabled.hashCode();
    }

    public String toString() {
        return "TagColorStates(default=" + this.default + ", disabled=" + this.disabled + ")";
    }

    /* compiled from: InfoTags.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006J\r\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\tX\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\tX\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\tX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/TagColorStates$Companion;", "", "<init>", "()V", "alert", "Lcom/robinhood/compose/bento/component/TagColorStates;", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/TagColorStates;", "inform", "backgroundColorOverride", "Landroidx/compose/ui/graphics/Color;", "inform-oJZG2nU", "(Landroidx/compose/ui/graphics/Color;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/TagColorStates;", "inline", AccountNavigationViewState.LOG_OUT_TEXT_COLOR, "lib-compose-bento_externalRelease", "ripple"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static final long inform_oJZG2nU$lambda$2$lambda$1(SnapshotState4<Color> snapshotState4) {
            return snapshotState4.getValue().getValue();
        }

        private static final long inline$lambda$4$lambda$3(SnapshotState4<Color> snapshotState4) {
            return snapshotState4.getValue().getValue();
        }

        private static final long positive$lambda$6$lambda$5(SnapshotState4<Color> snapshotState4) {
            return snapshotState4.getValue().getValue();
        }

        private Companion() {
        }

        public final TagColorStates alert(Composer composer, int i) {
            composer.startReplaceGroup(772969997);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(772969997, i, -1, "com.robinhood.compose.bento.component.TagColorStates.Companion.alert (InfoTags.kt:194)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            TagColorStates tagColorStates = new TagColorStates(new TagColors(bentoTheme.getColors(composer, 0).getJet(), bentoTheme.getColors(composer, 0).getLumen(), RippleColors.INSTANCE.m20832getRippleNova0d7_KjU(), null), new TagColors(bentoTheme.getColors(composer, 0).m21427getFg30d7_KjU(), bentoTheme.getColors(composer, 0).m21372getBg20d7_KjU(), 0L, 4, null));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return tagColorStates;
        }

        /* renamed from: inform-oJZG2nU, reason: not valid java name */
        public final TagColorStates m20839informoJZG2nU(Color color, Composer composer, int i) {
            composer.startReplaceGroup(921011989);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(921011989, i, -1, "com.robinhood.compose.bento.component.TagColorStates.Companion.inform (InfoTags.kt:209)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            SnapshotState4<Color> snapshotState4RippleForeground1 = RippleColors.INSTANCE.rippleForeground1(composer, 6);
            long jM21371getBg0d7_KjU = bentoTheme.getColors(composer, 0).m21371getBg0d7_KjU();
            composer.startReplaceGroup(329268153);
            long jM21425getFg0d7_KjU = color == null ? bentoTheme.getColors(composer, 0).m21425getFg0d7_KjU() : color.getValue();
            composer.endReplaceGroup();
            TagColorStates tagColorStates = new TagColorStates(new TagColors(jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, inform_oJZG2nU$lambda$2$lambda$1(snapshotState4RippleForeground1), null), new TagColors(bentoTheme.getColors(composer, 0).m21427getFg30d7_KjU(), bentoTheme.getColors(composer, 0).m21372getBg20d7_KjU(), 0L, 4, null));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return tagColorStates;
        }

        public final TagColorStates inline(Composer composer, int i) {
            composer.startReplaceGroup(-1065506010);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1065506010, i, -1, "com.robinhood.compose.bento.component.TagColorStates.Companion.inline (InfoTags.kt:225)");
            }
            BentoColors colors = BentoTheme.INSTANCE.getColors(composer, 6);
            TagColorStates tagColorStates = new TagColorStates(new TagColors(colors.m21425getFg0d7_KjU(), colors.m21372getBg20d7_KjU(), inline$lambda$4$lambda$3(RippleColors.INSTANCE.rippleBackground1(composer, 6)), null), new TagColors(colors.m21427getFg30d7_KjU(), colors.m21372getBg20d7_KjU(), 0L, 4, null));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return tagColorStates;
        }

        public final TagColorStates positive(Composer composer, int i) {
            composer.startReplaceGroup(-1967614202);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1967614202, i, -1, "com.robinhood.compose.bento.component.TagColorStates.Companion.positive (InfoTags.kt:241)");
            }
            BentoColors colors = BentoTheme.INSTANCE.getColors(composer, 6);
            TagColorStates tagColorStates = new TagColorStates(new TagColors(colors.m21456getPositive0d7_KjU(), Color.m6705copywmQWz5c$default(colors.m21456getPositive0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), positive$lambda$6$lambda$5(RippleColors.INSTANCE.rippleBackground1(composer, 6)), null), new TagColors(colors.m21427getFg30d7_KjU(), colors.m21372getBg20d7_KjU(), 0L, 4, null));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return tagColorStates;
        }
    }

    public TagColorStates(TagColors tagColors, TagColors disabled) {
        Intrinsics.checkNotNullParameter(tagColors, "default");
        Intrinsics.checkNotNullParameter(disabled, "disabled");
        this.default = tagColors;
        this.disabled = disabled;
    }

    public final TagColors getDefault() {
        return this.default;
    }

    public final TagColors getDisabled() {
        return this.disabled;
    }
}
