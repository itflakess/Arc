package io.anuke.arc.backends.android.surfaceview;

import io.anuke.arc.input.*;

public class AndroidInputMap{

    static KeyCode getKeyCode(int key){
        switch(key){
            case -1: return KeyCode.ANY_KEY;
            case 7: return KeyCode.NUM_0;
            case 8: return KeyCode.NUM_1;
            case 9: return KeyCode.NUM_2;
            case 10: return KeyCode.NUM_3;
            case 11: return KeyCode.NUM_4;
            case 12: return KeyCode.NUM_5;
            case 13: return KeyCode.NUM_6;
            case 14: return KeyCode.NUM_7;
            case 15: return KeyCode.NUM_8;
            case 16: return KeyCode.NUM_9;
            case 29: return KeyCode.A;
            case 57: return KeyCode.ALT_LEFT;
            case 58: return KeyCode.ALT_RIGHT;
            case 75: return KeyCode.APOSTROPHE;
            case 77: return KeyCode.AT;
            case 30: return KeyCode.B;
            case 4: return KeyCode.BACK;
            case 73: return KeyCode.BACKSLASH;
            case 31: return KeyCode.C;
            case 5: return KeyCode.CALL;
            case 27: return KeyCode.CAMERA;
            case 28: return KeyCode.CLEAR;
            case 55: return KeyCode.COMMA;
            case 32: return KeyCode.D;
            case 67: return KeyCode.BACKSPACE;
            case 112: return KeyCode.FORWARD_DEL;
            case 23: return KeyCode.CENTER;
            case 20: return KeyCode.DOWN;
            case 21: return KeyCode.LEFT;
            case 22: return KeyCode.RIGHT;
            case 19: return KeyCode.UP;
            case 33: return KeyCode.E;
            case 6: return KeyCode.ENDCALL;
            case 66: return KeyCode.ENTER;
            case 65: return KeyCode.ENVELOPE;
            case 70: return KeyCode.EQUALS;
            case 34: return KeyCode.F;
            case 80: return KeyCode.FOCUS;
            case 35: return KeyCode.G;
            case 68: return KeyCode.BACKTICK;
            case 36: return KeyCode.H;
            case 79: return KeyCode.HEADSETHOOK;
            case 3: return KeyCode.HOME;
            case 37: return KeyCode.I;
            case 38: return KeyCode.J;
            case 39: return KeyCode.K;
            case 40: return KeyCode.L;
            case 71: return KeyCode.LEFT_BRACKET;
            case 41: return KeyCode.M;
            case 90: return KeyCode.MEDIA_FAST_FORWARD;
            case 87: return KeyCode.MEDIA_NEXT;
            case 85: return KeyCode.MEDIA_PLAY_PAUSE;
            case 88: return KeyCode.MEDIA_PREVIOUS;
            case 89: return KeyCode.MEDIA_REWIND;
            case 86: return KeyCode.MEDIA_STOP;
            case 82: return KeyCode.MENU;
            case 69: return KeyCode.MINUS;
            case 91: return KeyCode.MUTE;
            case 42: return KeyCode.N;
            case 83: return KeyCode.NOTIFICATION;
            case 78: return KeyCode.NUM;
            case 43: return KeyCode.O;
            case 44: return KeyCode.P;
            case 56: return KeyCode.PERIOD;
            case 81: return KeyCode.PLUS;
            case 18: return KeyCode.POUND;
            case 26: return KeyCode.POWER;
            case 45: return KeyCode.Q;
            case 46: return KeyCode.R;
            case 72: return KeyCode.RIGHT_BRACKET;
            case 47: return KeyCode.S;
            case 84: return KeyCode.SEARCH;
            case 74: return KeyCode.SEMICOLON;
            case 59: return KeyCode.SHIFT_LEFT;
            case 60: return KeyCode.SHIFT_RIGHT;
            case 76: return KeyCode.SLASH;
            case 1: return KeyCode.SOFT_LEFT;
            case 2: return KeyCode.SOFT_RIGHT;
            case 62: return KeyCode.SPACE;
            case 17: return KeyCode.STAR;
            case 63: return KeyCode.SYM;
            case 48: return KeyCode.T;
            case 61: return KeyCode.TAB;
            case 49: return KeyCode.U;
            case 0: return KeyCode.UNKNOWN;
            case 50: return KeyCode.V;
            case 25: return KeyCode.VOLUME_DOWN;
            case 24: return KeyCode.VOLUME_UP;
            case 51: return KeyCode.W;
            case 52: return KeyCode.X;
            case 53: return KeyCode.Y;
            case 54: return KeyCode.Z;
            case 64: return KeyCode.META_SHIFT_LEFT_ON;
            case 128: return KeyCode.META_SHIFT_RIGHT_ON;
            case 129: return KeyCode.CONTROL_LEFT;
            case 130: return KeyCode.CONTROL_RIGHT;
            case 131: return KeyCode.ESCAPE;
            case 132: return KeyCode.END;
            case 133: return KeyCode.INSERT;
            case 92: return KeyCode.PAGE_UP;
            case 93: return KeyCode.PAGE_DOWN;
            case 94: return KeyCode.PICTSYMBOLS;
            case 95: return KeyCode.SWITCH_CHARSET;
            case 255: return KeyCode.BUTTON_CIRCLE;
            case 96: return KeyCode.BUTTON_A;
            case 97: return KeyCode.BUTTON_B;
            case 98: return KeyCode.BUTTON_C;
            case 99: return KeyCode.BUTTON_X;
            case 100: return KeyCode.BUTTON_Y;
            case 101: return KeyCode.BUTTON_Z;
            case 102: return KeyCode.BUTTON_L1;
            case 103: return KeyCode.BUTTON_R1;
            case 104: return KeyCode.BUTTON_L2;
            case 105: return KeyCode.BUTTON_R2;
            case 106: return KeyCode.BUTTON_THUMBL;
            case 107: return KeyCode.BUTTON_THUMBR;
            case 108: return KeyCode.BUTTON_START;
            case 109: return KeyCode.BUTTON_SELECT;
            case 110: return KeyCode.BUTTON_MODE;
            case 144: return KeyCode.NUMPAD_0;
            case 145: return KeyCode.NUMPAD_1;
            case 146: return KeyCode.NUMPAD_2;
            case 147: return KeyCode.NUMPAD_3;
            case 148: return KeyCode.NUMPAD_4;
            case 149: return KeyCode.NUMPAD_5;
            case 150: return KeyCode.NUMPAD_6;
            case 151: return KeyCode.NUMPAD_7;
            case 152: return KeyCode.NUMPAD_8;
            case 153: return KeyCode.NUMPAD_9;
            case 243: return KeyCode.COLON;
            case 244: return KeyCode.F1;
            case 245: return KeyCode.F2;
            case 246: return KeyCode.F3;
            case 247: return KeyCode.F4;
            case 248: return KeyCode.F5;
            case 249: return KeyCode.F6;
            case 250: return KeyCode.F7;
            case 251: return KeyCode.F8;
            case 252: return KeyCode.F9;
            case 253: return KeyCode.F10;
            case 254: return KeyCode.F11;
            default: return KeyCode.UNKNOWN;
        }
    }
}
