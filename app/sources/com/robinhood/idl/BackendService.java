package com.robinhood.idl;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BackendService.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\bC\b\u0086\u0081\u0002\u0018\u0000 F2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001FB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bE¨\u0006G"}, m3636d2 = {"Lcom/robinhood/idl/BackendService;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "BACKEND_SERVICE_UNSPECIFIED", "BACKEND_SERVICE_API", "BACKEND_SERVICE_ANALYTICS", "BACKEND_SERVICE_EXPERIMENTS", "BACKEND_SERVICE_NUMMUS", "BACKEND_SERVICE_DORA", "BACKEND_SERVICE_MINERVA", "BACKEND_SERVICE_ATLAS", "BACKEND_SERVICE_BONFIRE", "BACKEND_SERVICE_CASHIER", "BACKEND_SERVICE_IDENTI", "BACKEND_SERVICE_PIMS", "BACKEND_SERVICE_PLUTO", "BACKEND_SERVICE_OPTIONS_PRODUCT", "BACKEND_SERVICE_CERES", "BACKEND_SERVICE_TEST_DATA", "BACKEND_SERVICE_INBOX_RENDERER", "BACKEND_SERVICE_IDL_SAMPLE_KIOSK", "BACKEND_SERVICE_BFF_POC_APP", "BACKEND_SERVICE_BUGSY_APP", "BACKEND_SERVICE_HIPPO", "BACKEND_SERVICE_ARSENAL", "BACKEND_SERVICE_WORMHOLE", "BACKEND_SERVICE_MERCURY", "BACKEND_SERVICE_BFF_VITALS", "BACKEND_SERVICE_BFF_CRYPTO_TRADING", "BACKEND_SERVICE_CHATBOT", "BACKEND_SERVICE_BFF_SAMPLE_APP", "BACKEND_SERVICE_PORTFOLIO", "BACKEND_SERVICE_BFF_MONEY_MOVEMENT", "BACKEND_SERVICE_BFF_RETIREMENT", "BACKEND_SERVICE_ACATS_AGGREGATION", "BACKEND_SERVICE_BILLY_MAYS", "BACKEND_SERVICE_PATHFINDER", "BACKEND_SERVICE_NIMBUS", "BACKEND_SERVICE_MIDAS", "BACKEND_SERVICE_YODA", "BACKEND_SERVICE_CRYPTO_PERPETUALS", "BACKEND_SERVICE_BLACK_WIDOW_BFF", "BACKEND_SERVICE_ACCOUNT_AGGREGATION", "BACKEND_SERVICE_MD_SERVER_PROXY", "BACKEND_SERVICE_COPILOT", "BACKEND_SERVICE_TESTCASEPROTOS", "BACKEND_SERVICE_GOKU", "BACKEND_SERVICE_AGORA", "BACKEND_SERVICE_SOCIAL_TRADING", "BACKEND_SERVICE_CONFIG_ROLLOUT", "BACKEND_SERVICE_PREDICTION_MARKETS", "BACKEND_SERVICE_BEACON", "BACKEND_SERVICE_WONKA", "BACKEND_SERVICE_POSTOFFICE", "BACKEND_SERVICE_BAFFI", "BACKEND_SERVICE_SURGE", "BACKEND_SERVICE_MONEYTREE", "BACKEND_SERVICE_BONFIRE_IDENTI", "BACKEND_SERVICE_CRYPTO_PORTKEY", "BACKEND_SERVICE_BONFIRE_CRYPTO", "BACKEND_SERVICE_FRONTEND_SERVARS", "BACKEND_SERVICE_BONFIRE_OPTIONS", "BACKEND_SERVICE_HELIOS", "BACKEND_SERVICE_RUDOLPH", "Companion", "idl.api.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class BackendService implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BackendService[] $VALUES;

    @JvmField
    public static final ProtoAdapter<BackendService> ADAPTER;
    public static final BackendService BACKEND_SERVICE_ACATS_AGGREGATION;
    public static final BackendService BACKEND_SERVICE_ACCOUNT_AGGREGATION;
    public static final BackendService BACKEND_SERVICE_AGORA;
    public static final BackendService BACKEND_SERVICE_ANALYTICS;
    public static final BackendService BACKEND_SERVICE_API;
    public static final BackendService BACKEND_SERVICE_ARSENAL;
    public static final BackendService BACKEND_SERVICE_ATLAS;
    public static final BackendService BACKEND_SERVICE_BAFFI;
    public static final BackendService BACKEND_SERVICE_BEACON;
    public static final BackendService BACKEND_SERVICE_BFF_CRYPTO_TRADING;
    public static final BackendService BACKEND_SERVICE_BFF_MONEY_MOVEMENT;
    public static final BackendService BACKEND_SERVICE_BFF_POC_APP;
    public static final BackendService BACKEND_SERVICE_BFF_RETIREMENT;
    public static final BackendService BACKEND_SERVICE_BFF_SAMPLE_APP;
    public static final BackendService BACKEND_SERVICE_BFF_VITALS;
    public static final BackendService BACKEND_SERVICE_BILLY_MAYS;
    public static final BackendService BACKEND_SERVICE_BLACK_WIDOW_BFF;
    public static final BackendService BACKEND_SERVICE_BONFIRE;
    public static final BackendService BACKEND_SERVICE_BONFIRE_CRYPTO;
    public static final BackendService BACKEND_SERVICE_BONFIRE_IDENTI;
    public static final BackendService BACKEND_SERVICE_BONFIRE_OPTIONS;
    public static final BackendService BACKEND_SERVICE_BUGSY_APP;
    public static final BackendService BACKEND_SERVICE_CASHIER;
    public static final BackendService BACKEND_SERVICE_CERES;
    public static final BackendService BACKEND_SERVICE_CHATBOT;
    public static final BackendService BACKEND_SERVICE_CONFIG_ROLLOUT;
    public static final BackendService BACKEND_SERVICE_COPILOT;
    public static final BackendService BACKEND_SERVICE_CRYPTO_PERPETUALS;
    public static final BackendService BACKEND_SERVICE_CRYPTO_PORTKEY;
    public static final BackendService BACKEND_SERVICE_DORA;
    public static final BackendService BACKEND_SERVICE_EXPERIMENTS;
    public static final BackendService BACKEND_SERVICE_FRONTEND_SERVARS;
    public static final BackendService BACKEND_SERVICE_GOKU;
    public static final BackendService BACKEND_SERVICE_HELIOS;
    public static final BackendService BACKEND_SERVICE_HIPPO;
    public static final BackendService BACKEND_SERVICE_IDENTI;
    public static final BackendService BACKEND_SERVICE_IDL_SAMPLE_KIOSK;
    public static final BackendService BACKEND_SERVICE_INBOX_RENDERER;
    public static final BackendService BACKEND_SERVICE_MD_SERVER_PROXY;
    public static final BackendService BACKEND_SERVICE_MERCURY;
    public static final BackendService BACKEND_SERVICE_MIDAS;
    public static final BackendService BACKEND_SERVICE_MINERVA;
    public static final BackendService BACKEND_SERVICE_MONEYTREE;
    public static final BackendService BACKEND_SERVICE_NIMBUS;
    public static final BackendService BACKEND_SERVICE_NUMMUS;
    public static final BackendService BACKEND_SERVICE_OPTIONS_PRODUCT;
    public static final BackendService BACKEND_SERVICE_PATHFINDER;
    public static final BackendService BACKEND_SERVICE_PIMS;
    public static final BackendService BACKEND_SERVICE_PLUTO;
    public static final BackendService BACKEND_SERVICE_PORTFOLIO;
    public static final BackendService BACKEND_SERVICE_POSTOFFICE;
    public static final BackendService BACKEND_SERVICE_PREDICTION_MARKETS;
    public static final BackendService BACKEND_SERVICE_RUDOLPH;
    public static final BackendService BACKEND_SERVICE_SOCIAL_TRADING;
    public static final BackendService BACKEND_SERVICE_SURGE;
    public static final BackendService BACKEND_SERVICE_TESTCASEPROTOS;
    public static final BackendService BACKEND_SERVICE_TEST_DATA;
    public static final BackendService BACKEND_SERVICE_UNSPECIFIED;
    public static final BackendService BACKEND_SERVICE_WONKA;
    public static final BackendService BACKEND_SERVICE_WORMHOLE;
    public static final BackendService BACKEND_SERVICE_YODA;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ BackendService[] $values() {
        return new BackendService[]{BACKEND_SERVICE_UNSPECIFIED, BACKEND_SERVICE_API, BACKEND_SERVICE_ANALYTICS, BACKEND_SERVICE_EXPERIMENTS, BACKEND_SERVICE_NUMMUS, BACKEND_SERVICE_DORA, BACKEND_SERVICE_MINERVA, BACKEND_SERVICE_ATLAS, BACKEND_SERVICE_BONFIRE, BACKEND_SERVICE_CASHIER, BACKEND_SERVICE_IDENTI, BACKEND_SERVICE_PIMS, BACKEND_SERVICE_PLUTO, BACKEND_SERVICE_OPTIONS_PRODUCT, BACKEND_SERVICE_CERES, BACKEND_SERVICE_TEST_DATA, BACKEND_SERVICE_INBOX_RENDERER, BACKEND_SERVICE_IDL_SAMPLE_KIOSK, BACKEND_SERVICE_BFF_POC_APP, BACKEND_SERVICE_BUGSY_APP, BACKEND_SERVICE_HIPPO, BACKEND_SERVICE_ARSENAL, BACKEND_SERVICE_WORMHOLE, BACKEND_SERVICE_MERCURY, BACKEND_SERVICE_BFF_VITALS, BACKEND_SERVICE_BFF_CRYPTO_TRADING, BACKEND_SERVICE_CHATBOT, BACKEND_SERVICE_BFF_SAMPLE_APP, BACKEND_SERVICE_PORTFOLIO, BACKEND_SERVICE_BFF_MONEY_MOVEMENT, BACKEND_SERVICE_BFF_RETIREMENT, BACKEND_SERVICE_ACATS_AGGREGATION, BACKEND_SERVICE_BILLY_MAYS, BACKEND_SERVICE_PATHFINDER, BACKEND_SERVICE_NIMBUS, BACKEND_SERVICE_MIDAS, BACKEND_SERVICE_YODA, BACKEND_SERVICE_CRYPTO_PERPETUALS, BACKEND_SERVICE_BLACK_WIDOW_BFF, BACKEND_SERVICE_ACCOUNT_AGGREGATION, BACKEND_SERVICE_MD_SERVER_PROXY, BACKEND_SERVICE_COPILOT, BACKEND_SERVICE_TESTCASEPROTOS, BACKEND_SERVICE_GOKU, BACKEND_SERVICE_AGORA, BACKEND_SERVICE_SOCIAL_TRADING, BACKEND_SERVICE_CONFIG_ROLLOUT, BACKEND_SERVICE_PREDICTION_MARKETS, BACKEND_SERVICE_BEACON, BACKEND_SERVICE_WONKA, BACKEND_SERVICE_POSTOFFICE, BACKEND_SERVICE_BAFFI, BACKEND_SERVICE_SURGE, BACKEND_SERVICE_MONEYTREE, BACKEND_SERVICE_BONFIRE_IDENTI, BACKEND_SERVICE_CRYPTO_PORTKEY, BACKEND_SERVICE_BONFIRE_CRYPTO, BACKEND_SERVICE_FRONTEND_SERVARS, BACKEND_SERVICE_BONFIRE_OPTIONS, BACKEND_SERVICE_HELIOS, BACKEND_SERVICE_RUDOLPH};
    }

    @JvmStatic
    public static final BackendService fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<BackendService> getEntries() {
        return $ENTRIES;
    }

    private BackendService(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final BackendService backendService = new BackendService("BACKEND_SERVICE_UNSPECIFIED", 0, 0);
        BACKEND_SERVICE_UNSPECIFIED = backendService;
        BACKEND_SERVICE_API = new BackendService("BACKEND_SERVICE_API", 1, 1);
        BACKEND_SERVICE_ANALYTICS = new BackendService("BACKEND_SERVICE_ANALYTICS", 2, 2);
        BACKEND_SERVICE_EXPERIMENTS = new BackendService("BACKEND_SERVICE_EXPERIMENTS", 3, 3);
        BACKEND_SERVICE_NUMMUS = new BackendService("BACKEND_SERVICE_NUMMUS", 4, 4);
        BACKEND_SERVICE_DORA = new BackendService("BACKEND_SERVICE_DORA", 5, 5);
        BACKEND_SERVICE_MINERVA = new BackendService("BACKEND_SERVICE_MINERVA", 6, 6);
        BACKEND_SERVICE_ATLAS = new BackendService("BACKEND_SERVICE_ATLAS", 7, 7);
        BACKEND_SERVICE_BONFIRE = new BackendService("BACKEND_SERVICE_BONFIRE", 8, 8);
        BACKEND_SERVICE_CASHIER = new BackendService("BACKEND_SERVICE_CASHIER", 9, 9);
        BACKEND_SERVICE_IDENTI = new BackendService("BACKEND_SERVICE_IDENTI", 10, 10);
        BACKEND_SERVICE_PIMS = new BackendService("BACKEND_SERVICE_PIMS", 11, 11);
        BACKEND_SERVICE_PLUTO = new BackendService("BACKEND_SERVICE_PLUTO", 12, 12);
        BACKEND_SERVICE_OPTIONS_PRODUCT = new BackendService("BACKEND_SERVICE_OPTIONS_PRODUCT", 13, 13);
        BACKEND_SERVICE_CERES = new BackendService("BACKEND_SERVICE_CERES", 14, 14);
        BACKEND_SERVICE_TEST_DATA = new BackendService("BACKEND_SERVICE_TEST_DATA", 15, 15);
        BACKEND_SERVICE_INBOX_RENDERER = new BackendService("BACKEND_SERVICE_INBOX_RENDERER", 16, 16);
        BACKEND_SERVICE_IDL_SAMPLE_KIOSK = new BackendService("BACKEND_SERVICE_IDL_SAMPLE_KIOSK", 17, 17);
        BACKEND_SERVICE_BFF_POC_APP = new BackendService("BACKEND_SERVICE_BFF_POC_APP", 18, 18);
        BACKEND_SERVICE_BUGSY_APP = new BackendService("BACKEND_SERVICE_BUGSY_APP", 19, 19);
        BACKEND_SERVICE_HIPPO = new BackendService("BACKEND_SERVICE_HIPPO", 20, 20);
        BACKEND_SERVICE_ARSENAL = new BackendService("BACKEND_SERVICE_ARSENAL", 21, 21);
        BACKEND_SERVICE_WORMHOLE = new BackendService("BACKEND_SERVICE_WORMHOLE", 22, 22);
        BACKEND_SERVICE_MERCURY = new BackendService("BACKEND_SERVICE_MERCURY", 23, 23);
        BACKEND_SERVICE_BFF_VITALS = new BackendService("BACKEND_SERVICE_BFF_VITALS", 24, 25);
        BACKEND_SERVICE_BFF_CRYPTO_TRADING = new BackendService("BACKEND_SERVICE_BFF_CRYPTO_TRADING", 25, 26);
        BACKEND_SERVICE_CHATBOT = new BackendService("BACKEND_SERVICE_CHATBOT", 26, 27);
        BACKEND_SERVICE_BFF_SAMPLE_APP = new BackendService("BACKEND_SERVICE_BFF_SAMPLE_APP", 27, 28);
        BACKEND_SERVICE_PORTFOLIO = new BackendService("BACKEND_SERVICE_PORTFOLIO", 28, 29);
        BACKEND_SERVICE_BFF_MONEY_MOVEMENT = new BackendService("BACKEND_SERVICE_BFF_MONEY_MOVEMENT", 29, 30);
        BACKEND_SERVICE_BFF_RETIREMENT = new BackendService("BACKEND_SERVICE_BFF_RETIREMENT", 30, 31);
        BACKEND_SERVICE_ACATS_AGGREGATION = new BackendService("BACKEND_SERVICE_ACATS_AGGREGATION", 31, 32);
        BACKEND_SERVICE_BILLY_MAYS = new BackendService("BACKEND_SERVICE_BILLY_MAYS", 32, 33);
        BACKEND_SERVICE_PATHFINDER = new BackendService("BACKEND_SERVICE_PATHFINDER", 33, 34);
        BACKEND_SERVICE_NIMBUS = new BackendService("BACKEND_SERVICE_NIMBUS", 34, 35);
        BACKEND_SERVICE_MIDAS = new BackendService("BACKEND_SERVICE_MIDAS", 35, 36);
        BACKEND_SERVICE_YODA = new BackendService("BACKEND_SERVICE_YODA", 36, 37);
        BACKEND_SERVICE_CRYPTO_PERPETUALS = new BackendService("BACKEND_SERVICE_CRYPTO_PERPETUALS", 37, 38);
        BACKEND_SERVICE_BLACK_WIDOW_BFF = new BackendService("BACKEND_SERVICE_BLACK_WIDOW_BFF", 38, 39);
        BACKEND_SERVICE_ACCOUNT_AGGREGATION = new BackendService("BACKEND_SERVICE_ACCOUNT_AGGREGATION", 39, 40);
        BACKEND_SERVICE_MD_SERVER_PROXY = new BackendService("BACKEND_SERVICE_MD_SERVER_PROXY", 40, 41);
        BACKEND_SERVICE_COPILOT = new BackendService("BACKEND_SERVICE_COPILOT", 41, 42);
        BACKEND_SERVICE_TESTCASEPROTOS = new BackendService("BACKEND_SERVICE_TESTCASEPROTOS", 42, 43);
        BACKEND_SERVICE_GOKU = new BackendService("BACKEND_SERVICE_GOKU", 43, 44);
        BACKEND_SERVICE_AGORA = new BackendService("BACKEND_SERVICE_AGORA", 44, 45);
        BACKEND_SERVICE_SOCIAL_TRADING = new BackendService("BACKEND_SERVICE_SOCIAL_TRADING", 45, 46);
        BACKEND_SERVICE_CONFIG_ROLLOUT = new BackendService("BACKEND_SERVICE_CONFIG_ROLLOUT", 46, 47);
        BACKEND_SERVICE_PREDICTION_MARKETS = new BackendService("BACKEND_SERVICE_PREDICTION_MARKETS", 47, 48);
        BACKEND_SERVICE_BEACON = new BackendService("BACKEND_SERVICE_BEACON", 48, 49);
        BACKEND_SERVICE_WONKA = new BackendService("BACKEND_SERVICE_WONKA", 49, 50);
        BACKEND_SERVICE_POSTOFFICE = new BackendService("BACKEND_SERVICE_POSTOFFICE", 50, 51);
        BACKEND_SERVICE_BAFFI = new BackendService("BACKEND_SERVICE_BAFFI", 51, 52);
        BACKEND_SERVICE_SURGE = new BackendService("BACKEND_SERVICE_SURGE", 52, 53);
        BACKEND_SERVICE_MONEYTREE = new BackendService("BACKEND_SERVICE_MONEYTREE", 53, 54);
        BACKEND_SERVICE_BONFIRE_IDENTI = new BackendService("BACKEND_SERVICE_BONFIRE_IDENTI", 54, 55);
        BACKEND_SERVICE_CRYPTO_PORTKEY = new BackendService("BACKEND_SERVICE_CRYPTO_PORTKEY", 55, 56);
        BACKEND_SERVICE_BONFIRE_CRYPTO = new BackendService("BACKEND_SERVICE_BONFIRE_CRYPTO", 56, 57);
        BACKEND_SERVICE_FRONTEND_SERVARS = new BackendService("BACKEND_SERVICE_FRONTEND_SERVARS", 57, 58);
        BACKEND_SERVICE_BONFIRE_OPTIONS = new BackendService("BACKEND_SERVICE_BONFIRE_OPTIONS", 58, 59);
        BACKEND_SERVICE_HELIOS = new BackendService("BACKEND_SERVICE_HELIOS", 59, 60);
        BACKEND_SERVICE_RUDOLPH = new BackendService("BACKEND_SERVICE_RUDOLPH", 60, 61);
        BackendService[] backendServiceArr$values = $values();
        $VALUES = backendServiceArr$values;
        $ENTRIES = EnumEntries2.enumEntries(backendServiceArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BackendService.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<BackendService>(orCreateKotlinClass, syntax, backendService) { // from class: com.robinhood.idl.BackendService$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public BackendService fromValue(int value) {
                return BackendService.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: BackendService.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/idl/BackendService$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/idl/BackendService;", "fromValue", "value", "", "idl.api.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BackendService fromValue(int value) {
            switch (value) {
                case 0:
                    return BackendService.BACKEND_SERVICE_UNSPECIFIED;
                case 1:
                    return BackendService.BACKEND_SERVICE_API;
                case 2:
                    return BackendService.BACKEND_SERVICE_ANALYTICS;
                case 3:
                    return BackendService.BACKEND_SERVICE_EXPERIMENTS;
                case 4:
                    return BackendService.BACKEND_SERVICE_NUMMUS;
                case 5:
                    return BackendService.BACKEND_SERVICE_DORA;
                case 6:
                    return BackendService.BACKEND_SERVICE_MINERVA;
                case 7:
                    return BackendService.BACKEND_SERVICE_ATLAS;
                case 8:
                    return BackendService.BACKEND_SERVICE_BONFIRE;
                case 9:
                    return BackendService.BACKEND_SERVICE_CASHIER;
                case 10:
                    return BackendService.BACKEND_SERVICE_IDENTI;
                case 11:
                    return BackendService.BACKEND_SERVICE_PIMS;
                case 12:
                    return BackendService.BACKEND_SERVICE_PLUTO;
                case 13:
                    return BackendService.BACKEND_SERVICE_OPTIONS_PRODUCT;
                case 14:
                    return BackendService.BACKEND_SERVICE_CERES;
                case 15:
                    return BackendService.BACKEND_SERVICE_TEST_DATA;
                case 16:
                    return BackendService.BACKEND_SERVICE_INBOX_RENDERER;
                case 17:
                    return BackendService.BACKEND_SERVICE_IDL_SAMPLE_KIOSK;
                case 18:
                    return BackendService.BACKEND_SERVICE_BFF_POC_APP;
                case 19:
                    return BackendService.BACKEND_SERVICE_BUGSY_APP;
                case 20:
                    return BackendService.BACKEND_SERVICE_HIPPO;
                case 21:
                    return BackendService.BACKEND_SERVICE_ARSENAL;
                case 22:
                    return BackendService.BACKEND_SERVICE_WORMHOLE;
                case 23:
                    return BackendService.BACKEND_SERVICE_MERCURY;
                case 24:
                default:
                    return null;
                case 25:
                    return BackendService.BACKEND_SERVICE_BFF_VITALS;
                case 26:
                    return BackendService.BACKEND_SERVICE_BFF_CRYPTO_TRADING;
                case 27:
                    return BackendService.BACKEND_SERVICE_CHATBOT;
                case 28:
                    return BackendService.BACKEND_SERVICE_BFF_SAMPLE_APP;
                case 29:
                    return BackendService.BACKEND_SERVICE_PORTFOLIO;
                case 30:
                    return BackendService.BACKEND_SERVICE_BFF_MONEY_MOVEMENT;
                case 31:
                    return BackendService.BACKEND_SERVICE_BFF_RETIREMENT;
                case 32:
                    return BackendService.BACKEND_SERVICE_ACATS_AGGREGATION;
                case 33:
                    return BackendService.BACKEND_SERVICE_BILLY_MAYS;
                case 34:
                    return BackendService.BACKEND_SERVICE_PATHFINDER;
                case 35:
                    return BackendService.BACKEND_SERVICE_NIMBUS;
                case 36:
                    return BackendService.BACKEND_SERVICE_MIDAS;
                case 37:
                    return BackendService.BACKEND_SERVICE_YODA;
                case 38:
                    return BackendService.BACKEND_SERVICE_CRYPTO_PERPETUALS;
                case 39:
                    return BackendService.BACKEND_SERVICE_BLACK_WIDOW_BFF;
                case 40:
                    return BackendService.BACKEND_SERVICE_ACCOUNT_AGGREGATION;
                case 41:
                    return BackendService.BACKEND_SERVICE_MD_SERVER_PROXY;
                case 42:
                    return BackendService.BACKEND_SERVICE_COPILOT;
                case 43:
                    return BackendService.BACKEND_SERVICE_TESTCASEPROTOS;
                case 44:
                    return BackendService.BACKEND_SERVICE_GOKU;
                case 45:
                    return BackendService.BACKEND_SERVICE_AGORA;
                case 46:
                    return BackendService.BACKEND_SERVICE_SOCIAL_TRADING;
                case 47:
                    return BackendService.BACKEND_SERVICE_CONFIG_ROLLOUT;
                case 48:
                    return BackendService.BACKEND_SERVICE_PREDICTION_MARKETS;
                case 49:
                    return BackendService.BACKEND_SERVICE_BEACON;
                case 50:
                    return BackendService.BACKEND_SERVICE_WONKA;
                case 51:
                    return BackendService.BACKEND_SERVICE_POSTOFFICE;
                case 52:
                    return BackendService.BACKEND_SERVICE_BAFFI;
                case 53:
                    return BackendService.BACKEND_SERVICE_SURGE;
                case 54:
                    return BackendService.BACKEND_SERVICE_MONEYTREE;
                case 55:
                    return BackendService.BACKEND_SERVICE_BONFIRE_IDENTI;
                case 56:
                    return BackendService.BACKEND_SERVICE_CRYPTO_PORTKEY;
                case 57:
                    return BackendService.BACKEND_SERVICE_BONFIRE_CRYPTO;
                case 58:
                    return BackendService.BACKEND_SERVICE_FRONTEND_SERVARS;
                case 59:
                    return BackendService.BACKEND_SERVICE_BONFIRE_OPTIONS;
                case 60:
                    return BackendService.BACKEND_SERVICE_HELIOS;
                case 61:
                    return BackendService.BACKEND_SERVICE_RUDOLPH;
            }
        }
    }

    public static BackendService valueOf(String str) {
        return (BackendService) Enum.valueOf(BackendService.class, str);
    }

    public static BackendService[] values() {
        return (BackendService[]) $VALUES.clone();
    }
}
