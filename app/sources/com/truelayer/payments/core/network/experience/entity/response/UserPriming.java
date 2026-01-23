package com.truelayer.payments.core.network.experience.entity.response;

import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import com.truelayer.payments.core.domain.experience.localisation.UserPriming;
import com.truelayer.payments.core.domain.utils.IntoDomain;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: UserPriming.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0011\u0012\u0013B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J!\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010HÇ\u0001\u0082\u0001\u0002\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/entity/response/UserPriming;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming;", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "intoDomain", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "Data", "None", "Lcom/truelayer/payments/core/network/experience/entity/response/UserPriming$Data;", "Lcom/truelayer/payments/core/network/experience/entity/response/UserPriming$None;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes6.dex */
public abstract class UserPriming implements IntoDomain<com.truelayer.payments.core.domain.experience.localisation.UserPriming> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.truelayer.payments.core.network.experience.entity.response.UserPriming.Companion.1
        @Override // kotlin.jvm.functions.Function0
        public final KSerializer<Object> invoke() {
            return new SealedSerializer("com.truelayer.payments.core.network.experience.entity.response.UserPriming", Reflection.getOrCreateKotlinClass(UserPriming.class), new KClass[]{Reflection.getOrCreateKotlinClass(Data.class), Reflection.getOrCreateKotlinClass(None.class)}, new KSerializer[]{UserPriming2.INSTANCE, new ObjectSerializer(ApiRenderablePlatforms.VERSIONS_NONE, None.INSTANCE, new Annotation[0])}, new Annotation[0]);
        }
    });

    public /* synthetic */ UserPriming(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(UserPriming self, Encoding3 output, SerialDescriptor serialDesc) {
    }

    /* compiled from: UserPriming.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/entity/response/UserPriming$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/experience/entity/response/UserPriming;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) UserPriming.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<UserPriming> serializer() {
            return get$cachedSerializer();
        }
    }

    private UserPriming() {
    }

    @Deprecated
    public /* synthetic */ UserPriming(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    /* compiled from: UserPriming.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¨\u0006\u0005"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/entity/response/UserPriming$None;", "Lcom/truelayer/payments/core/network/experience/entity/response/UserPriming;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName(ApiRenderablePlatforms.VERSIONS_NONE)
    public static final class None extends UserPriming {
        public static final None INSTANCE = new None();
        private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.truelayer.payments.core.network.experience.entity.response.UserPriming.None.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return new ObjectSerializer(ApiRenderablePlatforms.VERSIONS_NONE, None.INSTANCE, new Annotation[0]);
            }
        });

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public final KSerializer<None> serializer() {
            return get$cachedSerializer();
        }

        private None() {
            super(null);
        }
    }

    /* compiled from: UserPriming.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 52\u00020\u0001:\u00043456B[\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fB3\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003JA\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001J&\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201HÁ\u0001¢\u0006\u0002\b2R\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0017R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0017¨\u00067"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/entity/response/UserPriming$Data;", "Lcom/truelayer/payments/core/network/experience/entity/response/UserPriming;", "seen1", "", "type", "", "title", "headline", "steps", "", "Lcom/truelayer/payments/core/network/experience/entity/response/UserPriming$Data$Step;", "bankLink", "Lcom/truelayer/payments/core/network/experience/entity/response/UserPriming$Data$BankLink;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/truelayer/payments/core/network/experience/entity/response/UserPriming$Data$BankLink;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/truelayer/payments/core/network/experience/entity/response/UserPriming$Data$BankLink;)V", "getBankLink$annotations", "()V", "getBankLink", "()Lcom/truelayer/payments/core/network/experience/entity/response/UserPriming$Data$BankLink;", "getHeadline$annotations", "getHeadline", "()Ljava/lang/String;", "getSteps$annotations", "getSteps", "()Ljava/util/List;", "getTitle$annotations", "getTitle", "getType$annotations", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "BankLink", "Companion", "Step", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    @SerialName("priming")
    public static final /* data */ class Data extends UserPriming {
        private final BankLink bankLink;
        private final String headline;
        private final List<Step> steps;
        private final String title;
        private final String type;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(UserPriming4.INSTANCE), null};

        public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, List list, BankLink bankLink, int i, Object obj) {
            if ((i & 1) != 0) {
                str = data.type;
            }
            if ((i & 2) != 0) {
                str2 = data.title;
            }
            if ((i & 4) != 0) {
                str3 = data.headline;
            }
            if ((i & 8) != 0) {
                list = data.steps;
            }
            if ((i & 16) != 0) {
                bankLink = data.bankLink;
            }
            BankLink bankLink2 = bankLink;
            String str4 = str3;
            return data.copy(str, str2, str4, list, bankLink2);
        }

        @SerialName("bank_link")
        public static /* synthetic */ void getBankLink$annotations() {
        }

        @SerialName("headline")
        public static /* synthetic */ void getHeadline$annotations() {
        }

        @SerialName("steps")
        public static /* synthetic */ void getSteps$annotations() {
        }

        @SerialName("title")
        public static /* synthetic */ void getTitle$annotations() {
        }

        @SerialName("type")
        public static /* synthetic */ void getType$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getHeadline() {
            return this.headline;
        }

        public final List<Step> component4() {
            return this.steps;
        }

        /* renamed from: component5, reason: from getter */
        public final BankLink getBankLink() {
            return this.bankLink;
        }

        public final Data copy(String type2, String title, String headline, List<Step> steps, BankLink bankLink) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(headline, "headline");
            Intrinsics.checkNotNullParameter(steps, "steps");
            Intrinsics.checkNotNullParameter(bankLink, "bankLink");
            return new Data(type2, title, headline, steps, bankLink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.areEqual(this.type, data.type) && Intrinsics.areEqual(this.title, data.title) && Intrinsics.areEqual(this.headline, data.headline) && Intrinsics.areEqual(this.steps, data.steps) && Intrinsics.areEqual(this.bankLink, data.bankLink);
        }

        public int hashCode() {
            return (((((((this.type.hashCode() * 31) + this.title.hashCode()) * 31) + this.headline.hashCode()) * 31) + this.steps.hashCode()) * 31) + this.bankLink.hashCode();
        }

        public String toString() {
            return "Data(type=" + this.type + ", title=" + this.title + ", headline=" + this.headline + ", steps=" + this.steps + ", bankLink=" + this.bankLink + ")";
        }

        /* compiled from: UserPriming.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/entity/response/UserPriming$Data$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/experience/entity/response/UserPriming$Data;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Data> serializer() {
                return UserPriming2.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public /* synthetic */ Data(int i, @SerialName("type") String str, @SerialName("title") String str2, @SerialName("headline") String str3, @SerialName("steps") List list, @SerialName("bank_link") BankLink bankLink, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (31 != (i & 31)) {
                PluginExceptions.throwMissingFieldException(i, 31, UserPriming2.INSTANCE.getDescriptor());
            }
            this.type = str;
            this.title = str2;
            this.headline = str3;
            this.steps = list;
            this.bankLink = bankLink;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$payments_core_release(Data self, Encoding3 output, SerialDescriptor serialDesc) {
            UserPriming.write$Self(self, output, serialDesc);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.type);
            output.encodeStringElement(serialDesc, 1, self.title);
            output.encodeStringElement(serialDesc, 2, self.headline);
            output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.steps);
            output.encodeSerializableElement(serialDesc, 4, UserPriming3.INSTANCE, self.bankLink);
        }

        public final String getType() {
            return this.type;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getHeadline() {
            return this.headline;
        }

        public final List<Step> getSteps() {
            return this.steps;
        }

        /* compiled from: UserPriming.kt */
        @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002$%B1\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÁ\u0001¢\u0006\u0002\b#R\u001c\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006&"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/entity/response/UserPriming$Data$BankLink;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming$Data$BankLink;", "seen1", "", "text", "", "link", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getLink$annotations", "()V", "getLink", "()Ljava/lang/String;", "getText$annotations", "getText", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "intoDomain", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class BankLink implements IntoDomain<UserPriming.Data.BankLink> {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String link;
            private final String text;

            public static /* synthetic */ BankLink copy$default(BankLink bankLink, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bankLink.text;
                }
                if ((i & 2) != 0) {
                    str2 = bankLink.link;
                }
                return bankLink.copy(str, str2);
            }

            @SerialName("link")
            public static /* synthetic */ void getLink$annotations() {
            }

            @SerialName("text")
            public static /* synthetic */ void getText$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            /* renamed from: component2, reason: from getter */
            public final String getLink() {
                return this.link;
            }

            public final BankLink copy(String text, String link) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(link, "link");
                return new BankLink(text, link);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BankLink)) {
                    return false;
                }
                BankLink bankLink = (BankLink) other;
                return Intrinsics.areEqual(this.text, bankLink.text) && Intrinsics.areEqual(this.link, bankLink.link);
            }

            public int hashCode() {
                return (this.text.hashCode() * 31) + this.link.hashCode();
            }

            public String toString() {
                return "BankLink(text=" + this.text + ", link=" + this.link + ")";
            }

            /* compiled from: UserPriming.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/entity/response/UserPriming$Data$BankLink$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/experience/entity/response/UserPriming$Data$BankLink;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<BankLink> serializer() {
                    return UserPriming3.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ BankLink(int i, @SerialName("text") String str, @SerialName("link") String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptions.throwMissingFieldException(i, 3, UserPriming3.INSTANCE.getDescriptor());
                }
                this.text = str;
                this.link = str2;
            }

            public BankLink(String text, String link) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(link, "link");
                this.text = text;
                this.link = link;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$payments_core_release(BankLink self, Encoding3 output, SerialDescriptor serialDesc) {
                output.encodeStringElement(serialDesc, 0, self.text);
                output.encodeStringElement(serialDesc, 1, self.link);
            }

            public final String getText() {
                return this.text;
            }

            public final String getLink() {
                return this.link;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.truelayer.payments.core.domain.utils.IntoDomain
            /* renamed from: intoDomain */
            public UserPriming.Data.BankLink intoDomain2() {
                return new UserPriming.Data.BankLink(this.text, this.link);
            }
        }

        public final BankLink getBankLink() {
            return this.bankLink;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Data(String type2, String title, String headline, List<Step> steps, BankLink bankLink) {
            super(null);
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(headline, "headline");
            Intrinsics.checkNotNullParameter(steps, "steps");
            Intrinsics.checkNotNullParameter(bankLink, "bankLink");
            this.type = type2;
            this.title = title;
            this.headline = headline;
            this.steps = steps;
            this.bankLink = bankLink;
        }

        /* compiled from: UserPriming.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002 !B%\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÁ\u0001¢\u0006\u0002\b\u001fR\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\""}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/entity/response/UserPriming$Data$Step;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming$Data$Step;", "seen1", "", "text", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getText$annotations", "()V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "intoDomain", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Step implements IntoDomain<UserPriming.Data.Step> {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String text;

            public static /* synthetic */ Step copy$default(Step step, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = step.text;
                }
                return step.copy(str);
            }

            @SerialName("text")
            public static /* synthetic */ void getText$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public final Step copy(String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new Step(text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Step) && Intrinsics.areEqual(this.text, ((Step) other).text);
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            public String toString() {
                return "Step(text=" + this.text + ")";
            }

            /* compiled from: UserPriming.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/entity/response/UserPriming$Data$Step$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/experience/entity/response/UserPriming$Data$Step;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<Step> serializer() {
                    return UserPriming4.INSTANCE;
                }
            }

            @Deprecated
            public /* synthetic */ Step(int i, @SerialName("text") String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptions.throwMissingFieldException(i, 1, UserPriming4.INSTANCE.getDescriptor());
                }
                this.text = str;
            }

            public Step(String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
            }

            public final String getText() {
                return this.text;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.truelayer.payments.core.domain.utils.IntoDomain
            /* renamed from: intoDomain */
            public UserPriming.Data.Step intoDomain2() {
                return new UserPriming.Data.Step(this.text);
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.truelayer.payments.core.domain.utils.IntoDomain
    /* renamed from: intoDomain */
    public com.truelayer.payments.core.domain.experience.localisation.UserPriming intoDomain2() {
        if (this instanceof None) {
            return UserPriming.None.INSTANCE;
        }
        if (!(this instanceof Data)) {
            throw new NoWhenBranchMatchedException();
        }
        Data data = (Data) this;
        String title = data.getTitle();
        String headline = data.getHeadline();
        List<Data.Step> steps = data.getSteps();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(steps, 10));
        Iterator<T> it = steps.iterator();
        while (it.hasNext()) {
            arrayList.add(((Data.Step) it.next()).intoDomain2());
        }
        return new UserPriming.Data(title, headline, arrayList, data.getBankLink().intoDomain2());
    }
}
