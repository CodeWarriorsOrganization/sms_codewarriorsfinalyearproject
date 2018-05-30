package com.codewarriors.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.codewarriors.entities.Player;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import com.codewarriors.entities.Player;

@Controller
public class GameController {
	private static final Logger logger = LoggerFactory.getLogger(GameController.class);

	private Player player;
	@RequestMapping("/")
	public String hello() {
		return "index";
		
	}
	
	/*@RequestMapping(value="waitingScreen", method=RequestMethod.POST)
	public String loginUser(Player player){
	return "waitingScreen";
	}
*/
	
	

	/*@RequestMapping(value="/waitingScreen" , method=RequestMethod.POST)
	public String  loginUser(@RequestParam(required=false,name="playerName")String name ){
		
		player.setPlayerName(name);
		return "waitingScreen";
		*/
	@RequestMapping(value ="/waitingScreen", method = RequestMethod.POST)
    public String result(@ModelAttribute("txtGetName")String name,
                     BindingResult result,
                     Model model){
       
        if(result.hasErrors())
        {
            return "index";
        }
        else
        {
           model.addAttribute("txtGetName",name);
          // player.setPlayerName(name);
           return "waitingScreen";
        }
    }
	

}
