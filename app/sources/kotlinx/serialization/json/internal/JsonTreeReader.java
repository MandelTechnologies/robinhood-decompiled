package kotlinx.serialization.json.internal;

import com.robinhood.utils.extensions.ResourceTypes;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.DeepRecursive;
import kotlin.DeepRecursive2;
import kotlin.DeepRecursive3;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElement2;
import kotlinx.serialization.json.JsonElement4;
import kotlinx.serialization.json.JsonElement5;
import kotlinx.serialization.json.JsonElement6;
import kotlinx.serialization.json.JsonElement7;

/* compiled from: JsonTreeReader.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\t\u001a\u00020\b*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000bH\u0082@¢\u0006\u0004\b\t\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\nJ\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Lkotlinx/serialization/json/internal/JsonTreeReader;", "", "Lkotlinx/serialization/json/JsonConfiguration;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "lexer", "<init>", "(Lkotlinx/serialization/json/JsonConfiguration;Lkotlinx/serialization/json/internal/AbstractJsonLexer;)V", "Lkotlinx/serialization/json/JsonElement;", "readObject", "()Lkotlinx/serialization/json/JsonElement;", "Lkotlin/DeepRecursiveScope;", "", "(Lkotlin/DeepRecursiveScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readArray", "", "isString", "Lkotlinx/serialization/json/JsonPrimitive;", "readValue", "(Z)Lkotlinx/serialization/json/JsonPrimitive;", "readDeepRecursive", "read", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "isLenient", "Z", "trailingCommaAllowed", "", "stackDepth", "I", "kotlinx-serialization-json"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class JsonTreeReader {
    private final boolean isLenient;
    private final JsonReader lexer;
    private int stackDepth;
    private final boolean trailingCommaAllowed;

    /* compiled from: JsonTreeReader.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "kotlinx.serialization.json.internal.JsonTreeReader", m3645f = "JsonTreeReader.kt", m3646l = {24}, m3647m = "readObject")
    /* renamed from: kotlinx.serialization.json.internal.JsonTreeReader$readObject$2 */
    static final class C461842 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C461842(Continuation<? super C461842> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JsonTreeReader.this.readObject(null, this);
        }
    }

    public JsonTreeReader(JsonConfiguration configuration, JsonReader lexer) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        this.lexer = lexer;
        this.isLenient = configuration.getIsLenient();
        this.trailingCommaAllowed = configuration.getAllowTrailingComma();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0096 -> B:27:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readObject(DeepRecursive3<Unit, JsonElement> deepRecursive3, Continuation<? super JsonElement> continuation) {
        C461842 c461842;
        JsonTreeReader jsonTreeReader;
        LinkedHashMap linkedHashMap;
        C461842 c4618422;
        byte b;
        DeepRecursive3 deepRecursive32;
        if (continuation instanceof C461842) {
            c461842 = (C461842) continuation;
            int i = c461842.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c461842.label = i - Integer.MIN_VALUE;
            } else {
                c461842 = new C461842(continuation);
            }
        }
        Object obj = c461842.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c461842.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            byte bConsumeNextToken = this.lexer.consumeNextToken((byte) 6);
            if (this.lexer.peekNextToken() == 4) {
                JsonReader.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
                throw new ExceptionsH();
            }
            jsonTreeReader = this;
            linkedHashMap = new LinkedHashMap();
            c4618422 = c461842;
            b = bConsumeNextToken;
            deepRecursive32 = deepRecursive3;
            if (jsonTreeReader.lexer.canConsumeValue()) {
            }
            if (b == 6) {
            }
            return new JsonElement6(linkedHashMap);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str = (String) c461842.L$3;
        linkedHashMap = (LinkedHashMap) c461842.L$2;
        jsonTreeReader = (JsonTreeReader) c461842.L$1;
        DeepRecursive3 deepRecursive33 = (DeepRecursive3) c461842.L$0;
        ResultKt.throwOnFailure(obj);
        linkedHashMap.put(str, (JsonElement) obj);
        byte bConsumeNextToken2 = jsonTreeReader.lexer.consumeNextToken();
        if (bConsumeNextToken2 == 4) {
            if (bConsumeNextToken2 != 7) {
                JsonReader.fail$default(jsonTreeReader.lexer, "Expected end of the object or comma", 0, null, 6, null);
                throw new ExceptionsH();
            }
            b = bConsumeNextToken2;
            if (b == 6) {
                jsonTreeReader.lexer.consumeNextToken((byte) 7);
            } else if (b == 4) {
                if (!jsonTreeReader.trailingCommaAllowed) {
                    JsonExceptions4.invalidTrailingComma$default(jsonTreeReader.lexer, null, 1, null);
                    throw new ExceptionsH();
                }
                jsonTreeReader.lexer.consumeNextToken((byte) 7);
            }
            return new JsonElement6(linkedHashMap);
        }
        c4618422 = c461842;
        b = bConsumeNextToken2;
        deepRecursive32 = deepRecursive33;
        if (jsonTreeReader.lexer.canConsumeValue()) {
            String strConsumeStringLenient = jsonTreeReader.isLenient ? jsonTreeReader.lexer.consumeStringLenient() : jsonTreeReader.lexer.consumeString();
            jsonTreeReader.lexer.consumeNextToken((byte) 5);
            Unit unit = Unit.INSTANCE;
            c4618422.L$0 = deepRecursive32;
            c4618422.L$1 = jsonTreeReader;
            c4618422.L$2 = linkedHashMap;
            c4618422.L$3 = strConsumeStringLenient;
            c4618422.label = 1;
            Object objCallRecursive = deepRecursive32.callRecursive(unit, c4618422);
            if (objCallRecursive == coroutine_suspended) {
                return coroutine_suspended;
            }
            deepRecursive33 = deepRecursive32;
            obj = objCallRecursive;
            C461842 c4618423 = c4618422;
            str = strConsumeStringLenient;
            c461842 = c4618423;
            linkedHashMap.put(str, (JsonElement) obj);
            byte bConsumeNextToken22 = jsonTreeReader.lexer.consumeNextToken();
            if (bConsumeNextToken22 == 4) {
            }
        }
        if (b == 6) {
        }
        return new JsonElement6(linkedHashMap);
    }

    private final JsonElement readObject() {
        byte bConsumeNextToken = this.lexer.consumeNextToken((byte) 6);
        if (this.lexer.peekNextToken() == 4) {
            JsonReader.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
            throw new ExceptionsH();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            if (!this.lexer.canConsumeValue()) {
                break;
            }
            String strConsumeStringLenient = this.isLenient ? this.lexer.consumeStringLenient() : this.lexer.consumeString();
            this.lexer.consumeNextToken((byte) 5);
            linkedHashMap.put(strConsumeStringLenient, read());
            bConsumeNextToken = this.lexer.consumeNextToken();
            if (bConsumeNextToken != 4) {
                if (bConsumeNextToken != 7) {
                    JsonReader.fail$default(this.lexer, "Expected end of the object or comma", 0, null, 6, null);
                    throw new ExceptionsH();
                }
            }
        }
        if (bConsumeNextToken == 6) {
            this.lexer.consumeNextToken((byte) 7);
        } else if (bConsumeNextToken == 4) {
            if (!this.trailingCommaAllowed) {
                JsonExceptions4.invalidTrailingComma$default(this.lexer, null, 1, null);
                throw new ExceptionsH();
            }
            this.lexer.consumeNextToken((byte) 7);
        }
        return new JsonElement6(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonElement readArray() {
        byte bConsumeNextToken = this.lexer.consumeNextToken();
        if (this.lexer.peekNextToken() == 4) {
            JsonReader.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
            throw new ExceptionsH();
        }
        ArrayList arrayList = new ArrayList();
        while (this.lexer.canConsumeValue()) {
            arrayList.add(read());
            bConsumeNextToken = this.lexer.consumeNextToken();
            if (bConsumeNextToken != 4) {
                JsonReader jsonReader = this.lexer;
                boolean z = bConsumeNextToken == 9;
                int i = jsonReader.currentPosition;
                if (!z) {
                    JsonReader.fail$default(jsonReader, "Expected end of the array or comma", i, null, 4, null);
                    throw new ExceptionsH();
                }
            }
        }
        if (bConsumeNextToken == 8) {
            this.lexer.consumeNextToken((byte) 9);
        } else if (bConsumeNextToken == 4) {
            if (!this.trailingCommaAllowed) {
                JsonExceptions4.invalidTrailingComma(this.lexer, ResourceTypes.ARRAY);
                throw new ExceptionsH();
            }
            this.lexer.consumeNextToken((byte) 9);
        }
        return new JsonElement2(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonElement7 readValue(boolean isString) {
        String strConsumeStringLenient;
        if (this.isLenient || !isString) {
            strConsumeStringLenient = this.lexer.consumeStringLenient();
        } else {
            strConsumeStringLenient = this.lexer.consumeString();
        }
        String str = strConsumeStringLenient;
        return (isString || !Intrinsics.areEqual(str, "null")) ? new JsonElement4(str, isString, null, 4, null) : JsonElement5.INSTANCE;
    }

    public final JsonElement read() {
        JsonElement object;
        byte bPeekNextToken = this.lexer.peekNextToken();
        if (bPeekNextToken == 1) {
            return readValue(true);
        }
        if (bPeekNextToken == 0) {
            return readValue(false);
        }
        if (bPeekNextToken == 6) {
            int i = this.stackDepth + 1;
            this.stackDepth = i;
            if (i == 200) {
                object = readDeepRecursive();
            } else {
                object = readObject();
            }
            this.stackDepth--;
            return object;
        }
        if (bPeekNextToken == 8) {
            return readArray();
        }
        JsonReader.fail$default(this.lexer, "Cannot read Json element because of unexpected " + AbstractJsonLexer2.tokenDescription(bPeekNextToken), 0, null, 6, null);
        throw new ExceptionsH();
    }

    /* compiled from: JsonTreeReader.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/serialization/json/JsonElement;", "Lkotlin/DeepRecursiveScope;", "", "it"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", m3645f = "JsonTreeReader.kt", m3646l = {115}, m3647m = "invokeSuspend")
    /* renamed from: kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1 */
    static final class C461831 extends ContinuationImpl5 implements Function3<DeepRecursive3<Unit, JsonElement>, Unit, Continuation<? super JsonElement>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C461831(Continuation<? super C461831> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(DeepRecursive3<Unit, JsonElement> deepRecursive3, Unit unit, Continuation<? super JsonElement> continuation) {
            C461831 c461831 = JsonTreeReader.this.new C461831(continuation);
            c461831.L$0 = deepRecursive3;
            return c461831.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeepRecursive3 deepRecursive3 = (DeepRecursive3) this.L$0;
                byte bPeekNextToken = JsonTreeReader.this.lexer.peekNextToken();
                if (bPeekNextToken == 1) {
                    return JsonTreeReader.this.readValue(true);
                }
                if (bPeekNextToken == 0) {
                    return JsonTreeReader.this.readValue(false);
                }
                if (bPeekNextToken != 6) {
                    if (bPeekNextToken == 8) {
                        return JsonTreeReader.this.readArray();
                    }
                    JsonReader.fail$default(JsonTreeReader.this.lexer, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new ExceptionsH();
                }
                JsonTreeReader jsonTreeReader = JsonTreeReader.this;
                this.label = 1;
                obj = jsonTreeReader.readObject(deepRecursive3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (JsonElement) obj;
        }
    }

    private final JsonElement readDeepRecursive() {
        return (JsonElement) DeepRecursive2.invoke(new DeepRecursive(new C461831(null)), Unit.INSTANCE);
    }
}
