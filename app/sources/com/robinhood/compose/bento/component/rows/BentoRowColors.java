package com.robinhood.compose.bento.component.rows;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoBaseRow.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoRowColors;", "", "fgColor", "Landroidx/compose/ui/graphics/Color;", "fgColorSecondary", "fgColorDisabled", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getFgColor-0d7_KjU", "()J", "J", "getFgColorSecondary-0d7_KjU", "getFgColorDisabled-0d7_KjU", "Companion", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class BentoRowColors {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long fgColor;
    private final long fgColorDisabled;
    private final long fgColorSecondary;

    public /* synthetic */ BentoRowColors(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    private BentoRowColors(long j, long j2, long j3) {
        this.fgColor = j;
        this.fgColorSecondary = j2;
        this.fgColorDisabled = j3;
    }

    /* renamed from: getFgColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getFgColor() {
        return this.fgColor;
    }

    /* renamed from: getFgColorSecondary-0d7_KjU, reason: not valid java name and from getter */
    public final long getFgColorSecondary() {
        return this.fgColorSecondary;
    }

    /* renamed from: getFgColorDisabled-0d7_KjU, reason: not valid java name and from getter */
    public final long getFgColorDisabled() {
        return this.fgColorDisabled;
    }

    /* compiled from: BentoBaseRow.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoRowColors$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "Lcom/robinhood/compose/bento/component/rows/BentoRowColors;", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/rows/BentoRowColors;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: default, reason: not valid java name */
        public final BentoRowColors m20986default(Composer composer, int i) {
            composer.startReplaceGroup(828166759);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(828166759, i, -1, "com.robinhood.compose.bento.component.rows.BentoRowColors.Companion.default (BentoBaseRow.kt:1002)");
            }
            BentoRowColors bentoRowColors = new BentoRowColors(((Styles) composer.consume(Styles2.getLocalStyles())).getRow(composer, 0).getColors().m21928getPrimaryTextColor0d7_KjU(), ((Styles) composer.consume(Styles2.getLocalStyles())).getRow(composer, 0).getColors().m21929getSecondaryTextColor0d7_KjU(), ((Styles) composer.consume(Styles2.getLocalStyles())).getRow(composer, 0).getColors().m21926getDisabledColor0d7_KjU(), null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return bentoRowColors;
        }
    }
}
