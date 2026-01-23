package androidx.constraintlayout.compose;

import com.robinhood.android.tickerinputview.TickerInputView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0002\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m3636d2 = {"Landroidx/constraintlayout/compose/Dimension;", "", "Companion", "Coercible", "MinCoercible", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public interface Dimension {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: ConstraintLayout.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m3636d2 = {"Landroidx/constraintlayout/compose/Dimension$Coercible;", "Landroidx/constraintlayout/compose/Dimension;", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public interface Coercible extends Dimension {
    }

    /* compiled from: ConstraintLayout.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m3636d2 = {"Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "Landroidx/constraintlayout/compose/Dimension;", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public interface MinCoercible extends Dimension {
    }

    /* compiled from: ConstraintLayout.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\fR\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, m3636d2 = {"Landroidx/constraintlayout/compose/Dimension$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "dp", "Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "preferredValue-0680j_4", "(F)Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "preferredValue", "Landroidx/constraintlayout/compose/Dimension;", "value-0680j_4", "(F)Landroidx/constraintlayout/compose/Dimension;", "value", "", "ratio", "(Ljava/lang/String;)Landroidx/constraintlayout/compose/Dimension;", "", "percent", "Landroidx/constraintlayout/compose/Dimension$Coercible;", "getPreferredWrapContent", "()Landroidx/constraintlayout/compose/Dimension$Coercible;", "preferredWrapContent", "getWrapContent", "()Landroidx/constraintlayout/compose/Dimension;", "wrapContent", "getFillToConstraints", "fillToConstraints", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* renamed from: preferredValue-0680j_4, reason: not valid java name */
        public final MinCoercible m8159preferredValue0680j_4(float dp) {
            DimensionDescription dimensionDescription = new DimensionDescription("spread");
            dimensionDescription.getMax().m8161update0680j_4(dp);
            return dimensionDescription;
        }

        /* renamed from: value-0680j_4, reason: not valid java name */
        public final Dimension m8160value0680j_4(float dp) {
            return new DimensionDescription(dp, (DefaultConstructorMarker) null);
        }

        public final Dimension ratio(String ratio) {
            return new DimensionDescription(ratio);
        }

        public final Coercible getPreferredWrapContent() {
            return new DimensionDescription("preferWrap");
        }

        public final Dimension getWrapContent() {
            return new DimensionDescription("wrap");
        }

        public final Coercible getFillToConstraints() {
            return new DimensionDescription("spread");
        }

        public final Dimension percent(float percent) {
            StringBuilder sb = new StringBuilder();
            sb.append(percent * 100.0f);
            sb.append(TickerInputView.PERCENT_SYMBOL);
            return new DimensionDescription(sb.toString());
        }
    }
}
