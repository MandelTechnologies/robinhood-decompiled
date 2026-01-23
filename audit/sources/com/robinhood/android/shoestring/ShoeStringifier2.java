package com.robinhood.android.shoestring;

import com.robinhood.android.shoestring.ShoeStringifier;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequenceBuilder2;

/* compiled from: ShoeStringifier.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lcom/robinhood/android/shoestring/ShoeStringifier$Token;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.shoestring.ShoeStringifier$tokenize$1", m3645f = "ShoeStringifier.kt", m3646l = {88, 89, 95, 96, 101, 102, 107, 108, 116, 118}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.shoestring.ShoeStringifier$tokenize$1, reason: use source file name */
/* loaded from: classes5.dex */
final class ShoeStringifier2 extends ContinuationImpl5 implements Function2<SequenceBuilder2<? super ShoeStringifier.Token>, Continuation<? super Unit>, Object> {
    final /* synthetic */ CharSequence $this_tokenize;
    int I$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShoeStringifier2(CharSequence charSequence, Continuation<? super ShoeStringifier2> continuation) {
        super(2, continuation);
        this.$this_tokenize = charSequence;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShoeStringifier2 shoeStringifier2 = new ShoeStringifier2(this.$this_tokenize, continuation);
        shoeStringifier2.L$0 = obj;
        return shoeStringifier2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceBuilder2<? super ShoeStringifier.Token> sequenceBuilder2, Continuation<? super Unit> continuation) {
        return ((ShoeStringifier2) create(sequenceBuilder2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b2, code lost:
    
        if (r10.yield(r7, r9) == r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c3, code lost:
    
        if (r6.yield(r10, r9) == r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ea, code lost:
    
        if (r10.yield(r7, r9) == r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fc, code lost:
    
        if (r6.yield(r10, r9) == r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0120, code lost:
    
        if (r10.yield(r7, r9) == r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0132, code lost:
    
        if (r6.yield(r10, r9) != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0159, code lost:
    
        if (r10.yield(r7, r9) == r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x016b, code lost:
    
        if (r6.yield(r10, r9) == r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a2, code lost:
    
        if (r10.yield(r1, r9) == r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a4, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00c7 -> B:32:0x00c9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0132 -> B:11:0x0041). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x016b -> B:11:0x0041). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SequenceBuilder2 sequenceBuilder2;
        int i;
        int i2;
        SequenceBuilder2 sequenceBuilder22;
        SequenceBuilder2 sequenceBuilder23;
        SequenceBuilder2 sequenceBuilder24;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                sequenceBuilder2 = (SequenceBuilder2) this.L$0;
                i = 0;
                i2 = 0;
                while (true) {
                    if (i >= this.$this_tokenize.length()) {
                        if (i2 != i) {
                            CharSequence charSequence = this.$this_tokenize;
                            ShoeStringifier.Token.Text text = new ShoeStringifier.Token.Text(charSequence.subSequence(i2, charSequence.length()));
                            this.L$0 = sequenceBuilder2;
                            this.label = 9;
                            if (sequenceBuilder2.yield(text, this) != coroutine_suspended) {
                                sequenceBuilder24 = sequenceBuilder2;
                                break;
                            }
                        }
                    } else {
                        CharSequence charSequenceNextThree = ShoeStringifier.INSTANCE.nextThree(this.$this_tokenize, i);
                        if (!Intrinsics.areEqual(charSequenceNextThree, "{{/")) {
                            if (Intrinsics.areEqual(charSequenceNextThree, "/}}")) {
                                if (i2 != i) {
                                    ShoeStringifier.Token.Text text2 = new ShoeStringifier.Token.Text(this.$this_tokenize.subSequence(i2, i));
                                    this.L$0 = sequenceBuilder2;
                                    this.I$0 = i;
                                    this.label = 3;
                                    break;
                                }
                                sequenceBuilder22 = sequenceBuilder2;
                                break;
                            } else if (!kotlin.text.StringsKt.startsWith$default(charSequenceNextThree, (CharSequence) "{{", false, 2, (Object) null)) {
                                if (kotlin.text.StringsKt.startsWith$default(charSequenceNextThree, (CharSequence) "}}", false, 2, (Object) null)) {
                                    if (i2 != i) {
                                        ShoeStringifier.Token.Text text3 = new ShoeStringifier.Token.Text(this.$this_tokenize.subSequence(i2, i));
                                        this.L$0 = sequenceBuilder2;
                                        this.I$0 = i;
                                        this.label = 7;
                                        break;
                                    }
                                    sequenceBuilder23 = sequenceBuilder2;
                                    break;
                                } else {
                                    boxing.boxInt(i);
                                    i++;
                                }
                            } else {
                                if (i2 != i) {
                                    ShoeStringifier.Token.Text text4 = new ShoeStringifier.Token.Text(this.$this_tokenize.subSequence(i2, i));
                                    this.L$0 = sequenceBuilder2;
                                    this.I$0 = i;
                                    this.label = 5;
                                    break;
                                }
                                sequenceBuilder23 = sequenceBuilder2;
                            }
                        } else {
                            if (i2 != i) {
                                ShoeStringifier.Token.Text text5 = new ShoeStringifier.Token.Text(this.$this_tokenize.subSequence(i2, i));
                                this.L$0 = sequenceBuilder2;
                                this.I$0 = i;
                                this.label = 1;
                                break;
                            }
                            sequenceBuilder22 = sequenceBuilder2;
                            break;
                        }
                    }
                }
                ShoeStringifier.Token.Opener.TagOpener tagOpener = ShoeStringifier.Token.Opener.TagOpener.INSTANCE;
                this.L$0 = sequenceBuilder23;
                this.I$0 = i;
                this.label = 6;
                break;
            case 1:
                i = this.I$0;
                sequenceBuilder22 = (SequenceBuilder2) this.L$0;
                ResultKt.throwOnFailure(obj);
                ShoeStringifier.Token.Opener.ClosingTagOpener closingTagOpener = ShoeStringifier.Token.Opener.ClosingTagOpener.INSTANCE;
                this.L$0 = sequenceBuilder22;
                this.I$0 = i;
                this.label = 2;
                break;
            case 2:
                i = this.I$0;
                sequenceBuilder22 = (SequenceBuilder2) this.L$0;
                ResultKt.throwOnFailure(obj);
                sequenceBuilder2 = sequenceBuilder22;
                i2 = i + 3;
                i = i2;
                while (true) {
                    if (i >= this.$this_tokenize.length()) {
                    }
                    boxing.boxInt(i);
                    i++;
                }
                ShoeStringifier.Token.Opener.TagOpener tagOpener2 = ShoeStringifier.Token.Opener.TagOpener.INSTANCE;
                this.L$0 = sequenceBuilder23;
                this.I$0 = i;
                this.label = 6;
                break;
            case 3:
                i = this.I$0;
                sequenceBuilder22 = (SequenceBuilder2) this.L$0;
                ResultKt.throwOnFailure(obj);
                ShoeStringifier.Token.Closer.ClosingTagCloser closingTagCloser = ShoeStringifier.Token.Closer.ClosingTagCloser.INSTANCE;
                this.L$0 = sequenceBuilder22;
                this.I$0 = i;
                this.label = 4;
                break;
            case 4:
                i = this.I$0;
                sequenceBuilder22 = (SequenceBuilder2) this.L$0;
                ResultKt.throwOnFailure(obj);
                sequenceBuilder2 = sequenceBuilder22;
                i2 = i + 3;
                i = i2;
                while (true) {
                    if (i >= this.$this_tokenize.length()) {
                    }
                    boxing.boxInt(i);
                    i++;
                }
                ShoeStringifier.Token.Opener.TagOpener tagOpener22 = ShoeStringifier.Token.Opener.TagOpener.INSTANCE;
                this.L$0 = sequenceBuilder23;
                this.I$0 = i;
                this.label = 6;
                break;
            case 5:
                i = this.I$0;
                sequenceBuilder23 = (SequenceBuilder2) this.L$0;
                ResultKt.throwOnFailure(obj);
                ShoeStringifier.Token.Opener.TagOpener tagOpener222 = ShoeStringifier.Token.Opener.TagOpener.INSTANCE;
                this.L$0 = sequenceBuilder23;
                this.I$0 = i;
                this.label = 6;
                break;
            case 6:
                i = this.I$0;
                sequenceBuilder23 = (SequenceBuilder2) this.L$0;
                ResultKt.throwOnFailure(obj);
                sequenceBuilder2 = sequenceBuilder23;
                i2 = i + 2;
                i = i2;
                while (true) {
                    if (i >= this.$this_tokenize.length()) {
                    }
                    boxing.boxInt(i);
                    i++;
                }
                ShoeStringifier.Token.Opener.TagOpener tagOpener2222 = ShoeStringifier.Token.Opener.TagOpener.INSTANCE;
                this.L$0 = sequenceBuilder23;
                this.I$0 = i;
                this.label = 6;
                break;
            case 7:
                i = this.I$0;
                sequenceBuilder23 = (SequenceBuilder2) this.L$0;
                ResultKt.throwOnFailure(obj);
                ShoeStringifier.Token.Closer.TagCloser tagCloser = ShoeStringifier.Token.Closer.TagCloser.INSTANCE;
                this.L$0 = sequenceBuilder23;
                this.I$0 = i;
                this.label = 8;
                break;
            case 8:
                i = this.I$0;
                sequenceBuilder23 = (SequenceBuilder2) this.L$0;
                ResultKt.throwOnFailure(obj);
                sequenceBuilder2 = sequenceBuilder23;
                i2 = i + 2;
                i = i2;
                while (true) {
                    if (i >= this.$this_tokenize.length()) {
                    }
                    boxing.boxInt(i);
                    i++;
                }
                ShoeStringifier.Token.Opener.TagOpener tagOpener22222 = ShoeStringifier.Token.Opener.TagOpener.INSTANCE;
                this.L$0 = sequenceBuilder23;
                this.I$0 = i;
                this.label = 6;
                break;
            case 9:
                sequenceBuilder24 = (SequenceBuilder2) this.L$0;
                ResultKt.throwOnFailure(obj);
                sequenceBuilder2 = sequenceBuilder24;
                ShoeStringifier.Token.End end = ShoeStringifier.Token.End.INSTANCE;
                this.L$0 = null;
                this.label = 10;
                break;
            case 10:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
