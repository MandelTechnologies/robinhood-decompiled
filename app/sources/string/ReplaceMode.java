package string;

import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ReplaceMode.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00052\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lstring/ReplaceMode;", "Lkotlin/Function0;", "", "<init>", "()V", "Companion", "Lstring/AllReplace;", "Lstring/FewReplace;", "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public abstract class ReplaceMode implements Function0<Object> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ ReplaceMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ReplaceMode() {
    }

    /* compiled from: ReplaceMode.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m3636d2 = {"Lstring/ReplaceMode$Companion;", "", "()V", "from", "Lstring/ReplaceMode;", "mode", "", "replaceData", "Lstring/ReplaceData;", "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ReplaceMode from(String mode, ReplaceData replaceData) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(replaceData, "replaceData");
            if (Intrinsics.areEqual(mode, ApiRenderablePlatforms.VERSIONS_ALL)) {
                return new ReplaceMode2(replaceData);
            }
            if (StringsKt.toIntOrNull(mode) != null) {
                return new ReplaceMode3(replaceData, Integer.parseInt(mode));
            }
            throw new IllegalArgumentException(mode);
        }
    }
}
