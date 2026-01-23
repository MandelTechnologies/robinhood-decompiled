package com.robinhood.experiments;

import com.robinhood.enums.RhEnum;
import com.robinhood.hammer.android.RequiresHammerPlugin;
import java.lang.Enum;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ExperimentDeclaration.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0018\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004B\u001b\b\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0086\u0002J\u0006\u0010 \u001a\u00020\u0006R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR'\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018\u0082\u0001\u0003!\"#¨\u0006$"}, m3636d2 = {"Lcom/robinhood/experiments/ExperimentDeclaration;", "VariantT", "", "Lcom/robinhood/enums/RhEnum;", "Lcom/robinhood/hammer/android/RequiresHammerPlugin;", "serverName", "", "obfuscatedName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getServerName", "()Ljava/lang/String;", "getObfuscatedName", "variantType", "Ljava/lang/Class;", "getVariantType$annotations", "()V", "getVariantType", "()Ljava/lang/Class;", "variantType$delegate", "Lkotlin/Lazy;", "variants", "", "getVariants", "()Ljava/util/Set;", "variants$delegate", "hashCode", "", "equals", "", "other", "", "toString", "Lcom/robinhood/experiments/DeviceIdExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/ProcessInvariantExperiment;", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public abstract class ExperimentDeclaration<VariantT extends Enum<VariantT> & RhEnum<VariantT>> implements RequiresHammerPlugin {
    private final String obfuscatedName;
    private final String serverName;

    /* renamed from: variantType$delegate, reason: from kotlin metadata */
    private final Lazy variantType;

    /* renamed from: variants$delegate, reason: from kotlin metadata */
    private final Lazy variants;

    public /* synthetic */ ExperimentDeclaration(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public static /* synthetic */ void getVariantType$annotations() {
    }

    public final boolean equals(Object other) {
        return other == this;
    }

    private ExperimentDeclaration(String str, String str2) {
        this.serverName = str;
        this.obfuscatedName = str2;
        this.variantType = LazyKt.lazy(new Function0() { // from class: com.robinhood.experiments.ExperimentDeclaration$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ExperimentDeclaration.variantType_delegate$lambda$0(this.f$0);
            }
        });
        this.variants = LazyKt.lazy(new Function0() { // from class: com.robinhood.experiments.ExperimentDeclaration$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ExperimentDeclaration.variants_delegate$lambda$1(this.f$0);
            }
        });
    }

    public final String getServerName() {
        return this.serverName;
    }

    public final String getObfuscatedName() {
        return this.obfuscatedName;
    }

    public final Class<VariantT> getVariantType() {
        return (Class) this.variantType.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class variantType_delegate$lambda$0(ExperimentDeclaration experimentDeclaration) {
        Type genericSuperclass = experimentDeclaration.getClass().getGenericSuperclass();
        Intrinsics.checkNotNull(genericSuperclass, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
        Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
        Object objSingle = ArraysKt.single(actualTypeArguments);
        Intrinsics.checkNotNull(objSingle, "null cannot be cast to non-null type java.lang.Class<VariantT of com.robinhood.experiments.ExperimentDeclaration>");
        return (Class) objSingle;
    }

    public final Set<VariantT> getVariants() {
        return (Set) this.variants.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set variants_delegate$lambda$1(ExperimentDeclaration experimentDeclaration) {
        EnumSet enumSetAllOf = EnumSet.allOf(experimentDeclaration.getVariantType());
        Intrinsics.checkNotNullExpressionValue(enumSetAllOf, "allOf(...)");
        Set setUnmodifiableSet = Collections.unmodifiableSet(enumSetAllOf);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        Class<? super Object> superclass = getClass().getSuperclass();
        Intrinsics.checkNotNull(superclass);
        return superclass.getSimpleName() + "(\"" + this.serverName + "\") [" + Reflection.getOrCreateKotlinClass(getClass()).getQualifiedName() + "]";
    }
}
