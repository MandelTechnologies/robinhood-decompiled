package com.truelayer.payments.p419ui.screens.formflows;

import androidx.compose.runtime.Composer;
import com.truelayer.payments.p419ui.components.inputs.form.models.Field;
import com.truelayer.payments.p419ui.components.inputs.form.models.Fields4;
import com.truelayer.payments.p419ui.utils.Navigation4;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FormFlowScreen.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\r\u000e\u000f\u0010R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t\u0082\u0001\u0004\u0011\u0012\u0013\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/formflows/FormFlowScreen;", "Lcom/truelayer/payments/ui/utils/NavigationRoute;", "", "getTitle", "()Ljava/lang/String;", "title", "Lkotlin/Function0;", "", "getHeader", "()Lkotlin/jvm/functions/Function2;", "header", "getFooter", Footer.f10637type, "Empty", "Form", "RadioSelect", "Select", "Lcom/truelayer/payments/ui/screens/formflows/FormFlowScreen$Empty;", "Lcom/truelayer/payments/ui/screens/formflows/FormFlowScreen$Form;", "Lcom/truelayer/payments/ui/screens/formflows/FormFlowScreen$RadioSelect;", "Lcom/truelayer/payments/ui/screens/formflows/FormFlowScreen$Select;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface FormFlowScreen extends Navigation4 {
    Function2<Composer, Integer, Unit> getFooter();

    Function2<Composer, Integer, Unit> getHeader();

    String getTitle();

    /* compiled from: FormFlowScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static boolean hasPermission(FormFlowScreen formFlowScreen) {
            return Navigation4.DefaultImpls.hasPermission(formFlowScreen);
        }
    }

    /* compiled from: FormFlowScreen.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JT\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u000eR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0011R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b%\u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010\u0014¨\u0006("}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/formflows/FormFlowScreen$Select;", "Lcom/truelayer/payments/ui/screens/formflows/FormFlowScreen;", "", "title", "hint", "Lkotlin/Function0;", "", "header", Footer.f10637type, "Lcom/truelayer/payments/ui/components/inputs/form/models/SelectField;", "input", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lcom/truelayer/payments/ui/components/inputs/form/models/SelectField;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lkotlin/jvm/functions/Function2;", "component4", "component5", "()Lcom/truelayer/payments/ui/components/inputs/form/models/SelectField;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lcom/truelayer/payments/ui/components/inputs/form/models/SelectField;)Lcom/truelayer/payments/ui/screens/formflows/FormFlowScreen$Select;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getHint", "Lkotlin/jvm/functions/Function2;", "getHeader", "getFooter", "Lcom/truelayer/payments/ui/components/inputs/form/models/SelectField;", "getInput", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Select implements FormFlowScreen {
        public static final int $stable = 8;
        private final Function2<Composer, Integer, Unit> footer;
        private final Function2<Composer, Integer, Unit> header;
        private final String hint;
        private final Fields4 input;
        private final String title;

        public static /* synthetic */ Select copy$default(Select select, String str, String str2, Function2 function2, Function2 function22, Fields4 fields4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = select.title;
            }
            if ((i & 2) != 0) {
                str2 = select.hint;
            }
            if ((i & 4) != 0) {
                function2 = select.header;
            }
            if ((i & 8) != 0) {
                function22 = select.footer;
            }
            if ((i & 16) != 0) {
                fields4 = select.input;
            }
            Fields4 fields42 = fields4;
            Function2 function23 = function2;
            return select.copy(str, str2, function23, function22, fields42);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getHint() {
            return this.hint;
        }

        public final Function2<Composer, Integer, Unit> component3() {
            return this.header;
        }

        public final Function2<Composer, Integer, Unit> component4() {
            return this.footer;
        }

        /* renamed from: component5, reason: from getter */
        public final Fields4 getInput() {
            return this.input;
        }

        public final Select copy(String title, String hint, Function2<? super Composer, ? super Integer, Unit> header, Function2<? super Composer, ? super Integer, Unit> footer, Fields4 input) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(input, "input");
            return new Select(title, hint, header, footer, input);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Select)) {
                return false;
            }
            Select select = (Select) other;
            return Intrinsics.areEqual(this.title, select.title) && Intrinsics.areEqual(this.hint, select.hint) && Intrinsics.areEqual(this.header, select.header) && Intrinsics.areEqual(this.footer, select.footer) && Intrinsics.areEqual(this.input, select.input);
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.hint;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Function2<Composer, Integer, Unit> function2 = this.header;
            int iHashCode3 = (iHashCode2 + (function2 == null ? 0 : function2.hashCode())) * 31;
            Function2<Composer, Integer, Unit> function22 = this.footer;
            return ((iHashCode3 + (function22 != null ? function22.hashCode() : 0)) * 31) + this.input.hashCode();
        }

        public String toString() {
            return "Select(title=" + this.title + ", hint=" + this.hint + ", header=" + this.header + ", footer=" + this.footer + ", input=" + this.input + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Select(String title, String str, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Fields4 input) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(input, "input");
            this.title = title;
            this.hint = str;
            this.header = function2;
            this.footer = function22;
            this.input = input;
        }

        public /* synthetic */ Select(String str, String str2, Function2 function2, Function2 function22, Fields4 fields4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? ComposableSingletons$FormFlowScreenKt.INSTANCE.m27104getLambda1$payments_ui_release() : function2, (i & 8) != 0 ? ComposableSingletons$FormFlowScreenKt.INSTANCE.m27105getLambda2$payments_ui_release() : function22, fields4);
        }

        @Override // com.truelayer.payments.p419ui.utils.Navigation4
        public boolean hasPermission() {
            return DefaultImpls.hasPermission(this);
        }

        @Override // com.truelayer.payments.p419ui.screens.formflows.FormFlowScreen
        public String getTitle() {
            return this.title;
        }

        public final String getHint() {
            return this.hint;
        }

        @Override // com.truelayer.payments.p419ui.screens.formflows.FormFlowScreen
        public Function2<Composer, Integer, Unit> getHeader() {
            return this.header;
        }

        @Override // com.truelayer.payments.p419ui.screens.formflows.FormFlowScreen
        public Function2<Composer, Integer, Unit> getFooter() {
            return this.footer;
        }

        public final Fields4 getInput() {
            return this.input;
        }
    }

    /* compiled from: FormFlowScreen.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JH\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u000fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b\"\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0012¨\u0006%"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/formflows/FormFlowScreen$RadioSelect;", "Lcom/truelayer/payments/ui/screens/formflows/FormFlowScreen;", "", "title", "Lkotlin/Function0;", "", "header", Footer.f10637type, "Lcom/truelayer/payments/ui/components/inputs/form/models/SelectField;", "input", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lcom/truelayer/payments/ui/components/inputs/form/models/SelectField;)V", "component1", "()Ljava/lang/String;", "component2", "()Lkotlin/jvm/functions/Function2;", "component3", "component4", "()Lcom/truelayer/payments/ui/components/inputs/form/models/SelectField;", "copy", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lcom/truelayer/payments/ui/components/inputs/form/models/SelectField;)Lcom/truelayer/payments/ui/screens/formflows/FormFlowScreen$RadioSelect;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lkotlin/jvm/functions/Function2;", "getHeader", "getFooter", "Lcom/truelayer/payments/ui/components/inputs/form/models/SelectField;", "getInput", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class RadioSelect implements FormFlowScreen {
        public static final int $stable = 8;
        private final Function2<Composer, Integer, Unit> footer;
        private final Function2<Composer, Integer, Unit> header;
        private final Fields4 input;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RadioSelect copy$default(RadioSelect radioSelect, String str, Function2 function2, Function2 function22, Fields4 fields4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = radioSelect.title;
            }
            if ((i & 2) != 0) {
                function2 = radioSelect.header;
            }
            if ((i & 4) != 0) {
                function22 = radioSelect.footer;
            }
            if ((i & 8) != 0) {
                fields4 = radioSelect.input;
            }
            return radioSelect.copy(str, function2, function22, fields4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final Function2<Composer, Integer, Unit> component2() {
            return this.header;
        }

        public final Function2<Composer, Integer, Unit> component3() {
            return this.footer;
        }

        /* renamed from: component4, reason: from getter */
        public final Fields4 getInput() {
            return this.input;
        }

        public final RadioSelect copy(String title, Function2<? super Composer, ? super Integer, Unit> header, Function2<? super Composer, ? super Integer, Unit> footer, Fields4 input) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(input, "input");
            return new RadioSelect(title, header, footer, input);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RadioSelect)) {
                return false;
            }
            RadioSelect radioSelect = (RadioSelect) other;
            return Intrinsics.areEqual(this.title, radioSelect.title) && Intrinsics.areEqual(this.header, radioSelect.header) && Intrinsics.areEqual(this.footer, radioSelect.footer) && Intrinsics.areEqual(this.input, radioSelect.input);
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            Function2<Composer, Integer, Unit> function2 = this.header;
            int iHashCode2 = (iHashCode + (function2 == null ? 0 : function2.hashCode())) * 31;
            Function2<Composer, Integer, Unit> function22 = this.footer;
            return ((iHashCode2 + (function22 != null ? function22.hashCode() : 0)) * 31) + this.input.hashCode();
        }

        public String toString() {
            return "RadioSelect(title=" + this.title + ", header=" + this.header + ", footer=" + this.footer + ", input=" + this.input + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RadioSelect(String title, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Fields4 input) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(input, "input");
            this.title = title;
            this.header = function2;
            this.footer = function22;
            this.input = input;
        }

        public /* synthetic */ RadioSelect(String str, Function2 function2, Function2 function22, Fields4 fields4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? ComposableSingletons$FormFlowScreenKt.INSTANCE.m27106getLambda3$payments_ui_release() : function2, (i & 4) != 0 ? ComposableSingletons$FormFlowScreenKt.INSTANCE.m27107getLambda4$payments_ui_release() : function22, fields4);
        }

        @Override // com.truelayer.payments.p419ui.utils.Navigation4
        public boolean hasPermission() {
            return DefaultImpls.hasPermission(this);
        }

        @Override // com.truelayer.payments.p419ui.screens.formflows.FormFlowScreen
        public String getTitle() {
            return this.title;
        }

        @Override // com.truelayer.payments.p419ui.screens.formflows.FormFlowScreen
        public Function2<Composer, Integer, Unit> getHeader() {
            return this.header;
        }

        @Override // com.truelayer.payments.p419ui.screens.formflows.FormFlowScreen
        public Function2<Composer, Integer, Unit> getFooter() {
            return this.footer;
        }

        public final Fields4 getInput() {
            return this.input;
        }
    }

    /* compiled from: FormFlowScreen.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JN\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b#\u0010\u0010R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/formflows/FormFlowScreen$Form;", "Lcom/truelayer/payments/ui/screens/formflows/FormFlowScreen;", "", "title", "Lkotlin/Function0;", "", "header", Footer.f10637type, "", "Lcom/truelayer/payments/ui/components/inputs/form/models/Field;", "inputs", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lkotlin/jvm/functions/Function2;", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ljava/util/List;)Lcom/truelayer/payments/ui/screens/formflows/FormFlowScreen$Form;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lkotlin/jvm/functions/Function2;", "getHeader", "getFooter", "Ljava/util/List;", "getInputs", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Form implements FormFlowScreen {
        public static final int $stable = 8;
        private final Function2<Composer, Integer, Unit> footer;
        private final Function2<Composer, Integer, Unit> header;
        private final List<Field> inputs;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Form copy$default(Form form, String str, Function2 function2, Function2 function22, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = form.title;
            }
            if ((i & 2) != 0) {
                function2 = form.header;
            }
            if ((i & 4) != 0) {
                function22 = form.footer;
            }
            if ((i & 8) != 0) {
                list = form.inputs;
            }
            return form.copy(str, function2, function22, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final Function2<Composer, Integer, Unit> component2() {
            return this.header;
        }

        public final Function2<Composer, Integer, Unit> component3() {
            return this.footer;
        }

        public final List<Field> component4() {
            return this.inputs;
        }

        public final Form copy(String title, Function2<? super Composer, ? super Integer, Unit> header, Function2<? super Composer, ? super Integer, Unit> footer, List<? extends Field> inputs) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(inputs, "inputs");
            return new Form(title, header, footer, inputs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Form)) {
                return false;
            }
            Form form = (Form) other;
            return Intrinsics.areEqual(this.title, form.title) && Intrinsics.areEqual(this.header, form.header) && Intrinsics.areEqual(this.footer, form.footer) && Intrinsics.areEqual(this.inputs, form.inputs);
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            Function2<Composer, Integer, Unit> function2 = this.header;
            int iHashCode2 = (iHashCode + (function2 == null ? 0 : function2.hashCode())) * 31;
            Function2<Composer, Integer, Unit> function22 = this.footer;
            return ((iHashCode2 + (function22 != null ? function22.hashCode() : 0)) * 31) + this.inputs.hashCode();
        }

        public String toString() {
            return "Form(title=" + this.title + ", header=" + this.header + ", footer=" + this.footer + ", inputs=" + this.inputs + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Form(String title, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, List<? extends Field> inputs) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(inputs, "inputs");
            this.title = title;
            this.header = function2;
            this.footer = function22;
            this.inputs = inputs;
        }

        public /* synthetic */ Form(String str, Function2 function2, Function2 function22, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? ComposableSingletons$FormFlowScreenKt.INSTANCE.m27108getLambda5$payments_ui_release() : function2, (i & 4) != 0 ? ComposableSingletons$FormFlowScreenKt.INSTANCE.m27109getLambda6$payments_ui_release() : function22, list);
        }

        @Override // com.truelayer.payments.p419ui.utils.Navigation4
        public boolean hasPermission() {
            return DefaultImpls.hasPermission(this);
        }

        @Override // com.truelayer.payments.p419ui.screens.formflows.FormFlowScreen
        public String getTitle() {
            return this.title;
        }

        @Override // com.truelayer.payments.p419ui.screens.formflows.FormFlowScreen
        public Function2<Composer, Integer, Unit> getHeader() {
            return this.header;
        }

        @Override // com.truelayer.payments.p419ui.screens.formflows.FormFlowScreen
        public Function2<Composer, Integer, Unit> getFooter() {
            return this.footer;
        }

        public final List<Field> getInputs() {
            return this.inputs;
        }
    }

    /* compiled from: FormFlowScreen.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ>\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001e\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/formflows/FormFlowScreen$Empty;", "Lcom/truelayer/payments/ui/screens/formflows/FormFlowScreen;", "", "title", "Lkotlin/Function0;", "", "header", Footer.f10637type, "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "component1", "()Ljava/lang/String;", "component2", "()Lkotlin/jvm/functions/Function2;", "component3", "copy", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lcom/truelayer/payments/ui/screens/formflows/FormFlowScreen$Empty;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lkotlin/jvm/functions/Function2;", "getHeader", "getFooter", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Empty implements FormFlowScreen {
        public static final int $stable = 0;
        private final Function2<Composer, Integer, Unit> footer;
        private final Function2<Composer, Integer, Unit> header;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Empty copy$default(Empty empty, String str, Function2 function2, Function2 function22, int i, Object obj) {
            if ((i & 1) != 0) {
                str = empty.title;
            }
            if ((i & 2) != 0) {
                function2 = empty.header;
            }
            if ((i & 4) != 0) {
                function22 = empty.footer;
            }
            return empty.copy(str, function2, function22);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final Function2<Composer, Integer, Unit> component2() {
            return this.header;
        }

        public final Function2<Composer, Integer, Unit> component3() {
            return this.footer;
        }

        public final Empty copy(String title, Function2<? super Composer, ? super Integer, Unit> header, Function2<? super Composer, ? super Integer, Unit> footer) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new Empty(title, header, footer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Empty)) {
                return false;
            }
            Empty empty = (Empty) other;
            return Intrinsics.areEqual(this.title, empty.title) && Intrinsics.areEqual(this.header, empty.header) && Intrinsics.areEqual(this.footer, empty.footer);
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            Function2<Composer, Integer, Unit> function2 = this.header;
            int iHashCode2 = (iHashCode + (function2 == null ? 0 : function2.hashCode())) * 31;
            Function2<Composer, Integer, Unit> function22 = this.footer;
            return iHashCode2 + (function22 != null ? function22.hashCode() : 0);
        }

        public String toString() {
            return "Empty(title=" + this.title + ", header=" + this.header + ", footer=" + this.footer + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Empty(String title, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.header = function2;
            this.footer = function22;
        }

        public /* synthetic */ Empty(String str, Function2 function2, Function2 function22, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? ComposableSingletons$FormFlowScreenKt.INSTANCE.m27110getLambda7$payments_ui_release() : function2, (i & 4) != 0 ? ComposableSingletons$FormFlowScreenKt.INSTANCE.m27111getLambda8$payments_ui_release() : function22);
        }

        @Override // com.truelayer.payments.p419ui.utils.Navigation4
        public boolean hasPermission() {
            return DefaultImpls.hasPermission(this);
        }

        @Override // com.truelayer.payments.p419ui.screens.formflows.FormFlowScreen
        public String getTitle() {
            return this.title;
        }

        @Override // com.truelayer.payments.p419ui.screens.formflows.FormFlowScreen
        public Function2<Composer, Integer, Unit> getHeader() {
            return this.header;
        }

        @Override // com.truelayer.payments.p419ui.screens.formflows.FormFlowScreen
        public Function2<Composer, Integer, Unit> getFooter() {
            return this.footer;
        }
    }
}
