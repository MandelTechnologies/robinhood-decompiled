package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.NcwOnboardingContext;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: NcwOnboardingContext.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004 !\"#B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016J8\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext;", "Lcom/squareup/wire/Message;", "", "session_id", "", "onboard_result", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$OnboardResult;", "wallet_onboard_type", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$WalletOnboardType;", "onboard_error", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$OnboardError;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$OnboardResult;Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$WalletOnboardType;Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$OnboardError;Lokio/ByteString;)V", "getSession_id", "()Ljava/lang/String;", "getOnboard_result", "()Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$OnboardResult;", "getWallet_onboard_type", "()Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$WalletOnboardType;", "getOnboard_error", "()Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$OnboardError;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "OnboardResult", "WalletOnboardType", "OnboardError", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class NcwOnboardingContext extends Message {

    @JvmField
    public static final ProtoAdapter<NcwOnboardingContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.NcwOnboardingContext$OnboardError#ADAPTER", jsonName = "onboardError", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final OnboardError onboard_error;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.NcwOnboardingContext$OnboardResult#ADAPTER", jsonName = "onboardResult", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final OnboardResult onboard_result;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sessionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String session_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.NcwOnboardingContext$WalletOnboardType#ADAPTER", jsonName = "walletOnboardType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final WalletOnboardType wallet_onboard_type;

    public NcwOnboardingContext() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24399newBuilder();
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public /* synthetic */ NcwOnboardingContext(String str, OnboardResult onboardResult, WalletOnboardType walletOnboardType, OnboardError onboardError, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? OnboardResult.RESULT_UNSPECIFIED : onboardResult, (i & 4) != 0 ? WalletOnboardType.TYPE_UNSPECIFIED : walletOnboardType, (i & 8) != 0 ? OnboardError.ERROR_UNSPECIFIED : onboardError, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final OnboardResult getOnboard_result() {
        return this.onboard_result;
    }

    public final WalletOnboardType getWallet_onboard_type() {
        return this.wallet_onboard_type;
    }

    public final OnboardError getOnboard_error() {
        return this.onboard_error;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NcwOnboardingContext(String session_id, OnboardResult onboard_result, WalletOnboardType wallet_onboard_type, OnboardError onboard_error, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(onboard_result, "onboard_result");
        Intrinsics.checkNotNullParameter(wallet_onboard_type, "wallet_onboard_type");
        Intrinsics.checkNotNullParameter(onboard_error, "onboard_error");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.session_id = session_id;
        this.onboard_result = onboard_result;
        this.wallet_onboard_type = wallet_onboard_type;
        this.onboard_error = onboard_error;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24399newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof NcwOnboardingContext)) {
            return false;
        }
        NcwOnboardingContext ncwOnboardingContext = (NcwOnboardingContext) other;
        return Intrinsics.areEqual(unknownFields(), ncwOnboardingContext.unknownFields()) && Intrinsics.areEqual(this.session_id, ncwOnboardingContext.session_id) && this.onboard_result == ncwOnboardingContext.onboard_result && this.wallet_onboard_type == ncwOnboardingContext.wallet_onboard_type && this.onboard_error == ncwOnboardingContext.onboard_error;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.session_id.hashCode()) * 37) + this.onboard_result.hashCode()) * 37) + this.wallet_onboard_type.hashCode()) * 37) + this.onboard_error.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("session_id=" + Internal.sanitize(this.session_id));
        arrayList.add("onboard_result=" + this.onboard_result);
        arrayList.add("wallet_onboard_type=" + this.wallet_onboard_type);
        arrayList.add("onboard_error=" + this.onboard_error);
        return CollectionsKt.joinToString$default(arrayList, ", ", "NcwOnboardingContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ NcwOnboardingContext copy$default(NcwOnboardingContext ncwOnboardingContext, String str, OnboardResult onboardResult, WalletOnboardType walletOnboardType, OnboardError onboardError, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ncwOnboardingContext.session_id;
        }
        if ((i & 2) != 0) {
            onboardResult = ncwOnboardingContext.onboard_result;
        }
        if ((i & 4) != 0) {
            walletOnboardType = ncwOnboardingContext.wallet_onboard_type;
        }
        if ((i & 8) != 0) {
            onboardError = ncwOnboardingContext.onboard_error;
        }
        if ((i & 16) != 0) {
            byteString = ncwOnboardingContext.unknownFields();
        }
        ByteString byteString2 = byteString;
        WalletOnboardType walletOnboardType2 = walletOnboardType;
        return ncwOnboardingContext.copy(str, onboardResult, walletOnboardType2, onboardError, byteString2);
    }

    public final NcwOnboardingContext copy(String session_id, OnboardResult onboard_result, WalletOnboardType wallet_onboard_type, OnboardError onboard_error, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(onboard_result, "onboard_result");
        Intrinsics.checkNotNullParameter(wallet_onboard_type, "wallet_onboard_type");
        Intrinsics.checkNotNullParameter(onboard_error, "onboard_error");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new NcwOnboardingContext(session_id, onboard_result, wallet_onboard_type, onboard_error, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NcwOnboardingContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<NcwOnboardingContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.NcwOnboardingContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(NcwOnboardingContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getSession_id());
                }
                if (value.getOnboard_result() != NcwOnboardingContext.OnboardResult.RESULT_UNSPECIFIED) {
                    size += NcwOnboardingContext.OnboardResult.ADAPTER.encodedSizeWithTag(2, value.getOnboard_result());
                }
                if (value.getWallet_onboard_type() != NcwOnboardingContext.WalletOnboardType.TYPE_UNSPECIFIED) {
                    size += NcwOnboardingContext.WalletOnboardType.ADAPTER.encodedSizeWithTag(3, value.getWallet_onboard_type());
                }
                return value.getOnboard_error() != NcwOnboardingContext.OnboardError.ERROR_UNSPECIFIED ? size + NcwOnboardingContext.OnboardError.ADAPTER.encodedSizeWithTag(4, value.getOnboard_error()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, NcwOnboardingContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSession_id());
                }
                if (value.getOnboard_result() != NcwOnboardingContext.OnboardResult.RESULT_UNSPECIFIED) {
                    NcwOnboardingContext.OnboardResult.ADAPTER.encodeWithTag(writer, 2, (int) value.getOnboard_result());
                }
                if (value.getWallet_onboard_type() != NcwOnboardingContext.WalletOnboardType.TYPE_UNSPECIFIED) {
                    NcwOnboardingContext.WalletOnboardType.ADAPTER.encodeWithTag(writer, 3, (int) value.getWallet_onboard_type());
                }
                if (value.getOnboard_error() != NcwOnboardingContext.OnboardError.ERROR_UNSPECIFIED) {
                    NcwOnboardingContext.OnboardError.ADAPTER.encodeWithTag(writer, 4, (int) value.getOnboard_error());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, NcwOnboardingContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getOnboard_error() != NcwOnboardingContext.OnboardError.ERROR_UNSPECIFIED) {
                    NcwOnboardingContext.OnboardError.ADAPTER.encodeWithTag(writer, 4, (int) value.getOnboard_error());
                }
                if (value.getWallet_onboard_type() != NcwOnboardingContext.WalletOnboardType.TYPE_UNSPECIFIED) {
                    NcwOnboardingContext.WalletOnboardType.ADAPTER.encodeWithTag(writer, 3, (int) value.getWallet_onboard_type());
                }
                if (value.getOnboard_result() != NcwOnboardingContext.OnboardResult.RESULT_UNSPECIFIED) {
                    NcwOnboardingContext.OnboardResult.ADAPTER.encodeWithTag(writer, 2, (int) value.getOnboard_result());
                }
                if (Intrinsics.areEqual(value.getSession_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSession_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public NcwOnboardingContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                NcwOnboardingContext.OnboardResult onboardResultDecode = NcwOnboardingContext.OnboardResult.RESULT_UNSPECIFIED;
                NcwOnboardingContext.WalletOnboardType walletOnboardType = NcwOnboardingContext.WalletOnboardType.TYPE_UNSPECIFIED;
                NcwOnboardingContext.OnboardError onboardError = NcwOnboardingContext.OnboardError.ERROR_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                NcwOnboardingContext.OnboardError onboardErrorDecode = onboardError;
                NcwOnboardingContext.WalletOnboardType walletOnboardTypeDecode = walletOnboardType;
                while (true) {
                    NcwOnboardingContext.OnboardResult onboardResult = onboardResultDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new NcwOnboardingContext(strDecode, onboardResult, walletOnboardTypeDecode, onboardErrorDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            try {
                                onboardResultDecode = NcwOnboardingContext.OnboardResult.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 3) {
                            try {
                                walletOnboardTypeDecode = NcwOnboardingContext.WalletOnboardType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 4) {
                            try {
                                onboardErrorDecode = NcwOnboardingContext.OnboardError.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public NcwOnboardingContext redact(NcwOnboardingContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return NcwOnboardingContext.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NcwOnboardingContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$OnboardResult;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "RESULT_UNSPECIFIED", "SUCCESS", "CANCELED_BY_USER", "ERROR", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OnboardResult implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OnboardResult[] $VALUES;

        @JvmField
        public static final ProtoAdapter<OnboardResult> ADAPTER;
        public static final OnboardResult CANCELED_BY_USER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final OnboardResult ERROR;
        public static final OnboardResult RESULT_UNSPECIFIED;
        public static final OnboardResult SUCCESS;
        private final int value;

        private static final /* synthetic */ OnboardResult[] $values() {
            return new OnboardResult[]{RESULT_UNSPECIFIED, SUCCESS, CANCELED_BY_USER, ERROR};
        }

        @JvmStatic
        public static final OnboardResult fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<OnboardResult> getEntries() {
            return $ENTRIES;
        }

        private OnboardResult(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final OnboardResult onboardResult = new OnboardResult("RESULT_UNSPECIFIED", 0, 0);
            RESULT_UNSPECIFIED = onboardResult;
            SUCCESS = new OnboardResult("SUCCESS", 1, 1);
            CANCELED_BY_USER = new OnboardResult("CANCELED_BY_USER", 2, 2);
            ERROR = new OnboardResult("ERROR", 3, 3);
            OnboardResult[] onboardResultArr$values = $values();
            $VALUES = onboardResultArr$values;
            $ENTRIES = EnumEntries2.enumEntries(onboardResultArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OnboardResult.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<OnboardResult>(orCreateKotlinClass, syntax, onboardResult) { // from class: com.robinhood.rosetta.eventlogging.NcwOnboardingContext$OnboardResult$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public NcwOnboardingContext.OnboardResult fromValue(int value) {
                    return NcwOnboardingContext.OnboardResult.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: NcwOnboardingContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$OnboardResult$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$OnboardResult;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final OnboardResult fromValue(int value) {
                if (value == 0) {
                    return OnboardResult.RESULT_UNSPECIFIED;
                }
                if (value == 1) {
                    return OnboardResult.SUCCESS;
                }
                if (value == 2) {
                    return OnboardResult.CANCELED_BY_USER;
                }
                if (value != 3) {
                    return null;
                }
                return OnboardResult.ERROR;
            }
        }

        public static OnboardResult valueOf(String str) {
            return (OnboardResult) Enum.valueOf(OnboardResult.class, str);
        }

        public static OnboardResult[] values() {
            return (OnboardResult[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NcwOnboardingContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$WalletOnboardType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TYPE_UNSPECIFIED", "IMPORT", "CREATE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class WalletOnboardType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ WalletOnboardType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<WalletOnboardType> ADAPTER;
        public static final WalletOnboardType CREATE;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final WalletOnboardType IMPORT;
        public static final WalletOnboardType TYPE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ WalletOnboardType[] $values() {
            return new WalletOnboardType[]{TYPE_UNSPECIFIED, IMPORT, CREATE};
        }

        @JvmStatic
        public static final WalletOnboardType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<WalletOnboardType> getEntries() {
            return $ENTRIES;
        }

        private WalletOnboardType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final WalletOnboardType walletOnboardType = new WalletOnboardType("TYPE_UNSPECIFIED", 0, 0);
            TYPE_UNSPECIFIED = walletOnboardType;
            IMPORT = new WalletOnboardType("IMPORT", 1, 1);
            CREATE = new WalletOnboardType("CREATE", 2, 2);
            WalletOnboardType[] walletOnboardTypeArr$values = $values();
            $VALUES = walletOnboardTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(walletOnboardTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(WalletOnboardType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<WalletOnboardType>(orCreateKotlinClass, syntax, walletOnboardType) { // from class: com.robinhood.rosetta.eventlogging.NcwOnboardingContext$WalletOnboardType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public NcwOnboardingContext.WalletOnboardType fromValue(int value) {
                    return NcwOnboardingContext.WalletOnboardType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: NcwOnboardingContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$WalletOnboardType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$WalletOnboardType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final WalletOnboardType fromValue(int value) {
                if (value == 0) {
                    return WalletOnboardType.TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return WalletOnboardType.IMPORT;
                }
                if (value != 2) {
                    return null;
                }
                return WalletOnboardType.CREATE;
            }
        }

        public static WalletOnboardType valueOf(String str) {
            return (WalletOnboardType) Enum.valueOf(WalletOnboardType.class, str);
        }

        public static WalletOnboardType[] values() {
            return (WalletOnboardType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NcwOnboardingContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$OnboardError;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ERROR_UNSPECIFIED", "INVALID_RECOVERY_PHRASE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OnboardError implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OnboardError[] $VALUES;

        @JvmField
        public static final ProtoAdapter<OnboardError> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final OnboardError ERROR_UNSPECIFIED;
        public static final OnboardError INVALID_RECOVERY_PHRASE;
        private final int value;

        private static final /* synthetic */ OnboardError[] $values() {
            return new OnboardError[]{ERROR_UNSPECIFIED, INVALID_RECOVERY_PHRASE};
        }

        @JvmStatic
        public static final OnboardError fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<OnboardError> getEntries() {
            return $ENTRIES;
        }

        private OnboardError(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final OnboardError onboardError = new OnboardError("ERROR_UNSPECIFIED", 0, 0);
            ERROR_UNSPECIFIED = onboardError;
            INVALID_RECOVERY_PHRASE = new OnboardError("INVALID_RECOVERY_PHRASE", 1, 1);
            OnboardError[] onboardErrorArr$values = $values();
            $VALUES = onboardErrorArr$values;
            $ENTRIES = EnumEntries2.enumEntries(onboardErrorArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OnboardError.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<OnboardError>(orCreateKotlinClass, syntax, onboardError) { // from class: com.robinhood.rosetta.eventlogging.NcwOnboardingContext$OnboardError$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public NcwOnboardingContext.OnboardError fromValue(int value) {
                    return NcwOnboardingContext.OnboardError.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: NcwOnboardingContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$OnboardError$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$OnboardError;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final OnboardError fromValue(int value) {
                if (value == 0) {
                    return OnboardError.ERROR_UNSPECIFIED;
                }
                if (value != 1) {
                    return null;
                }
                return OnboardError.INVALID_RECOVERY_PHRASE;
            }
        }

        public static OnboardError valueOf(String str) {
            return (OnboardError) Enum.valueOf(OnboardError.class, str);
        }

        public static OnboardError[] values() {
            return (OnboardError[]) $VALUES.clone();
        }
    }
}
