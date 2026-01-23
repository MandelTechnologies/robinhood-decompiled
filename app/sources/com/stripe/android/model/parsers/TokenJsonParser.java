package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Token;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: TokenJsonParser.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/model/parsers/TokenJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Token;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-model_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class TokenJsonParser implements ModelJsonParser<Token> {
    private static final Companion Companion = new Companion(null);

    /* compiled from: TokenJsonParser.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Token.Type.values().length];
            try {
                iArr[Token.Type.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Token.Type.BankAccount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public Token parse(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        String strOptString = StripeJsonUtils.optString(json, "id");
        StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
        Long lOptLong = stripeJsonUtils.optLong(json, "created");
        Token.Type typeFromCode = Token.Type.INSTANCE.fromCode(StripeJsonUtils.optString(json, "type"));
        if (typeFromCode == null || strOptString == null || lOptLong == null) {
            return null;
        }
        boolean zOptBoolean = stripeJsonUtils.optBoolean(json, "used");
        boolean zOptBoolean2 = stripeJsonUtils.optBoolean(json, "livemode");
        Date date = new Date(TimeUnit.SECONDS.toMillis(lOptLong.longValue()));
        int i = WhenMappings.$EnumSwitchMapping$0[typeFromCode.ordinal()];
        if (i == 1) {
            Token.Type type2 = Token.Type.Card;
            JSONObject jSONObjectOptJSONObject = json.optJSONObject(type2.getCode());
            if (jSONObjectOptJSONObject != null) {
                return new Token(strOptString, type2, date, zOptBoolean2, zOptBoolean, null, new CardJsonParser().parse(jSONObjectOptJSONObject), 32, null);
            }
            return null;
        }
        if (i == 2) {
            Token.Type type3 = Token.Type.BankAccount;
            JSONObject jSONObjectOptJSONObject2 = json.optJSONObject(type3.getCode());
            if (jSONObjectOptJSONObject2 != null) {
                return new Token(strOptString, type3, date, zOptBoolean2, zOptBoolean, new BankAccountJsonParser().parse(jSONObjectOptJSONObject2), null, 64, null);
            }
            return null;
        }
        return new Token(strOptString, typeFromCode, date, zOptBoolean2, zOptBoolean, null, null, 96, null);
    }

    /* compiled from: TokenJsonParser.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/model/parsers/TokenJsonParser$Companion;", "", "()V", "FIELD_CREATED", "", "FIELD_ID", "FIELD_LIVEMODE", "FIELD_TYPE", "FIELD_USED", "payments-model_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
