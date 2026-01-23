package com.robinhood.transfers.accounts.contracts.model;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.Enums4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IraContributionType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/model/IraContributionType;", "", "<init>", "(Ljava/lang/String;I)V", "ONE_TIME_CONTRIBUTION", "INDIRECT_ROLLOVER", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes12.dex */
public final class IraContributionType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IraContributionType[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final IraContributionType ONE_TIME_CONTRIBUTION = new IraContributionType("ONE_TIME_CONTRIBUTION", 0);
    public static final IraContributionType INDIRECT_ROLLOVER = new IraContributionType("INDIRECT_ROLLOVER", 1);

    private static final /* synthetic */ IraContributionType[] $values() {
        return new IraContributionType[]{ONE_TIME_CONTRIBUTION, INDIRECT_ROLLOVER};
    }

    public static EnumEntries<IraContributionType> getEntries() {
        return $ENTRIES;
    }

    /* compiled from: IraContributionType.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/model/IraContributionType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/accounts/contracts/model/IraContributionType;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) IraContributionType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<IraContributionType> serializer() {
            return get$cachedSerializer();
        }
    }

    private IraContributionType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return Enums4.createSimpleEnumSerializer("com.robinhood.transfers.accounts.contracts.model.IraContributionType", values());
    }

    static {
        IraContributionType[] iraContributionTypeArr$values = $values();
        $VALUES = iraContributionTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(iraContributionTypeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.transfers.accounts.contracts.model.IraContributionType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IraContributionType._init_$_anonymous_();
            }
        });
    }

    public static IraContributionType valueOf(String str) {
        return (IraContributionType) Enum.valueOf(IraContributionType.class, str);
    }

    public static IraContributionType[] values() {
        return (IraContributionType[]) $VALUES.clone();
    }
}
