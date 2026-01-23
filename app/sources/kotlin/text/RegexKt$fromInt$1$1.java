package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: Regex.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class RegexKt$fromInt$1$1 implements Function1<Enum<Object>, Boolean> {
    final /* synthetic */ int $value;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Enum<Object> r3) {
        FlagEnum flagEnum = (FlagEnum) r3;
        return Boolean.valueOf((this.$value & flagEnum.getMask()) == flagEnum.getValue());
    }
}
