package com.truelayer.payments.core.network.experience;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.truelayer.payments.core.domain.experience.localisation.Legals;
import com.truelayer.payments.core.domain.experience.localisation.LocalisedText;
import com.truelayer.payments.core.domain.experience.localisation.UserPriming;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TranslationsCache.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0015BS\u0012 \b\u0002\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00050\u0003\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u0004J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u0004J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u0004J\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0005J\u0016\u0010\u0013\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\bJ\u0016\u0010\u0014\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\nR&\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/TranslationsCache;", "", "inputs", "", "", "", "Lcom/truelayer/payments/core/domain/experience/localisation/LocalisedText;", "legals", "Lcom/truelayer/payments/core/domain/experience/localisation/Legals;", "priming", "Lcom/truelayer/payments/core/domain/experience/localisation/UserPriming;", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getInputs", "key", "getLegals", "getPriming", "saveInputs", "", WebsocketGatewayConstants.DATA_KEY, "saveLegals", "savePriming", "Type", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class TranslationsCache {
    private final Map<String, Map<String, LocalisedText>> inputs;
    private final Map<String, Legals> legals;
    private final Map<String, UserPriming> priming;

    public TranslationsCache() {
        this(null, null, null, 7, null);
    }

    public TranslationsCache(Map<String, Map<String, LocalisedText>> inputs, Map<String, Legals> legals, Map<String, UserPriming> priming) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(legals, "legals");
        Intrinsics.checkNotNullParameter(priming, "priming");
        this.inputs = inputs;
        this.legals = legals;
        this.priming = priming;
    }

    public /* synthetic */ TranslationsCache(Map map, Map map2, Map map3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : map, (i & 2) != 0 ? new LinkedHashMap() : map2, (i & 4) != 0 ? new LinkedHashMap() : map3);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TranslationsCache.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/TranslationsCache$Type;", "", "(Ljava/lang/String;I)V", "INPUTS", "LEGALS", "PRIMING", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type INPUTS = new Type("INPUTS", 0);
        public static final Type LEGALS = new Type("LEGALS", 1);
        public static final Type PRIMING = new Type("PRIMING", 2);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{INPUTS, LEGALS, PRIMING};
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        private Type(String str, int i) {
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
        }
    }

    public final Map<String, LocalisedText> getInputs(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.inputs.get(key);
    }

    public final Legals getLegals(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.legals.get(key);
    }

    public final UserPriming getPriming(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.priming.get(key);
    }

    public final void saveInputs(String key, Map<String, LocalisedText> data) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(data, "data");
        this.inputs.put(key, data);
    }

    public final void saveLegals(String key, Legals data) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(data, "data");
        this.legals.put(key, data);
    }

    public final void savePriming(String key, UserPriming data) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(data, "data");
        this.priming.put(key, data);
    }
}
