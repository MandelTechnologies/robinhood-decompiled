package microgram.android.inject;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.generator.IdGenerator;

/* compiled from: MicrogramRuntimeModule_ProvideStringIdGeneratorFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/android/inject/MicrogramRuntimeModule_ProvideStringIdGeneratorFactory;", "Ldagger/internal/Factory;", "Lmicrogram/generator/IdGenerator;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class MicrogramRuntimeModule_ProvideStringIdGeneratorFactory implements Factory<IdGenerator<String>> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final IdGenerator<String> provideStringIdGenerator(IdGenerator<UUID> idGenerator) {
        return INSTANCE.provideStringIdGenerator(idGenerator);
    }

    /* compiled from: MicrogramRuntimeModule_ProvideStringIdGeneratorFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\r\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0002\b\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lmicrogram/android/inject/MicrogramRuntimeModule_ProvideStringIdGeneratorFactory$Companion;", "", "<init>", "()V", "Lmicrogram/generator/IdGenerator;", "Ljava/util/UUID;", "Lkotlin/jvm/JvmSuppressWildcards;", "uuidGenerator", "", "provideStringIdGenerator", "(Lmicrogram/generator/IdGenerator;)Lmicrogram/generator/IdGenerator;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IdGenerator<String> provideStringIdGenerator(IdGenerator<UUID> uuidGenerator) {
            Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
            Object objCheckNotNull = Preconditions.checkNotNull(MicrogramRuntimeModule.INSTANCE.provideStringIdGenerator(uuidGenerator), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (IdGenerator) objCheckNotNull;
        }
    }
}
