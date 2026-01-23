package com.truelayer.payments.core.network.payments.entity.shared;

import com.truelayer.payments.core.domain.payments.SchemeSelectionType;
import com.truelayer.payments.core.domain.utils.IntoDomain;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ObjectSerializer;

/* compiled from: ProviderSelection.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/SchemeSelectionType;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/payments/SchemeSelectionType;", "Companion", "InstantOnly", "InstantPreferred", "UserSelected", "Lcom/truelayer/payments/core/network/payments/entity/shared/SchemeSelectionType$InstantOnly;", "Lcom/truelayer/payments/core/network/payments/entity/shared/SchemeSelectionType$InstantPreferred;", "Lcom/truelayer/payments/core/network/payments/entity/shared/SchemeSelectionType$UserSelected;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public interface SchemeSelectionType extends IntoDomain<com.truelayer.payments.core.domain.payments.SchemeSelectionType> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: ProviderSelection.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/SchemeSelectionType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/SchemeSelectionType;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final KSerializer<SchemeSelectionType> serializer() {
            return new SealedSerializer("com.truelayer.payments.core.network.payments.entity.shared.SchemeSelectionType", Reflection.getOrCreateKotlinClass(SchemeSelectionType.class), new KClass[]{Reflection.getOrCreateKotlinClass(InstantOnly.class), Reflection.getOrCreateKotlinClass(InstantPreferred.class), Reflection.getOrCreateKotlinClass(UserSelected.class)}, new KSerializer[]{new ObjectSerializer("instant_only", InstantOnly.INSTANCE, new Annotation[0]), new ObjectSerializer("instant_preferred", InstantPreferred.INSTANCE, new Annotation[0]), new ObjectSerializer("user_selected", UserSelected.INSTANCE, new Annotation[0])}, new Annotation[0]);
        }
    }

    /* compiled from: ProviderSelection.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006HÆ\u0001¨\u0006\u0007"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/SchemeSelectionType$InstantOnly;", "Lcom/truelayer/payments/core/network/payments/entity/shared/SchemeSelectionType;", "()V", "intoDomain", "Lcom/truelayer/payments/core/domain/payments/SchemeSelectionType$InstantOnly;", "serializer", "Lkotlinx/serialization/KSerializer;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("instant_only")
    public static final class InstantOnly implements SchemeSelectionType {
        public static final InstantOnly INSTANCE = new InstantOnly();
        private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.truelayer.payments.core.network.payments.entity.shared.SchemeSelectionType.InstantOnly.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return new ObjectSerializer("instant_only", InstantOnly.INSTANCE, new Annotation[0]);
            }
        });

        private InstantOnly() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public final KSerializer<InstantOnly> serializer() {
            return get$cachedSerializer();
        }

        @Override // com.truelayer.payments.core.domain.utils.IntoDomain
        /* renamed from: intoDomain */
        public com.truelayer.payments.core.domain.payments.SchemeSelectionType intoDomain2() {
            return SchemeSelectionType.InstantOnly.INSTANCE;
        }
    }

    /* compiled from: ProviderSelection.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006HÆ\u0001¨\u0006\u0007"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/SchemeSelectionType$InstantPreferred;", "Lcom/truelayer/payments/core/network/payments/entity/shared/SchemeSelectionType;", "()V", "intoDomain", "Lcom/truelayer/payments/core/domain/payments/SchemeSelectionType$InstantPreferred;", "serializer", "Lkotlinx/serialization/KSerializer;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("instant_preferred")
    public static final class InstantPreferred implements SchemeSelectionType {
        public static final InstantPreferred INSTANCE = new InstantPreferred();
        private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.truelayer.payments.core.network.payments.entity.shared.SchemeSelectionType.InstantPreferred.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return new ObjectSerializer("instant_preferred", InstantPreferred.INSTANCE, new Annotation[0]);
            }
        });

        private InstantPreferred() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public final KSerializer<InstantPreferred> serializer() {
            return get$cachedSerializer();
        }

        @Override // com.truelayer.payments.core.domain.utils.IntoDomain
        /* renamed from: intoDomain */
        public com.truelayer.payments.core.domain.payments.SchemeSelectionType intoDomain2() {
            return SchemeSelectionType.InstantPreferred.INSTANCE;
        }
    }

    /* compiled from: ProviderSelection.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006HÆ\u0001¨\u0006\u0007"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/SchemeSelectionType$UserSelected;", "Lcom/truelayer/payments/core/network/payments/entity/shared/SchemeSelectionType;", "()V", "intoDomain", "Lcom/truelayer/payments/core/domain/payments/SchemeSelectionType$UserSelected;", "serializer", "Lkotlinx/serialization/KSerializer;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("user_selected")
    public static final class UserSelected implements SchemeSelectionType {
        public static final UserSelected INSTANCE = new UserSelected();
        private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.truelayer.payments.core.network.payments.entity.shared.SchemeSelectionType.UserSelected.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return new ObjectSerializer("user_selected", UserSelected.INSTANCE, new Annotation[0]);
            }
        });

        private UserSelected() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public final KSerializer<UserSelected> serializer() {
            return get$cachedSerializer();
        }

        @Override // com.truelayer.payments.core.domain.utils.IntoDomain
        /* renamed from: intoDomain */
        public com.truelayer.payments.core.domain.payments.SchemeSelectionType intoDomain2() {
            return SchemeSelectionType.UserSelected.INSTANCE;
        }
    }
}
