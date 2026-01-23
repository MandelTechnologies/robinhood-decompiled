package microgram.android.inject;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import microgram.generator.IdGenerator;

/* compiled from: MicrogramRuntimeModule_ProvideUuidGeneratorFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, m3636d2 = {"Lmicrogram/android/inject/MicrogramRuntimeModule_ProvideUuidGeneratorFactory;", "Ldagger/internal/Factory;", "Lmicrogram/generator/IdGenerator;", "Ljava/util/UUID;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "()V", "provideUuidGenerator", "()Lmicrogram/generator/IdGenerator;", "get", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class MicrogramRuntimeModule_ProvideUuidGeneratorFactory implements Factory<IdGenerator<UUID>> {
    public static final MicrogramRuntimeModule_ProvideUuidGeneratorFactory INSTANCE = new MicrogramRuntimeModule_ProvideUuidGeneratorFactory();

    private MicrogramRuntimeModule_ProvideUuidGeneratorFactory() {
    }

    @Override // javax.inject.Provider
    public IdGenerator<UUID> get() {
        return provideUuidGenerator();
    }

    @JvmStatic
    public static final IdGenerator<UUID> provideUuidGenerator() {
        Object objCheckNotNull = Preconditions.checkNotNull(MicrogramRuntimeModule.INSTANCE.provideUuidGenerator(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (IdGenerator) objCheckNotNull;
    }
}
